package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.IsVoting;

public class IsVoting_DAO {

	private static String query_select = "select * from tz_isVoting";
	private static String query_Update = "update tz_isVoting set isActive = ?";
	
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
			con.close();
			stmt.close();
		}finally {
			close(con, stmt, ps, rs);
		} 
	}
	
	public static void doVote() throws Exception {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
			stmt = con.createStatement();
		}finally {
			close(con, stmt, ps, rs);
		}
		
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
}
