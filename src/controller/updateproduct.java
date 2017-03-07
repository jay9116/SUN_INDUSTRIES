package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateproduct
 */
@WebServlet("/updateproduct")
public class updateproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("newname");
		
		String size=request.getParameter("newsize");
		float a=Float.parseFloat(size);
		
		String weight=request.getParameter("newweight");
		double b=Double.parseDouble(weight);
		
		String cp=request.getParameter("newcp");
		float c=Float.parseFloat(cp);
		
		String bs=request.getParameter("newbs");
		float d=Float.parseFloat(bs);
		
		String bss=request.getParameter("newbss");
		float e=Float.parseFloat(bss);
//		String d=request.getParameter("weight").toString();
	//	double e=Double.parseDouble(d);	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			//System.out.println("Regi1");
			Statement stmtobj=connobj.createStatement();
			
			String sql= "update `product` set  `weight` = '"+b+"', `brass_used` = '"+d+"',`copper_used` = '"+c+"' where name='"+name+"' && size='"+a+"' && brasssheet_used='"+e+"' " ;
				
			stmtobj.executeUpdate(sql);
			System.out.println("query execute");
			response.sendRedirect("view/updateproductsuccess.jsp");
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
