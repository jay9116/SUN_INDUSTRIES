package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertbill
 */
@WebServlet("/insertbill")
public class insertbill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertbill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("newname");
		String size=request.getParameter("newsize");
		String quant=request.getParameter("newquant");
		String price=request.getParameter("price");
		String total=request.getParameter("total");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			//System.out.println("Regi1");
			
			String sql= "insert into bill(name,size,quantity,price,total) " +
					"values ('"+name+"','"+size+"','"+quant+"','"+price+"','"+total+"')";
			
			Statement stmtobj=connobj.createStatement();
		
			stmtobj.executeUpdate(sql);
			System.out.println("completed");
		}
		catch(Exception E)
		{
			System.out.println("Error");
			E.printStackTrace();
		}
	
		request.setAttribute("a1", name);
		request.setAttribute("a2", size);
		request.setAttribute("a3", quant);
		request.setAttribute("a4", price);
		request.setAttribute("a5", total);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("view/finalbill.jsp");
		rd.forward(request, response);
	}
}


