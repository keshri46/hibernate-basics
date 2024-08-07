package tester.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HibernateLogics.deleteStudent(Integer.parseInt(req.getParameter("id")));
		resp.getWriter().print("<h1>Student Deleted</h1>");
//		resp.getWriter().print("<a href=\"http://localhost:8080/hibernate_basics/home.html\"><button>Home</button></a>");
		req.getRequestDispatcher("home.html").include(req, resp);
	}
}