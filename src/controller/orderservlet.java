package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class orderservlet
 */
@WebServlet("/orderservlet")
public class orderservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public orderservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String date=request.getParameter("date");
		String product=request.getParameter("product");
		//float c=Float.parseFloat(b);
		String psize=request.getParameter("psize");
		float size=Float.parseFloat(psize);	
		//System.out.print(type+c+e);
		
		String quantity=request.getParameter("quantity");
		int qnt=Integer.parseInt(quantity);	
		
		String description=request.getParameter("description");
		System.out.println(date);
		System.out.println(product);
		System.out.println(size);
		System.out.println(quantity);
		System.out.println(description);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
			//System.out.println("Regi1");
			//String sql = "INSERT INTO order(order_date,order_product,order_product_size,order_quantity,order_description) values ('"+date+"','"+product+"','"+size+"','"+qnt+"','"+description+"')";
	
			String sqla= "insert into order(date,product,product_size,quantity,description) " +
					"values ('"+date+"','"+product+"','"+size+"','"+qnt+"','"+description+"')";
		
			//String sql= "insert into order(order_date,order_product,order_product_size,order_quantity,order_description) values ('"+date+"','"+product+"','"+size+"','"+qnt+"','"+description+"')";
			Statement stmtobj=connobj.createStatement();
			
			stmtobj.executeUpdate(sqla);
				
			System.out.println("completed");
		}
		catch(SQLException E)
		{
			E.printStackTrace();
			System.out.println("Error");
			E.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//response.sendRedirect("view/insertedsuccess.jsp");
	
	}

}
