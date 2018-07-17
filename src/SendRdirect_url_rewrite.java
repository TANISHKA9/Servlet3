

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendRdirect_url_rewrite
 */
@WebServlet(description = "1. URL rewritting: to send a value from servlet-1 to servlet-2", urlPatterns = { "/SendRdirect_url_rewrite" })
public class SendRdirect_url_rewrite extends HttpServlet 
{
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method 
		System.out.println("I am SendRedirect servlet_URL Rewritting");
		int sq=Integer.parseInt(request.getParameter("sq"));
		PrintWriter out= response.getWriter();
		out.println("Square using SendRedirect_URL Rewriting: "+sq);
		//PrintWriter out= res.getWriter();
		
	}

}
