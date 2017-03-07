package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updatesalarydetails
 */
@WebServlet("/updatesalarydetails")
public class updatesalarydetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatesalarydetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");

			String sql= "SELECT * FROM employee";
			
			Statement stmtobj=connobj.createStatement();
		
			ResultSet rsobj = stmtobj.executeQuery(sql);
			
			PrintWriter pr=response.getWriter();
			pr.write("<br/><br/><table border=1 >");
			
			int i=0;
			pr.write("<tr><th>Sr No.</th><th>Name</th><th>Basic</th><th>Overtime</th><th>Basic Rate<br/>(Per Day)</th><th>Update</th></tr>" );
			while (rsobj.next())
			{
				//probj.write("<br/>");

				//result=rsobj.getString("UserName");
				i=i+1;
				String name= rsobj.getString("name");
				int basic= rsobj.getInt("basic");
				int ot_rate= rsobj.getInt("ot_rate");
				int bs_rate= rsobj.getInt("basic_rate");
				
				pr.write("<tr align=\"center\">");
				
				pr.write("<td width=\"50\">" + i);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + name);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + basic);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + ot_rate);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + bs_rate);
				pr.write("</td>");

				//pr.write("<td width=\"130\"><a href=\"salarycalculate.jsp?name="+name+" \"><img height=30 widhth=40 src=\"images/cal.jpg\"></a>");
				
				pr.write("<td width=\"130\"><a href=\"updateemployeesalary2.jsp?name="+name+"&basic="+basic+"&ot_rate="+ot_rate+"&bs_rate="+bs_rate+" \"><img height=30 widhth=40 src=\"images/PENCIL.png\"></a>");
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
	
		response.sendRedirect("view/insertedsuccess.jsp");
	

}

}
