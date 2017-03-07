<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>$UN</title>
<script type="text/javascript" src="gen_validatorv4.js"></script>

<style>
input 
{
height:40px;
width:200px;
color:#000;
border-radius:5px;
border:1px solid;
border-color: #333;
font-family: halvetica;
font-size:20px;
}

.button1
{
height:40px;
width:225px;
color:#000;
border:none;
border-radius:10px;
background-color:#B6802F;
padding-left: 0px;
cursor:pointer;
font-family:halvetica;
text-align: center;
font-size: 22px;
}

</style>


</head>
<body>
<%@include file="adminwelcome2.jsp" %>
<div id="content" style="padding-top : 10% ">
<center><!-- <div style="height: 200px;" ><img alt="sun" src="sun_logo1.png"></div> -->

<div style="padding-top:20px ">
</div>

<h2>Final bill</h2>
<table>

	<tr>
		<td>Product Name:</td>
		<td><%=request.getAttribute("a1") %></td>
	</tr>
	<tr>
		<td>Product Size:</td>
		<td><%=request.getAttribute("a2") %></td>
	</tr>
	<tr>
		<td>Product Quantity:</td>
		<td><%=request.getAttribute("a3") %></td>
	</tr>
	<tr>
		<td>Product Price:</td>
		<td><%=request.getAttribute("a4") %></td>
	<tr>	
		<td>Total Amount:</td>
		<td><%=request.getAttribute("a5") %></td>
	</tr>
	<tr>
			<td colspan="2"><br><a href="view/bill.jsp" style="text-decoration: none;">
			<input type="Button" Value="Back" class="button1" /></a></td>

	</tr>
</table>


</center>
</div>



</body>
</html>

