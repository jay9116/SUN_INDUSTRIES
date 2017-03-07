<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    }
    
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
<a href="view/order.jsp" style="text-decoration: none"><button type="button">Order</button></a>
<a href="view/material.jsp" style="text-decoration: none"><button type="button">Material</button></a>
<a href="view/employeehome.jsp" style="text-decoration: none"><button type="button">Employee</button></a>
<a href="view/viewproducts.jsp" style="text-decoration: none"><button type="button">Product</button></a>
<a href="view/createuser.jsp" style="text-decoration: none"><button type="button">Create User</button></a>
 <%if(session.getAttribute("demouname")!=null) %>
 <a href="<%=request.getContextPath() %>/logout" style="text-decoration: none;"><button type="submit">Logout</button></a>
    
</font>
</p>
</div>
</div></center>
</body>
</head>
</html>