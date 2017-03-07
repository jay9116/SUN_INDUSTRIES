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
<%@include file="adminwelcome.jsp" %>
<div id="content" style="padding-top : 10% ">
<center><!-- <div style="height: 200px;" ><img alt="sun" src="sun_logo1.png"></div> -->

<jsp:include page="/calculate"></jsp:include>

<%
String bas=request.getAttribute("a").toString();
int basic=Integer.parseInt(bas);

String ot=request.getAttribute("b").toString();
int ot_rate=Integer.parseInt(ot);


%>

<form method="post" action="<%=request.getContextPath() %>/finalsalary" name="calculate">
<div style="padding-top:20px ">
<table align ="center" border="0" style="font-family: halvetica;">
<tr>
<td colspan="4" align="center" style="color:#4D1F1F; font-family:halvetica;font-size: 25px"><br/>CALCULATE SALARY</td>
</tr>
<tr><td>&nbsp;</td></tr>
<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Name:<font color="Red">*</font>

</td>

<td>
<input type="text" name="name" size="13" value=<%=request.getParameter("name") %> disabled="disabled"> 
<input type="hidden" name="name" size="13" value=<%=request.getParameter("name") %> > 

</td>
</tr>

<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
	Basic Rate:<font color="Red">*</font>
	</td>

<td>
<input type="text" name="b_rate" size="13" value=<%=basic %> disabled="disabled"> 
<input type="hidden" name="b_rate" size="13" value=<%=basic %> > 
</td>
</tr>

<tr>
<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
OverTime Rate:
<font color="Red">*</font>
</td>

<td>
<input type="text" name="o_rate" size="13" value=<%=ot_rate %> disabled="disabled"> 
<input type="hidden" name="o_rate" size="13" value=<%=ot_rate %>> 
</td>
</tr>


<tr>
<td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Date:<font color="Red">*</font>
</td>

<td>
<input type="date" name="date" size="13"> 

</td>
<td align="left" class="error_strings_header" id="calculate_date_errorloc" ></td>
		
</tr>


<tr>
<td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Working Days:<font color="Red">*</font>
</td>

<td>
<input type="text" name="days" size="13" placeholder="Enter Days"> 

</td>
<td align="left" class="error_strings_header" id="calculate_days_errorloc" ></td>
		
</tr>


<tr>
<td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
OverTime Hours:<font color="Red">*</font>
</td>

<td>
<input type="text" name="o_hours" size="13" placeholder="Overtime Hours"> 

</td>
<td align="left" class="error_strings_header" id="calculate_o_hours_errorloc" ></td>
		
</tr>
<tr><td>&nbsp;</td></tr>

<tr>
<td colspan="3" align="center">
<input type="Submit" name="calculate" Value="calculate" size="100" width="100" class="button1"/>
<input type="reset" Value="Clear" class="button1" />
</td>
</tr>
<tr>
<td>&nbsp;
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

