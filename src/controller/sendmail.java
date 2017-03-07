package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sendmail
 */
@WebServlet("/sendmail")
public class sendmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sendmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
			String username=request.getParameter("username");
			String email=request.getParameter("emailid");
			String subject=request.getParameter("subject");
			String message=request.getParameter("message");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			//System.out.println("Regi1");
			
			String sql= "insert into contact(username,emailid,subject,message) " +
					"values ('"+username+"','"+email+"','"+subject+"','"+message+"')";
			
			Statement stmtobj=connobj.createStatement();
		
			stmtobj.executeUpdate(sql);
			System.out.println("completed");
		
			response.sendRedirect("view/contactsuccess.jsp");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	
	}

}
