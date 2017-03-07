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
 * Servlet implementation class updatematerial
 */
@WebServlet("/updatematerial")
public class updatematerial extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatematerial() {
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
		double c=Double.parseDouble(b);
		
//		String d=request.getParameter("weight").toString();
	//	double e=Double.parseDouble(d);	
		System.out.print(type+c);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			//System.out.println("Regi1");
			Statement stmtobj=connobj.createStatement();
			int i=0;
			if(type.equals("Copper"))
			{
				System.out.println("hi");
				String sql= "SELECT * FROM copper where size='"+c+"'";
				
				ResultSet rsobj=stmtobj.executeQuery(sql);
				while(rsobj.next())
				{
					i=1;
					System.out.println("hifff");
					Double w=rsobj.getDouble("size");
					
					Double w1=rsobj.getDouble("weight");
					request.setAttribute("weight", w1);
					request.setAttribute("type", type);
					request.setAttribute("size", c);
					System.out.println(w1);
					System.out.println(w);
				}
				
			}
			if(type.equals("Brass"))
			{
				String sql= "SELECT * FROM brass where  size='"+c+"'";
				ResultSet rsobj=stmtobj.executeQuery(sql);
				while(rsobj.next())
				{
					i=1;
					System.out.println("hifff");
					Double w=rsobj.getDouble("size");
					
					Double w1=rsobj.getDouble("weight");
					request.setAttribute("weight", w1);
					request.setAttribute("type", type);
					request.setAttribute("size", c);
					System.out.println(w1);
					System.out.println(w);
				}}
			if(type.equals("BrassSheet"))
			{
				String sql= "SELECT * FROM brasssheet where  size='"+c+"'";	
				ResultSet rsobj=stmtobj.executeQuery(sql);
				while(rsobj.next())
				{
					i=1;
					System.out.println("hifff");
					Double w=rsobj.getDouble("size");
					
					Double w1=rsobj.getDouble("weight");
					request.setAttribute("weight", w1);
					request.setAttribute("type", type);
					request.setAttribute("size", c);
					System.out.println(w1);
					System.out.println(w);
				}
			}
			
			
			if(i==0)
			{
				response.sendRedirect("view/updatematerialerror.jsp");
				
			}
			if(i==1)
			{
			System.out.println("completed");
			RequestDispatcher rd=request.getRequestDispatcher("view/updatematerial2.jsp");
			rd.forward(request, response);
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
