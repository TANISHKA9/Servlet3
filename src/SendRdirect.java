import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRdirect extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		/*int sq=(int)req.getAttribute("sum");
		PrintWriter out= res.getWriter();
		out.println("Square using SendRedirect: "+sq);*/
		
		//PrintWriter out= res.getWriter();
		System.out.println("I am SendRedirect servlet");
	}
}
