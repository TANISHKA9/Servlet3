
/* to pass value from server-1 to server-2:
 * 1. Request Dispatcher using forward method with Request and Response as parameters.
 * 2. SendRedirect method to server-1:
 * 		a.URL rewriting
 * 		b.Session
 * 		c.cookies

*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Option_servlet
 */

public class Option_servlet extends HttpServlet 
{
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//String radio_val=(String)request.getAttribute("option");
		//if(radio_val=="ReqDispatcher")
		//	{
			/*	System.out.println("Switching to ReqDpatcher Servlet");	
				int num1=Integer.parseInt(request.getParameter("Num1"));
				int num2=Integer.parseInt(request.getParameter("Num2"));
				int sum= num1+num2;
				System.out.println("sum"+sum);
				request.setAttribute("sum", sum);
				RequestDispatcher rd=request.getRequestDispatcher("/RD");
				rd.forward(request,response); */
				
	//		}
	//	else if(radio_val=="SendRedirect")
	//		{
				/*System.out.println("Square of a number using SendRdirect servlet");
				int num=Integer.parseInt(request.getParameter("Num"));
				
				int sq=num*num;
				
				PrintWriter out= response.getWriter();
				out.println("Square using SendRedirect: "+sq);
				
				response.sendRedirect("Square"); */
		//	} 
			
	//else if(radio_val=="SendRedirect")
	//		{
				System.out.println("URL Rewritting: Square of a number using SendRdirect servlet");
				int num=Integer.parseInt(request.getParameter("Num_a"));
				int sq=num*num;																
				response.sendRedirect("Square_url?sq="+sq); 
		//	} 
				
	}

}