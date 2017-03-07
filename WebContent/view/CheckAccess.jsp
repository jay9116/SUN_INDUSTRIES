<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
    String demouname=null;
    
    
    if(session.getAttribute("demouname")==null)
    {
    response.sendRedirect("loginerror.jsp");
    //System.out.print("if ");
    }
    else
    {
    	demouname= session.getAttribute("demouname").toString();
    //	System.out.print(demouname);//

    	
		Class.forName("com.mysql.jdbc.Driver");
		Connection connobj=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sun_db", "root","root");

		System.out.println("aaaa1");
		
    	String sql2= "SELECT Designation FROM user_info where Username='"+demouname+"'";
    	System.out.println("aaaa2");
		
		Statement stmtobj2=connobj.createStatement();
		System.out.println("aaaa3");
		
		ResultSet rsobj2 = stmtobj2.executeQuery(sql2);
		System.out.println("a4aaa");
		
		while (rsobj2.next())
		{
			String nuid= rsobj2.getString("Designation");
			System.out.println("a4aaa");
			request.setAttribute("ab", nuid);
		}
    	RequestDispatcher rdo=request.getRequestDispatcher("adminwelcome.jsp");
    	rdo.forward(request, response);
    }
    
    
    %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

</body>
</html>