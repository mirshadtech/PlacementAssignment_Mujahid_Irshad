package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/students")
public class Controller1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("userName");
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("age", "45");
		session.setAttribute("address", "MI");


		RequestDispatcher rd = req.getRequestDispatcher("./msg.jsp");
		rd.forward(req, resp);
	}
}
