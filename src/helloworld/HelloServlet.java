package helloworld;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	@SuppressWarnings("deprecation")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		try {
			resp.getWriter().println("hello world");
			resp.getWriter().println(new Date().toLocaleString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
