package tester.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class FetchStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s = HibernateLogics.fetchStudent(Integer.parseInt(req.getParameter("id")));
		resp.getWriter().print("<h1>Name : "+s.getSName()+"</h1>");
		resp.getWriter().print("<h1>Address : "+s.getSAddress()+"</h1>");
		resp.getWriter().print("<h1>Percentage : "+s.getSPercentage()+"</h1>");
		resp.getWriter().print("<h1>Gender : "+s.getSGender()+"</h1>");
	}
}