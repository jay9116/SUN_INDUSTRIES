package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class material
 */
@WebServlet("/material")
public class material extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public material() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String type=request.getParameter("type");
		String b=request.getParameter("size");
		float c=Float.parseFloat(b);
		String d=request.getParameter("weight").toString();
		double e=Double.parseDouble(d);	
		//System.out.print(type+c+e);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			//System.out.println("Regi1");
			if(type.equals("Copper"))
			{
			String sql= "insert into copper(size,weight) " +
					"values ('"+c+"','"+e+"')";
			Statement stmtobj=connobj.createStatement();
			
			stmtobj.executeUpdate(sql);
			}
			if(type.equals("Brass"))
			{
				String sql= "insert into brass(size,weight) " +
						"values ('"+c+"','"+e+"')";
				Statement stmtobj=connobj.createStatement();
				
				stmtobj.executeUpdate(sql);
				}
			if(type.equals("BrassSheet"))
			{
				String sql= "insert into brasssheet(size,weight) " +
						"values ('"+c+"','"+e+"')";
				Statement stmtobj=connobj.createStatement();
				
				stmtobj.executeUpdate(sql);
				}
			
			
			System.out.println("completed");
		}
		catch(Exception E)
		{
			System.out.println("Error");
			E.printStackTrace();
		}
	
		response.sendRedirect("view/insertedsuccess.jsp");
	
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
