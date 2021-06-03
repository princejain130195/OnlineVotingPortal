package Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Sign;
import Controller.Voter;
import DAOLayer.IsVoting_DAO;
import DAOLayer.VoterDAO;

/**
 * Servlet implementation class VoteEventServlet
 */
@WebServlet("/VoteEventServlet")
public class VoteEventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		try {
			if(command != null && command.equals("LOAD")) {
				int signId = Integer.parseInt(request.getParameter("signId"));
				Voter voter = VoterDAO.voter1;
				IsVoting_DAO.doVoting(voter.getVoter_id(),signId );
				request.setAttribute("successVoting", "Thank you for voting!!");
				RequestDispatcher rd = request.getRequestDispatcher("voting-successfull.jsp");
				rd.forward(request, response);
			}else {
				List<Sign> signList = IsVoting_DAO.getSignInfo();
				request.setAttribute("sign_list", signList);
				RequestDispatcher rd = request.getRequestDispatcher("/Vote-the-Candidate.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
