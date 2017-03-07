<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>$UN</title>


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

.input1 
{
height:40px;
width:95px;
color:#000;
border-radius:5px;
border:1px solid;
border-color: #333;
font-family: halvetica;
font-size:20px;
}
.input2 
{
height:10px;
width:10px;
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
<%@include file="adminwelcome.jsp" %>
<div id="content" style="padding-top : 10% ">
<center><!-- <div style="height: 200px;" ><img alt="sun" src="sun_logo1.png"></div> -->
<form method="post" action="<%=request.getContextPath() %>/updatefinal" name="material">
<div style="padding-top:20px ">
<table align ="center" border="0" style="font-family: halvetica;">
<tr>
<td colspan="4" align="center" style="color:#4D1F1F; font-family:halvetica;font-size: 25px"><br/>UPDATE MATERIAL</td>
</tr>
<tr><td>&nbsp;</td></tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Material Type:
		<%String type=request.getParameter("type"); %>
		<%=type %>
		<input type="hidden" name="newtype" value=<%=type %> > 
	</td>

<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Material Size:
<%String size=request.getParameter("size");%>
<%=size %>
<input type="hidden" name="newsize" value=<%=size %> > 
</td>
</tr>

<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Material Weight:
<%if(request.getParameter("radio").equals("add"))
{
	String a = request.getParameter("weight");
	double b = Double.parseDouble(a);
	String c = request.getParameter("newweight");
	double d = Double.parseDouble(c);
	double ans= b+d; %>
	<%=ans%> 
			<input type="hidden" name="newweight" value=<%=ans %> > 

	
<%} %>

<%if(request.getParameter("radio").equals("sub"))
{
	String a = request.getParameter("weight");
	double b = Double.parseDouble(a);
	String c = request.getParameter("newweight");
	double d = Double.parseDouble(c);
	double ans= b-d; %>
	<%=ans%> 
			<input type="hidden" name="newweight" value=<%=ans %> > 

	
<%} %>

</td>

</tr>
<tr>
<td colspan="3" align="center">
<input type="Submit" name="insert" Value="Update" size="100" width="100" class="button1"/>
<a href="material.jsp" style="text-decoration: none;"><input type="Button" Value="Cancel" class="button1" /></a>
</td>
</tr>
</table>
</div>



<!--<input type="text" id="txt1" name="uname" placeholder="Username"  />
 <div style="padding-top:20px"><input type="password" id="txt2" name="pass" placeholder="Password" /></div>
<div style="padding-top:20px"><input type="submit" value="Login" class="button1"></div> -->
</form>
</center>
</div>



</body>
</html>

