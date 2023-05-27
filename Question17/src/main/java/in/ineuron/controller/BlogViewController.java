package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ineuron.dto.BlogData;
import in.ineuron.service.IBlogService;
import in.ineuron.servicefactory.ServiceFactory;

@WebServlet("/view")
public class BlogViewController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private IBlogService service;
	private RequestDispatcher rd;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String blogId = null;
		String message = null;
		String targetPage = null;
		BlogData blogData = null;
		try {
			blogId = req.getParameter("blogid");

			service = ServiceFactory.getServiceObject();

			if (service != null) {

				blogData = service.getheBlogDataById(Integer.parseInt(blogId));
				if (blogData.getContent() != null) {
					req.setAttribute("blogData", blogData);
					targetPage = "./viewblog.jsp";
				} else {
					message = "PLEASE ENTER VALID ID";
					req.setAttribute("message", message);
					targetPage = "./viewpage.jsp";
				}

			} else {
				message = "SOME INTERNAL ISSUE HAS OCCURED PLEASE TRY AFTER SOME TIME";
				req.setAttribute("message", message);
				targetPage = "./viewpage.jsp";
			}

			rd = req.getRequestDispatcher(targetPage);
			rd.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
