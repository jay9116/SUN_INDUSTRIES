package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.ResultSetMetaData;

/**
 * Servlet implementation class updatefinal
 */
@WebServlet("/updatefinal")
public class updatefinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatefinal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String type=request.getParameter("newtype");
	String size = request.getParameter("newsize");
	double b = Double.parseDouble(size);
	String weight = request.getParameter("newweight");
	double d = Double.parseDouble(weight);
	System.out.println(type);
	System.out.println(b);
	System.out.println(d);
	
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
		//System.out.println("Regi1");
		Statement stmtobj=connobj.createStatement();
		if(type.equals("Copper"))
		{
			System.out.println("hi");
			String sql= "update `copper` set  `weight` = '"+weight+"' where size='"+b+"' " ;
			
			stmtobj.executeUpdate(sql);
			System.out.println("query execute:cooper");
		}
		if(type.equals("Brass"))
		{
			System.out.println("hi");
			String sql= "update `brass` set  `weight` = '"+weight+"' where size='"+b+"' " ;
			
			stmtobj.executeUpdate(sql);
			System.out.println("query execute:brass");
		}
		
		if(type.equals("BrassSheet"))
		{
			System.out.println("hi");
			String sql= "update `brasssheet` set  `weight` = '"+weight+"' where size='"+b+"' " ;
			
			stmtobj.executeUpdate(sql);
			System.out.println("query execute:brasssheet");
		}
		
		System.out.println("completed");
		response.sendRedirect("view/MaterialUpdateSuccess.jsp");
	
	}
	catch(Exception E)
	{
		System.out.println("Error");
		E.printStackTrace();
	}


	
	
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
