package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

//spacific for number of voters and candidates
public class WidgetCountListVC {
	public static final String voterQuery = "select count(*) as count from tt_voter";
	public static final String candidateQuery = "select count(*) as count from tt_candidate";
	public static final String voterkey = "voter";
	public static final String candidatekey = "candidate";
	
	public static Map<String,Integer> doListVoterCandidates() {
		Map<String,Integer> list = new HashMap<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
			PreparedStatement ps = con.prepareStatement(voterQuery);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list.put(voterkey, rs.getInt("count"));
			}
			PreparedStatement ps1 = con.prepareStatement(candidateQuery);
			ResultSet rs1 = ps1.executeQuery();
			while(rs1.next()) {
				list.put(candidatekey, rs1.getInt("count"));
			}
			close(con, rs, rs1);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private static void close(Connection con, ResultSet rs, ResultSet rs1) {
		try {
			if (con != null)
				con.close();
			if (rs1 != null)
				rs1.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
