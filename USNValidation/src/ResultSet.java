

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResultSet")
public class ResultSet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      String usn = request.getParameter("usn");
      PrintWriter out = response.getWriter();
      if(usn.length()!=10)
      {
    	  response.sendRedirect("/USNValidation/Error.html");
    	  
      }
      else
      {
    	 out.println("Thank you");
      }
	}


}
