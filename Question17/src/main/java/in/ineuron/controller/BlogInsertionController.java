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

@WebServlet("/blog")
public class BlogInsertionController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private IBlogService service;
	private RequestDispatcher rd;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Integer blogId = null;
		String title = null;
		String description = null;
		String content = null;
		String message = null;
		String targetPage = null;

		try {
			title = req.getParameter("title");
			description = req.getParameter("description");
			content = req.getParameter("content");

			service = ServiceFactory.getServiceObject();

			if (service != null) {
				BlogData data = new BlogData();

				data.setBlogTitle(title);
				data.setBlogDescription(description);
				data.setContent(content);
				String status = service.insertBlogData(data);
				if (status.equalsIgnoreCase("success")) {
					blogId = service.findIdOfLatestInsertedRow();
					message = "DATA IS INSERTED WITH ID " + blogId;
					req.setAttribute("message", message);
					targetPage = "./viewpage.jsp";
				} else {
					message = "DATA INSERTION FAILED PLEASE TRY AFTER SOME TIME";
					req.setAttribute("message", message);
					targetPage = "./index.jsp";
				}
			} else {
				message = "SOME INTERNAL ISSUE HAS OCCURED PLEASE TRY AFTER SOME TIME";
				req.setAttribute("message", message);
				targetPage = "./index.jsp";
			}

			rd = req.getRequestDispatcher(targetPage);
			rd.forward(req, resp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
