package tester.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HibernateLogics.updateStudent(Integer.parseInt(req.getParameter("id")), req.getParameter("address"));
		resp.getWriter().print("<h1>Student Address Updated</h1>");
//		resp.getWriter().print("<a href=\"home.html\"><button>Home</button></a>");
		req.getRequestDispatcher("home.html").include(req, resp);
	}
}