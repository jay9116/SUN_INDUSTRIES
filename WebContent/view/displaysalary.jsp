<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="gen_validatorv4.js"></script>
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
<form method="post" action="<%=request.getContextPath() %>/" name="material">
<div style="padding-top:20px ">
<table align ="center" border="0" style="font-family: halvetica;">
<tr>
<td colspan="4" align="center" style="color:#4D1F1F; font-family:halvetica;font-size: 25px"><br/>SALARY</td>
</tr>
<tr><td>&nbsp;</td></tr>
<tr>
	<td width=170px style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Name</td><td width="20px">:
	</td>

<td>
<%=request.getAttribute("a") %>
</td>
		
</tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Date</td><td >:
	</td>

<td>
<%=request.getAttribute("d") %>
</td>
		
</tr>

<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Basic Rate</td><td>:
	</td>

<td>
<%=request.getAttribute("b") %>
</td>
		
</tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		OverTime Rate</td><td >:
	</td>

<td>
<%=request.getAttribute("c") %>
</td>
		
</tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Working Days</td><td >:
	</td>

<td>
<%=request.getAttribute("e") %>
</td>
		
</tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Overtime Hours</td><td >:
	</td>

<td>
<%=request.getAttribute("f") %>
</td>
		
</tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Total Basic Salary</td><td >:
	</td>
<td>
<%=request.getAttribute("g") %>
</td>
		
</tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Total OverTime Salary</td><td >:
	</td>

<td>
<%=request.getAttribute("h") %>
</td>
		
</tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Total Salary</td><td >:
	</td>

<td>
<%=request.getAttribute("i") %>
</td>
		
</tr>



<tr><td>&nbsp;</td></tr>
<tr><td>&nbsp;</td></tr>
<tr>
<td colspan="3" align="center">
<a href="view/employeelist.jsp" style="text-decoration: none;"><input type="Button" Value="Back" class="button1" /></a>
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


<script language="JavaScript" type="text/javascript" xml:space="preserve">
var frmvalidator  = new Validator("material");

frmvalidator.EnableOnPageErrorDisplay();
frmvalidator.EnableMsgsTogether();

frmvalidator.addValidation("size","req","*Enter size!!!");
</script>
</body>
</html>

