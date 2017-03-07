package controller;

import java.io.IOException;
import java.io.PrintWriter;



import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class checkdesignation
 */
@WebServlet("/checkdesignation")
public class checkdesignation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkdesignation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pr=response.getWriter();
		
		try
		{
			
			
			String demouname= request.getAttribute("ff").toString();
			System.out.println("this is in the checkaccess java first sop");
		    	System.out.print(demouname);

		    	
				Class.forName("com.mysql.jdbc.Driver");
				Connection connobj=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
				System.out.println("this is in the checkaccess java second sop");
				System.out.println("aaaa1");
				
		    	String sql2= "SELECT Designation FROM user_info where Username='"+demouname+"'";
		    	System.out.println("this is in the checkaccess java third sop");
		    	System.out.println("aaaa2");
				
				Statement stmtobj2=(Statement) connobj.createStatement();
				System.out.println("this is in the checkaccess java fourth sop");
				System.out.println("aaaa3");
				
				ResultSet rsobj2 = (ResultSet) stmtobj2.executeQuery(sql2);
				System.out.println("this is in the checkaccess java fifth sop");
				System.out.println("a4aaa");
				
				while (rsobj2.next())
				{
					String nuid= rsobj2.getString("Designation");
					System.out.println("a4aaa");
					request.setAttribute("ab", nuid);
				}

		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
