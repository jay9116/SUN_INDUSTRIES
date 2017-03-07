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
 * Servlet implementation class bill
 */
@WebServlet("/bill")
public class bill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bill() {
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

			String sql= "SELECT * FROM product_order";
			
			Statement stmtobj=connobj.createStatement();
		
			ResultSet rsobj = stmtobj.executeQuery(sql);
			
			PrintWriter pr=response.getWriter();
			pr.write("<br/><br/><table border=1 >");
			
			int i=0;
			pr.write("<tr><th>Sr No.</th><th>Order Date</th><th>Product Name</th><th>Size</th><th>Quantity</th><th>Bill</th></tr>" );
			while (rsobj.next())
			{
				//probj.write("<br/>");

				//result=rsobj.getString("UserName");
				i=i+1;
				String date= rsobj.getString("odate");
				String pro= rsobj.getString("product");
				int size= rsobj.getInt("product_size");
				int quant= rsobj.getInt("quantity");
				
				pr.write("<tr align=\"center\">");
				
				pr.write("<td width=\"50\">" + i);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + date);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + pro);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + size);
				pr.write("</td>");
				
				pr.write("<td width=\"130\">" + quant);
				pr.write("</td>");

				//pr.write("<td width=\"130\"><a href=\"salarycalculate.jsp?name="+name+" \"><img height=30 widhth=40 src=\"images/cal.jpg\"></a>");
				
				pr.write("<td width=\"130\"><a href=\"displaybill2.jsp?pname="+pro+"&size="+size+"&quant="+quant+" \"><img height=30 widhth=40 src=\"images/cal.jpg\"></a>");
				pr.write("</td>");
			
				pr.write("</tr>");


			}
			pr.write("</table>");
			pr.write("<br><a href=\"order.jsp\" style=\"text-decoration: none;\">");
			pr.write("<input type=\"Button\" Value=\"Back\" class=\"button1\" />"+"</a>");

		
		}
		catch(Exception E)
		{
			System.out.println("Error");
			E.printStackTrace();
		}
	

	}

}
