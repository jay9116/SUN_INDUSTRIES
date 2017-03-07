package controller;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
System.out.print(uname);
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connobj=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");
	//System.out.println("Driver3 loaded and db connected");
	
	String sql= "SELECT * FROM login_info where username='"+uname+"'";
	
	Statement stmtobj=(Statement) connobj.createStatement();
	ResultSet rsobj = (ResultSet) stmtobj.executeQuery(sql);
	
	while (rsobj.next())
	{
		String nuid= rsobj.getString("u_id");
		String nuname= rsobj.getString("username");
		String npass= rsobj.getString("password");
		
		
		//System.out.println(nuid);	
		//System.out.println(nuname);
		//System.out.println(npass);
	
		if(uname.equals(nuname) && pass.equals(npass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("demouname", nuname );
			session.setMaxInactiveInterval(30*60);
			
			
		//	Cookie unamecookie = new Cookie("u", nuname);
			//unamecookie.setMaxAge(30*60);
			//response.addCookie(unamecookie);
			/*String sql2= "SELECT Designation FROM user_info where Username='"+nuname+"'";
			
			Statement stmtobj2=(Statement) connobj.createStatement();
			ResultSet rsobj2 = (ResultSet) stmtobj2.executeQuery(sql2);
			
			while (rsobj2.next())
			{
				String des= rsobj2.getString("Designation");
				request.setAttribute("a", des);
			}*/

		}
		
		
		
	}response.sendRedirect("view/adminwelcome.jsp");
	//RequestDispatcher rd=request.getRequestDispatcher("view/adminwelcome.jsp");
	//rd.forward(request, response);
		
		
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
