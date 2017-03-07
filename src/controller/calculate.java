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

/**
 * Servlet implementation class calculate
 */
@WebServlet("/calculate")
public class calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String gname=request.getParameter("name");
		System.out.println(gname);
		System.out.println("aaaaaaaaaaaaaaaa6d6669696969");
		

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");

			String sql= "SELECT * FROM employee where name='"+gname+"'";
			
			Statement stmtobj=connobj.createStatement();
		
			ResultSet rsobj = stmtobj.executeQuery(sql);
			
			while (rsobj.next())
			{
				int basic_rate= rsobj.getInt("basic_rate");
				int ot_rate= rsobj.getInt("ot_rate");
				System.out.println(basic_rate);
			
				request.setAttribute("a", basic_rate);
				request.setAttribute("b", ot_rate);
				
			//	RequestDispatcher rd=request.getRequestDispatcher("")
			}
				
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
