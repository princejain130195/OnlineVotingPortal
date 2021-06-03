package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Controller.IsVoting;
import Controller.Sign;

public class IsVoting_DAO {
	private static String query_getSign = "select sign_id, Name from tz_sign where isactive = 1";
	private static String query_select = "select * from tz_isVoting";
	private static String query_Update = "update tz_isVoting set isActive = ?";
	private static String query_doVoting = "";
	
	public static IsVoting getIsVoting() throws Exception {
		IsVoting isVoting = new IsVoting();
		Connection con = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
			stmt = con.createStatement();
			//select the id, name from sign in
			ps = con.prepareStatement(query_select);
			rs = ps.executeQuery();
			int count = 0;
			while (rs.next()) {
				if (count == 0) {
					isVoting.setIsActive(rs.getInt(1));
					count++;
				}
			}
			con.close();
			stmt.close();
		}finally {
			close(con, stmt, ps, rs);
		} 
		return isVoting;
	}
	
	public static void setIsVoting(int isChecked) throws Exception {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
			stmt = con.createStatement();
			//select the id, name from sign in
			ps = con.prepareStatement(query_Update);
			ps.setInt(1, isChecked);
			int i=ps.executeUpdate();
			System.out.println("Row Affected : " + i);
		}finally {
			close(con, stmt, ps, rs);
		} 
	}
	
	public static List<Sign> getSignInfo() throws Exception {
		Sign sign = null;
		List<Sign> signList = new ArrayList<>();
		Connection con = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
			stmt = con.createStatement();
			ps = con.prepareStatement(query_getSign);
			rs = ps.executeQuery();
			while(rs.next()) {
				sign = new Sign();
				sign.setId(rs.getInt("sign_id"));
				sign.setName(rs.getString("name"));
				signList.add(sign);
			}
		}finally {
			close(con, stmt, ps, rs);
		}
		return signList;
	}
	
	private static void close(Connection con, Statement stmt, PreparedStatement ps, ResultSet rs) {
		try {
			if (con != null)
				con.close();
			if (stmt != null)
				stmt.close();
			if (ps != null)
				ps.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void doVoting(int voterId, int signId) throws Exception {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int count = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
			stmt = con.createStatement();
			ps = con.prepareStatement("select voting_count from tt_candidate where sign_id = "+signId);
			rs = ps.executeQuery();
			while(rs.next()) {
				count = rs.getInt("voting_count");
			}
			PreparedStatement ps1 = con.prepareStatement("update tt_candidate set voting_count = "+ (++count) +" where sign_id =" +signId);
			ps1.executeUpdate();
			PreparedStatement ps2 = con.prepareStatement("update tt_voter set isActive = "+ 0 +" where id = "+voterId);
			ps2.executeUpdate();
		}finally {
			close(con, stmt, ps, rs);
		}
		
	}
}
