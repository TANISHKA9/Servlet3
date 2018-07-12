import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * this program is to do communication:
 * 1. RequestDispatcher: 
 * 			Client -> Servlet1 ->pass x-value-> servlet2 -> Client  
 * 2. SendRedirect:
 * 			Client-> Servlet1; 	
 * 			Servlet1 -> Client; 
 * 			Client -> Servlet2 
 * 3. Session Management:
 * 			Client-> Servlet1; 
 * 			Servlet1 -> pass x-value -> Client; 
 * 			Client -> pass x-value -> Servlet2; 
 * 			Servlet2 -> Client : 
 */

public class Servlet1 extends HttpServlet
{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int n1=Integer.parseInt(req.getParameter("Num1"));
		int n2=Integer.parseInt(req.getParameter("Num2"));
		int sum=n1+n2;
		System.out.println(sum);
		
		//PrintWriter out=res.getWriter();   //to write output on webbrowser/servlet page
		//out.println(sum);
		
		req.setAttribute("sum", sum);
		RequestDispatcher rd=req.getRequestDispatcher("RD");  //same url RD has been used in web.xml to register for ReqDpatcher class.
		rd.forward(req, res);
		
	}
	
}
