package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewsalary
 */
@WebServlet("/viewsalary")
public class viewsalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewsalary() {
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

			String sql= "SELECT * FROM salary";
			
			Statement stmtobj=connobj.createStatement();
		
			ResultSet rsobj = stmtobj.executeQuery(sql);
			
			PrintWriter pr=response.getWriter();
			pr.write("<br/><br/><table border=1 >");
			
			int i=0;
			pr.write("<tr><th>Sr No.</th><th>Name</th><th>Date</th><th>Days</th><th>OverTime Hours</th><th>Basic Salary</th><th>Overtime Salary</th><th>Total Salary</th></tr>" );
			while (rsobj.next())
			{
				//probj.write("<br/>");

				//result=rsobj.getString("UserName");
				i=i+1;
				String name= rsobj.getString("name");
				Date date= rsobj.getDate("date");
				int days= rsobj.getInt("days");
				int ot_hours= rsobj.getInt("ot_hours");
				int basic= rsobj.getInt("basic");
				int overtime= rsobj.getInt("overtime");
				int totalsalary= rsobj.getInt("totalsalary");
				
				pr.write("<tr align=\"center\">");
				
				pr.write("<td width=\"50\">" + i);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + name);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + date);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + days);
				pr.write("</td>");
				

				pr.write("<td width=\"130\">" + ot_hours);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + basic);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + overtime);
				pr.write("</td>");
				

				pr.write("<td width=\"130\">" + totalsalary);
				pr.write("</td>");
				
				pr.write("</tr>");


			}
			pr.write("</table>");

			pr.write("<br><a href=\"employeehome.jsp\" style=\"text-decoration: none;\">");
			pr.write("<input type=\"Button\" Value=\"Back\" class=\"button1\" />"+"</a>");

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
