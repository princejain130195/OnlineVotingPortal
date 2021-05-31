package DAOLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Constants.CandidateConstants;
import Constants.VoterConstants;
import Controller.Candidate;
import Controller.Voter;

public class Admin_DAO {
	
	public static String query_voter = "select * from tt_voter order by id"; 
	public static String query_candidate = "select * from tt_candidate order by id";
	
	public List<Voter> getVoters() throws Exception {
		List<Voter> voters = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query_voter);
		try {

			while (rs.next()) {
				Voter voter = new Voter();
				voter.setVoter_id(rs.getInt(VoterConstants.ID));
				voter.setVoter_firstName(rs.getString(VoterConstants.FIRSTNAME));
				voter.setVoter_lastName(rs.getString(VoterConstants.LAST_NAME));
				voter.setVoter_fatherName(rs.getString(VoterConstants.FATHER_NAME));
				voter.setVoter_motherName(rs.getString(VoterConstants.MOTHER_NAME));
				voter.setVoter_DOB(rs.getString(VoterConstants.DOB));
				voter.setVoter_gender(rs.getInt(VoterConstants.GENDER));
				voter.setIsActive(rs.getInt(VoterConstants.ISACTIVE));
				voter.setVoter_Addhar(rs.getString(VoterConstants.ADDHAR_NUMBER));
				voter.setVoter_signin_userName(rs.getString(VoterConstants.USER_NAME));
				voters.add(voter);
			}
			return voters;
		} finally {
			close(con, stmt, rs);
		}
	}
	
	public List<Candidate> getCandidates() throws Exception {
		List<Candidate> candidates = new ArrayList<>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:5555/voterinfo", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query_candidate);
		try {

			while (rs.next()) {
				Candidate candidate = new Candidate();
				candidate.setId(rs.getInt(CandidateConstants.ID));
				candidate.setCandidate_firstName(rs.getString(CandidateConstants.FIRSTNAME));
				candidate.setCandidate_lastName(rs.getString(CandidateConstants.LAST_NAME));
				candidate.setCandidate_fatherName(rs.getString(CandidateConstants.FATHER_NAME));
				candidate.setCandidate_motherName(rs.getString(CandidateConstants.MOTHER_NAME));
				candidate.setCandidate_DOB(rs.getString(CandidateConstants.DOB));
				candidate.setCandidate_gender(rs.getInt(CandidateConstants.GENDER));
				candidate.setIsActive(rs.getInt(CandidateConstants.ISACTIVE));
				candidate.setCandidate_Addhar(rs.getString(CandidateConstants.ADDHAR_NUMBER));
				candidate.setCandidate_userName(rs.getString(CandidateConstants.USER_NAME));
				candidates.add(candidate);
			}
			return candidates;
		} finally {
			close(con, stmt, rs);
		}
	}

	private void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (con != null)
				con.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
