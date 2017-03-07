package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class viewproduct
 */
@WebServlet("/viewproduct")
public class viewproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");

			String sql= "SELECT * FROM product";
			
			Statement stmtobj=connobj.createStatement();
		
			ResultSet rsobj = stmtobj.executeQuery(sql);
			
			PrintWriter pr=response.getWriter();
			pr.write("<br/><br/><table border=1 >");
			
			int i=0;
			pr.write("<tr><th>Sr No.</th><th>Name</th><th>Size</th><th>Weight</th><th>Copper Used</th><th>Brass Used</th><th>Brass Sheet Used</th><th>Update?</th></tr>" );
			while (rsobj.next())
			{
				//probj.write("<br/>");

				//result=rsobj.getString("UserName");
				i=i+1;
				String name= rsobj.getString("name");
				float size= rsobj.getFloat("size");
				double weight= rsobj.getDouble("weight");
				float copper_used= rsobj.getFloat("copper_used");
				float brass_used= rsobj.getFloat("brass_used");
				float brasssheet_used= rsobj.getFloat("brasssheet_used");
				
				pr.write("<tr align=\"center\">");
				
				pr.write("<td width=\"50\">" + i);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + name);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + size);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + weight);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + copper_used);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + brass_used);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + brasssheet_used);
				pr.write("</td>");
				
				pr.write("<td width=\"130\"><a href=\"updateproduct.jsp?name="+name+"&size="+size+"&weight="+weight+"&copper_used="+copper_used+"&brass_used="+brass_used+"&brasssheet_used="+brasssheet_used+" \"><img height=30 widhth=40 src=\"images/PENCIL.png\"></a>");
				pr.write("</td>");

				pr.write("</tr>");


			}
			pr.write("</table>");
			pr.write("<br><a href=\"viewproducts.jsp\" style=\"text-decoration: none;\">");
			pr.write("<input type=\"Button\" Value=\"Back\" class=\"button1\" />"+"</a>");

		
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
