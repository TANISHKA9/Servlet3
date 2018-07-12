

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReqDpatcher extends HttpServlet 
{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int sum=(int)req.getAttribute("sum");
		PrintWriter out= res.getWriter();
		out.println("Square using ReqDpatcher: "+sum);
	}
}
