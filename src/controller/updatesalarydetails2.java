package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updatesalarydetails2
 */
@WebServlet("/updatesalarydetails2")
public class updatesalarydetails2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatesalarydetails2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n=request.getParameter("name");
				
				String size=request.getParameter("basic");
				int a=Integer.parseInt(size);
				
				String weight=request.getParameter("ot");
				int b=Integer.parseInt(weight);
				
				String cp=request.getParameter("bs");
				int c=Integer.parseInt(cp);
				
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
					//System.out.println("Regi1");
					Statement stmtobj=connobj.createStatement();
					
					String sql= "update `employee` set  `basic` = '"+a+"', `ot_rate` = '"+b+"',`basic_rate` = '"+c+"' where name='"+n+"' " ;
						
					stmtobj.executeUpdate(sql);
					System.out.println("query execute");
					response.sendRedirect("view/salaryupdatesuccess.jsp");
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
