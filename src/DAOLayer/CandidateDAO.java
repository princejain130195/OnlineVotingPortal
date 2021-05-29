package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Constants.CandidateConstants;
import Controller.Candidate;
import Controller.Sign;

public class CandidateDAO {
	public static Sign sign = null;
	private static String query_signdata = "select sign_id, Name, isactive from tz_sign where isactive = 0"; 
	private static String query_isactive = "update tz_sign set isactive = 1 where sign_id = ?";

	public static Sign registerCandidate(Candidate candidate) {
		sign = new Sign();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
			Statement stmt = con.createStatement();
			//select the id, name from sign in
			PreparedStatement ps1 = con.prepareStatement(query_signdata);
			ResultSet rs = ps1.executeQuery();
			int count = 0;
			while (rs.next()) {
				if (count == 0) {
					sign.setId(rs.getInt(1));
					sign.setName(rs.getString(2));
					count++;
				}
			}
			//changing the isActive in tz_sign table
			PreparedStatement ps2 = con.prepareStatement(query_isactive);
			ps2.setInt(1, sign.getId());
			int i=ps2.executeUpdate(); //i mean It will show the affected rows
			System.out.println("Row Affected : " + i);
			
			String candidate_query = addingQueryForRegisterForCandidate(candidate).toString();
			String voter_query = addingQueryForRegisterForVoter(candidate).toString();
			stmt.executeUpdate(candidate_query);
			stmt.executeUpdate(voter_query);
			con.close();
			stmt.close();
		} catch (ClassNotFoundException e) {
			System.out.println(" " + e.getMessage());
		} catch (SQLException e) {
			System.out.println(" " + e.getMessage());
		} finally {
			
		}
		return sign;
	}

	//Candidate can have voter as well
	private static Object addingQueryForRegisterForVoter(Candidate candidate) {
		StringBuffer query = new StringBuffer();
		
		if(candidate != null) {
			query.append(CandidateConstants.INSERT).append(CandidateConstants.VOTER_TABLE).append(CandidateConstants.VALUE);
			query.append(0).append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_firstName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_lastName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_fatherName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_motherName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_DOB()).append("'").append(CandidateConstants.COMMA);
			query.append(candidate.getCandidate_gender()).append(CandidateConstants.COMMA);
			query.append(1).append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_Addhar()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_userName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_password()).append("'").append(CandidateConstants.COMMA);
			query.append("now()").append(CandidateConstants.COMMA);
			query.append("now()");
			query.append(CandidateConstants.CLOSE_BRACE);
		}
		return query;
	}

	private static StringBuffer addingQueryForRegisterForCandidate(Candidate candidate) {
		StringBuffer query = new StringBuffer();
		
		if(candidate != null) {
			query.append(CandidateConstants.INSERT).append(CandidateConstants.CANDIDATE_TABLE).append(CandidateConstants.VALUE);
			query.append(0).append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_firstName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_lastName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_fatherName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_motherName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_DOB()).append("'").append(CandidateConstants.COMMA);
			query.append(candidate.getCandidate_gender()).append(CandidateConstants.COMMA);
			query.append(sign.getId()).append(CandidateConstants.COMMA);
			query.append(1).append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_Addhar()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_userName()).append("'").append(CandidateConstants.COMMA);
			query.append("'").append(candidate.getCandidate_password()).append("'").append(CandidateConstants.COMMA);
			query.append("now()").append(CandidateConstants.COMMA);
			query.append("now()");
			query.append(CandidateConstants.CLOSE_BRACE);
		}
		return query;
	}

}
