package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class createuser
 */
@WebServlet("/createuser")
public class createuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname=request.getParameter("fname");
		String username=request.getParameter("uname");
		
		String password=request.getParameter("pass");
		String repassword=request.getParameter("repass");
		String desig=request.getParameter("designation");
		String cont=request.getParameter("contact").toString();
		System.out.println(cont);
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			
			String sql2="SELECT * FROM user_info where Username='"+username+"'";
			Statement stmtobj=connobj.createStatement();
			
			ResultSet rsobj = stmtobj.executeQuery(sql2);
			while(rsobj.next())
			{
				String usernameone=rsobj.getString("Username");
				System.out.print("errrrg"+usernameone);
				
				if(usernameone.equals(username))
				{
					System.out.print("user already there");
					RequestDispatcher rdob= request.getRequestDispatcher("view/userexist.jsp");
					rdob.forward(request, response);
					//response.sendRedirect("view/userexist.jsp");
					
					
					
				}
				
			}
					
					System.out.println("Regi1");
					
					String sql= "insert into user_info(Firstname,Username,password,confirmpassword,Designation,Contact) " +
							"values ('"+firstname+"','"+username+"','"+password+"','"+repassword+"','"+desig+"','"+cont+"')";
					
					String sql1= "insert into login_info(userName,password)" +
							"values ('"+username+"','"+password+"')";
					
					
				
					stmtobj.executeUpdate(sql);
					stmtobj.executeUpdate(sql1);	
					System.out.println("completed");
					response.sendRedirect("view/Createusersuccess.jsp");
				
			
			
			
			
			/*
			
			Class.forName("com.mysql.jdbc.Driver");
			//Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			System.out.println("Regi1");
			
			String sql= "insert into user_info(Firstname,Username,password,confirmpassword,Designation,Contact) " +
					"values ('"+firstname+"','"+username+"','"+password+"','"+repassword+"','"+desig+"','"+cont+"')";
			
			String sql1= "insert into login_info(userName,password)" +
					"values ('"+username+"','"+password+"')";
			
			//Statement stmtobj=connobj.createStatement();
		
			stmtobj.executeUpdate(sql);
			stmtobj.executeUpdate(sql1);	
			System.out.println("completed");*/
		}
		catch(Exception E)
		{
			System.out.println("Error");
			E.printStackTrace();
		}
	
		//response.sendRedirect("view/Createusersuccess.jsp");
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
