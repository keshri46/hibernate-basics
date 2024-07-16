package tester.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s = new Student(req.getParameter("name"), req.getParameter("address"),
				Double.parseDouble(req.getParameter("percentage")), req.getParameter("gender"));
		HibernateLogics.addStudent(s);
		resp.getWriter().println("<h1>Student Added</h1>");
//		resp.getWriter().println("<a href=\"home.html\"><button>Home</button></a>");
		req.getRequestDispatcher("home.html").include(req, resp);
	}
}
