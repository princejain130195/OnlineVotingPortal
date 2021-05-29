package Service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Constants.CandidateConstants;
import Controller.Candidate;
import Controller.Sign;
import DAOLayer.CandidateDAO;
import Init.CandidateInit;

@WebServlet("/registerCandidate")
public class Candidate_Service extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Candidate candidate = null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h1>Hii</h1>");
		candidate = CandidateInit.initCandidate(req);
		if(candidate.getHidden_status().equals(CandidateConstants.STATUS_CANDIDATE_REGISTER)) {
			Sign sign = CandidateDAO.registerCandidate(candidate);
			out.println("<h1>U have Registered successfully.</h1><br/>");
			out.println("<h1>Your Sign is : '"+ sign.getName() +"'");
		} else if(candidate.getHidden_status().equals(CandidateConstants.STATUS_VOTER_LOGIN)) {
			
		}
		
		
	}

}
