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
 * Servlet implementation class viewmaterial
 */
@WebServlet("/viewmaterial")
public class viewmaterial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public viewmaterial() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj = DriverManager.getConnection(
					"jdbc:mysql://localhost/sun_db", "root", "root");

			String sql = "SELECT * FROM copper";

			Statement stmtobj = connobj.createStatement();

			ResultSet rsobj = stmtobj.executeQuery(sql);

			PrintWriter pr = response.getWriter();
			pr.write("<font size=5>Copper Material<br/></font>");

			pr.write("<table border=1 >");

			int i = 0;
			pr.write("<br/><tr><th>Sr No.</th><th>Size</th><th>Weight</th></tr>");
			while (rsobj.next()) {
				// probj.write("<br/>");

				// result=rsobj.getString("UserName");
				i = i + 1;
				int size = rsobj.getInt("size");
				int weight = rsobj.getInt("weight");

				pr.write("<tr align=\"center\">");

				pr.write("<td width=\"50\">" + i);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + size);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + weight);
				pr.write("</td>");
				pr.write("</tr>");

			}
			pr.write("</table>");
			
			String sql2 = "SELECT * FROM brass";

			Statement stmtobj2 = connobj.createStatement();

			ResultSet rsobj2 = stmtobj2.executeQuery(sql2);

			PrintWriter pr1 = response.getWriter();
			pr.write("<font size=5><br>Brass Material<br/></font>");

			pr.write("<table border=1 >");

			int ii = 0;
			pr.write("<br/><tr><th>Sr No.</th><th>Size</th><th>Weight</th></tr>");
			while (rsobj2.next()) {
				// probj.write("<br/>");

				// result=rsobj.getString("UserName");
				ii = ii + 1;
				int size = rsobj2.getInt("size");
				int weight = rsobj2.getInt("weight");

				pr.write("<tr align=\"center\">");

				pr.write("<td width=\"50\">" + ii);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + size);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + weight);
				pr.write("</td>");
				pr.write("</tr>");

			}
			pr.write("</table>");

			String sql3 = "SELECT * FROM brasssheet";

			Statement stmtobj3 = connobj.createStatement();

			ResultSet rsobj3 = stmtobj3.executeQuery(sql3);

//			PrintWriter pr1 = response.getWriter();
			pr.write("<font size=5><br>Brass Sheet Material<br/></font>");

			pr.write("<table border=1 >");

			int iii = 0;
			pr.write("<br/><tr><th>Sr No.</th><th>Size</th><th>Weight</th></tr>");
			while (rsobj3.next()) {
				// probj.write("<br/>");

				// result=rsobj.getString("UserName");
				iii = iii + 1;
				int size = rsobj3.getInt("size");
				int weight = rsobj3.getInt("weight");

				pr.write("<tr align=\"center\">");

				pr.write("<td width=\"50\">" + iii);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + size);
				pr.write("</td>");

				pr.write("<td width=\"130\">" + weight);
				pr.write("</td>");
				pr.write("</tr>");

			}
			pr.write("</table>");

		} catch (Exception E) {
			System.out.println("Error");
			E.printStackTrace();
		}

	}

}
