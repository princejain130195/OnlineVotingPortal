package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Constants.VoterConstants;
import Controller.Voter;

public class VoterDAO {
	
	//registering voting details
	public static void regVoterDetails(Voter voter) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voterinfo", "root", "root");
			Statement stmt = con.createStatement();
			String query = addingQueryForRegister(voter).toString();
			stmt.executeUpdate(query);
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean signInVoter(Voter voter) {
		boolean isEmailPassword = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voterinfo", "root", "root");
			String query = addingQueryForSignIn().toString();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, voter.getVoter_signin_userName());
			ps.setString(2, voter.getVoter_signin_password());
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				isEmailPassword = true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isEmailPassword;
	}

	private static StringBuffer addingQueryForSignIn() {
		StringBuffer query = new StringBuffer();
		query.append(VoterConstants.SELECT).append(VoterConstants.STAR).append(VoterConstants.FROM);
		query.append(VoterConstants.VOTER_TABLE);
		query.append(VoterConstants.WHERE);
		query.append(VoterConstants.USER_NAME).append(VoterConstants.EQUAL_PARAM);
		query.append(VoterConstants.AND);
		query.append(VoterConstants.PASSWORD).append(VoterConstants.EQUAL_PARAM);
		return query;
	}

	private static StringBuffer addingQueryForRegister(Voter voter) {
		StringBuffer query = new StringBuffer();
		if(voter != null) {
			query.append(VoterConstants.INSERT).append(VoterConstants.VOTER_TABLE).append(VoterConstants.VALUE);
			query.append(0).append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_firstName()).append("'").append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_lastName()).append("'").append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_fatherName()).append("'").append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_motherName()).append("'").append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_DOB()).append("'").append(VoterConstants.COMMA);
			query.append(voter.getVoter_gender()).append(VoterConstants.COMMA);
			query.append(1).append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_Addhar()).append("'").append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_userName()).append("'").append(VoterConstants.COMMA);
			query.append("'").append(voter.getVoter_password()).append("'").append(VoterConstants.COMMA);
			query.append("now()").append(VoterConstants.COMMA);
			query.append("now()");
			query.append(VoterConstants.CLOSE_BRACE);
		}
		
		return query;
	}

	

}
