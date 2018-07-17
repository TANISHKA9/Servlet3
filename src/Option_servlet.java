

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
				System.out.println("2");
				RequestDispatcher rd=request.getRequestDispatcher("/RD");
				System.out.println("3");
				rd.forward(request,response); */
				
	//		}
	//	else if(radio_val=="SendRedirect")
	//		{
				System.out.println("Square of a number using SendRdirect servlet");
				int num=Integer.parseInt(request.getParameter("Num"));
				//System.out.println(num);
				int sq=num*num;
				//System.out.println("2");
				PrintWriter out= response.getWriter();
				//System.out.println("3");
				out.println("Square using SendRedirect: "+sq);
				//System.out.println("4");
				//response.
				//request.setAttribute("sq",sq);
				response.sendRedirect("Square"); 
		//	} 
	}

}