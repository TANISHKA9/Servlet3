

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ReqDpatcher extends HttpServlet 
{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		System.out.println("4");
		int sum=(int)request.getAttribute("sum");
		PrintWriter out= response.getWriter();
		out.println("Sum using ReqDpatcher: "+sum);
	}
}
