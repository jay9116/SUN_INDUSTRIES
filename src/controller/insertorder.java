package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertorder
 */
@WebServlet("/insertorder")
public class insertorder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertorder() {
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
	
			String sqla= "insert into product_order(odate,product,product_size,quantity,description) " +
						"values ('"+date+"','"+product+"','"+size+"','"+qnt+"','"+description+"')";
			Statement stmtobj=connobj.createStatement();
			stmtobj.executeUpdate(sqla);
			System.out.println("insert completed");
			
			String sqlb= "SELECT * FROM product where name='"+product+"'";
			Statement stmtobjb=connobj.createStatement();
			ResultSet rsobjb = stmtobjb.executeQuery(sqlb);
		//	PrintWriter obj=response.getWriter();		
				
			if(rsobjb.next())
				{
					float cused= rsobjb.getFloat("copper_used");
					float bused= rsobjb.getFloat("brass_used");
					float bsused= rsobjb.getFloat("brasssheet_used");
				
					System.out.println(cused);
					System.out.println(bused);
					System.out.println(bsused);
				
					float finalqntc=cused*qnt;

					float finalqntb=bused*qnt;

					float finalqntbs=bsused*qnt;
				
					System.out.println(finalqntc);
					System.out.println(finalqntb);
					System.out.println(finalqntbs);
				
					String sqlc= "SELECT * FROM copper where size='"+size+"'";
					Statement stmtobjc=connobj.createStatement();
					ResultSet rsobjc = stmtobjb.executeQuery(sqlc);
				//	PrintWriter obj=response.getWriter();		
					while (rsobjc.next())
					{
						float getweight= rsobjc.getFloat("weight");
						
						float insertweightc=getweight-finalqntc;
						float insertweightb=getweight-finalqntb;
						float insertweightbs=getweight-finalqntbs;
						
						
						String sqld= "update `copper` set  `weight` = '"+insertweightc+"' where size='"+size+"' " ;
						String sqle= "update `brass` set  `weight` = '"+insertweightb+"' where size='"+size+"' " ;
						String sqlf= "update `brasssheet` set  `weight` = '"+insertweightbs+"' where size='"+size+"' " ;
						
						
						Statement stmtobjd=connobj.createStatement();
						stmtobjd.executeUpdate(sqld);
						stmtobjd.executeUpdate(sqle);
						stmtobjd.executeUpdate(sqlf);
						System.out.println("query execute");
					}
			}
			System.out.println("order calaculated");
			response.sendRedirect("view/ordersuccess.jsp");
			
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
