package Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Constants.VoterConstants;
import Controller.Voter;
import DAOLayer.VoterDAO;
import Init.VoterInit;

@WebServlet("/registerVoter")
public class Voter_Service extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Voter voter = null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			voter = VoterInit.voterInit(req);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if (voter.getHidden_status().equals(VoterConstants.STATUS_VOTER_REGISTER)) {
			VoterDAO.regVoterDetails(voter);
			out.println("<h1>U have Registered successfully.</h1>");
		} else if (voter.getHidden_status().equals(VoterConstants.STATUS_VOTER_SIGNIN)) {
			boolean isUserPass = VoterDAO.signInVoter(voter);
			if (isUserPass) {
				out.println("<h1>Thank You for Sign In!! </h1>");
			} else {
				out.println("<h1>Soory, U have entered the wrong credentials. </h1>");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Do post</h1>");
	}

}
