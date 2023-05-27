package in.ineuron.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dto.Student;
import in.ineuron.service.IStudentServiceImpl;

@WebServlet("/students")
public class StudentController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IStudentServiceImpl service = new IStudentServiceImpl();
		List<Student> stdList = service.fetchAllStudentDat();

		req.setAttribute("studentList", stdList);
		

		RequestDispatcher rd = req.getRequestDispatcher("./index.jsp");
		rd.forward(req, resp);
	}
}
