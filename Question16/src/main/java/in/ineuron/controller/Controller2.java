package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/details")
public class Controller2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		
		session.setAttribute("CollegeName", "ANITS");

		req.setAttribute("branch", "CSE");
		req.setAttribute("favoriteSport", "CRICKET");

		RequestDispatcher rd = req.getRequestDispatcher("./msg1.jsp");
		rd.forward(req, resp);
	}
}
