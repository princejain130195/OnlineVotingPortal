package Service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOLayer.IsVoting_DAO;

@WebServlet("/IsVotingServlet")
public class IsVotingServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	//on means isChecked, null means notChecked
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ischecked = request.getParameter("my");
		RequestDispatcher rd = null;
		try {
			if (ischecked != null) {
				if (ischecked.equals("on")) {
					IsVoting_DAO.setIsVoting(1);
				}
			} else {
				IsVoting_DAO.setIsVoting(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rd = request.getRequestDispatcher("/admin-desboard.jsp");
		rd.forward(request, response);

	}

}
