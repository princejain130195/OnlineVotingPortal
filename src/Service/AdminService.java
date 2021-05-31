package Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.Candidate;
import Controller.Voter;
import DAOLayer.Admin_DAO;

/**
 * Servlet implementation class AdminService
 */
@WebServlet("/AdminService")
public class AdminService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Admin_DAO admin_DAO = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listVoters(request, response);
			//listCandidates(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			listCandidates(req, resp);
			//listCandidates(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void listVoters(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Admin_DAO admin_DAO = new Admin_DAO();

		List<Voter> voters = admin_DAO.getVoters();
		request.setAttribute("Voter_List", voters);
		RequestDispatcher rd = request.getRequestDispatcher("/list-Voters.jsp");
		rd.forward(request, response);

	}

	private void listCandidates(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Admin_DAO admin_DAO = new Admin_DAO();

		List<Candidate> candidates = admin_DAO.getCandidates();
		request.setAttribute("Candidate_List", candidates);
		RequestDispatcher rd = request.getRequestDispatcher("/list-Candidate.jsp");
		rd.forward(request, response);

	}
	

}
