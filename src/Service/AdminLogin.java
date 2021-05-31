package Service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLogin
 */
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("email").toLowerCase();
		String password = request.getParameter("psw").toLowerCase();
		RequestDispatcher rd = null;
		if (userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			rd = request.getRequestDispatcher("/admin-desboard.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("Admin", "USERNAME & PASSWORD is wrong.");
			rd = request.getRequestDispatcher("/admin.jsp");
			rd.forward(request, response);

		}

	}
	

}
