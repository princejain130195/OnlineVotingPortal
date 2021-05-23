package Init;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

import Constants.VoterConstants;
import Controller.Voter;

public class VoterInit {
	
	public static Voter voterInit(HttpServletRequest req) throws ParseException {
		Voter voter = new Voter();
		voter.setHidden_status(req.getParameter("hide_value"));
		if(voter.getHidden_status().equalsIgnoreCase(VoterConstants.STATUS_VOTER_REGISTER)) {
			voter.setVoter_firstName(req.getParameter("firstName"));
			voter.setVoter_lastName(req.getParameter("lastName"));
			voter.setVoter_fatherName(req.getParameter("fatherName"));
			voter.setVoter_motherName(req.getParameter("motherName"));
			voter.setVoter_DOB(req.getParameter("dob"));
			voter.setVoter_gender(Integer.parseInt(req.getParameter("gender")));
			voter.setVoter_Addhar(req.getParameter("addhaar"));
			voter.setVoter_userName(req.getParameter("email"));
			voter.setVoter_password(req.getParameter("psw"));
		}else if(voter.getHidden_status().equalsIgnoreCase(VoterConstants.STATUS_VOTER_SIGNIN)) {
			voter.setVoter_signin_userName(req.getParameter("email"));
			voter.setVoter_signin_password(req.getParameter("psw"));
		}
		System.out.println(voter.getVoter_signin_userName()+"  "+voter.getVoter_signin_password());
		return voter;
	}

}
