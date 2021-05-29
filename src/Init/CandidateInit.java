package Init;

import javax.servlet.http.HttpServletRequest;

import Constants.CandidateConstants;
import Controller.Candidate;

public class CandidateInit {

	public static Candidate initCandidate(HttpServletRequest req) {
		Candidate candidate = new Candidate();
		candidate.setHidden_status(req.getParameter("hide_value"));
		if (candidate.getHidden_status().equals(CandidateConstants.STATUS_CANDIDATE_REGISTER)) {
			candidate.setCandidate_firstName(req.getParameter("firstName"));
			candidate.setCandidate_lastName(req.getParameter("lastName"));
			candidate.setCandidate_fatherName(req.getParameter("fatherName"));
			candidate.setCandidate_motherName(req.getParameter("motherName"));
			candidate.setCandidate_DOB(req.getParameter("dob"));
			candidate.setCandidate_gender(Integer.parseInt(req.getParameter("gender")));
			candidate.setCandidate_Addhar(req.getParameter("addhaar"));
			candidate.setCandidate_userName(req.getParameter("email"));
			candidate.setCandidate_password(req.getParameter("psw"));
		} else if(candidate.getHidden_status().equals(CandidateConstants.STATUS_VOTER_LOGIN)){
			candidate.setCandidate_userName(req.getParameter("email"));
			candidate.setCandidate_password(req.getParameter("psw"));
		}
		return candidate;
	}

}
