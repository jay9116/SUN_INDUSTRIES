package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class finalsalary
 */
@WebServlet("/finalsalary")
public class finalsalary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public finalsalary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nname=request.getParameter("name");
		request.setAttribute("a", nname);
		
		String nb=request.getParameter("b_rate");
		int nb_rate=Integer.parseInt(nb);
		request.setAttribute("b", nb);
		
		String no=request.getParameter("o_rate");
		int no_rate=Integer.parseInt(no);
		request.setAttribute("c", no_rate);
		
		String ndate=request.getParameter("date");
		request.setAttribute("d", ndate);
		
		String nd=request.getParameter("days");
		int ndays=Integer.parseInt(nd);
		request.setAttribute("e", ndays);
		
		String nh=request.getParameter("o_hours");
		int nhours=Integer.parseInt(nh);
		request.setAttribute("f", nhours);
		
		System.out.println("In Final Salary");
		System.out.println(nname);
		System.out.println(nb_rate);
		System.out.println(no_rate);
		System.out.println(ndate);
		System.out.println(ndays);
		System.out.println(nhours);
	
		int final_basic=ndays*nb_rate;
		System.out.println("FinalBasic:" + final_basic);
		request.setAttribute("g", final_basic);
		
		int final_overtime=nhours*no_rate;
		System.out.println("FinalOT:" + final_overtime);
		request.setAttribute("h", final_overtime);
		
		int final_salary=final_basic+final_overtime;
		request.setAttribute("i", final_salary);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connobj=DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
	
			String sqla= "insert into salary(name,date,days,ot_hours,basic,overtime,totalsalary) " +
						 "values ('"+nname+"','"+ndate+"','"+ndays+"','"+nhours+"','"+final_basic+"','"+final_overtime+"','"+final_salary+"')";
			
			Statement stmtobj=connobj.createStatement();
			stmtobj.executeUpdate(sqla);
			
			System.out.println("success");
			RequestDispatcher rd=request.getRequestDispatcher("view/displaysalary.jsp");
			rd.forward(request, response);
		}
		catch(SQLException E)
		{
			E.printStackTrace();
			System.out.println("Error");
			E.printStackTrace();
		} 
		catch (ClassNotFoundException e) 
		{
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
