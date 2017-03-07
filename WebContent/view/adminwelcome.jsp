<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String demouname=null;
    
  
    if(session.getAttribute("demouname")==null)
    {
    response.sendRedirect("loginerror.jsp");
    //System.out.print("if ");
    }
    
    %>
  
  <%  if(session.getAttribute("demouname")!=null)
    	   
    {
    	demouname= session.getAttribute("demouname").toString();
    	System.out.println(demouname+ "dddd");
    	request.setAttribute("ff", demouname);
    	%>
    	
    	<jsp:include page="/checkdesignation.java"></jsp:include>
		<%
		
	System.out.print("admin welcome");	
	    
    %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>	
    
<head>
<link href="current.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome<%=demouname %></title>
<style type="text/css">
.nav a
{
color:#333;
padding-left: 20px;
}
.nav button
{
color:#333;
height:35px;
background-color: transparent;
border-color: #333;
cursor:pointer;
width:16%;
font-size: 18px;
font-family: halvetica;
font-weight: 500;
border: 1px solid transparent;
border-radius:5px;
display: inline-block;
}
.nav button:hover
{
background-color: rgb(255,235,205);
border-radius:10px;
color:rgb(51,51,51);
border-color: #333;
}
.nav button:active
{
background-color:#B6802F;
border-radius:10px;
color:rgb(51,51,51);
border-color: #333;
}
.header
{
color:red;

}
header
{
color:red;
}
</style>
</head>
<body>
<center>
<div style="width: 1000px;height:20px" >
<div style="width: 100%;height: 75px;float:left; background-color: rgb(60,185,66); color:blanchedalmond;vertical-align: middle">
<p align="center">
<font size="10" face="halvetica" >
Welcome to SUN INDUSTRIES
</font>
</p>
</div>
<div style="width: 1000px;height: 70px;float:left; background-color:rgb(60,185,66); vertical-align: middle" class="nav">
<p align="center" style="background-color:rgb(60,185,66);color:#333">
<font face="halvetica" size="5">

<%
String desig=request.getAttribute("ab").toString();
System.out.println(desig);

if(desig.equals("Admin"))
{%>
<a href="order.jsp" style="text-decoration: none"><button type="button">Order</button></a>
<a href="material.jsp" style="text-decoration: none"><button type="button">Material</button></a>  
<a href="employeehome.jsp" style="text-decoration: none"><button type="button">Employee</button></a>
<a href="viewproducts.jsp" style="text-decoration: none"><button type="button">Product</button></a>
<a href="createuser.jsp" style="text-decoration: none"><button type="button">Create User</button></a> 
 <%if(session.getAttribute("demouname")!=null) %>
 <a href="<%=request.getContextPath() %>/logout" style="text-decoration: none;"><button type="submit">Logout</button></a>

<%} %>

<%if(desig.equals("Manager"))
{%>
<a href="order.jsp" style="text-decoration: none"><button type="button">Order</button></a>
<a href="material.jsp" style="text-decoration: none"><button type="button">Material</button></a>  
<a href="employeehome.jsp" style="text-decoration: none"><button type="button">Employee</button></a>
<a href="viewproducts.jsp" style="text-decoration: none"><button type="button">Product</button></a>
 <%if(session.getAttribute("demouname")!=null) %>
 <a href="<%=request.getContextPath() %>/logout" style="text-decoration: none;"><button type="submit">Logout</button></a>
<% }%> 

<%if(desig.equals("Accoutant"))
{%>
<a href="order.jsp" style="text-decoration: none"><button type="button">Order</button></a>
<a href="viewproducts.jsp" style="text-decoration: none"><button type="button">Product</button></a>
 <%if(session.getAttribute("demouname")!=null) %>
 <a href="<%=request.getContextPath() %>/logout" style="text-decoration: none;"><button type="submit">Logout</button></a>
<% }%> 

<%if(desig.equals("Employee"))
{%>
<a href="vieworder.jsp" style="text-decoration: none"><button type="button">Order</button></a>
<a href="viewmaterial.jsp" style="text-decoration: none"><button type="button">Material</button></a>  

<a href="viewproducts.jsp" style="text-decoration: none"><button type="button">Product</button></a>
 <%if(session.getAttribute("demouname")!=null) %>
 <a href="<%=request.getContextPath() %>/logout" style="text-decoration: none;"><button type="submit">Logout</button></a>
<% }%> 


</font>
</p>
</div>
</div></center>
</body>
</head>
</html>  <%} %>