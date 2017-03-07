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
<form method="post" action="<%=request.getContextPath() %>/material" name="material">
<div style="padding-top:20px ">
<table align ="center" border="0" style="font-family: halvetica;">
<tr>
<td colspan="4" align="center" style="color:#4D1F1F; font-family:halvetica;font-size: 25px"><br/>MATERIAL DETAILS</td>
</tr>
<tr><td>&nbsp;</td></tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Material Type:
	</td>

<td>
<select  name="type" style="width:200px;height: 40px; font-family: halvetica;font-size:20px;color:#9F3E00;font-style:bold;" >
<option value="Copper" style="font-family: halvetica;">Copper</option>
<option value="Brass" style="font-family: halvetica;">Brass</option>
<option value="BrassSheet" style="font-family: halvetica;">BrassSheet</option>
</select>

</td>
		
</tr>
<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Material Size:

</td>

<td>
<input type="text" name="size" size="13" placeholder="size"> 
</td>

<td align="left" class="error_strings_header" id="material_size_errorloc" width="100"></td>
		
</tr>
<tr><td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Material Weight:

</td>

<td>
<input type="text" name="weight" size="13" placeholder="weight in kg"> 

</td>
<td align="left" class="error_strings_header" id="material_weight_errorloc" ></td>
		
</tr>
<tr><td>&nbsp;</td></tr>

<tr>
<td colspan="3" align="center">
<input type="Submit" name="insert" Value="Add" size="100" width="100" class="button1"/>
<input type="reset" Value="Clear" class="button1" />
</td>
</tr>
<tr>
<td>&nbsp;
</td>
</tr>
<tr>
<td  align="left" style="color:#4D1F1F;font-size:18px;font-family: halvetica;"><a href="updatematerial.jsp" style="text-decoration:none;color:#4D1F1F;">Update Material</a></td>
<td></td>
<td><a href="viewmaterial.jsp" style="text-decoration:none;color:#4D1F1F;">View Material</a></td>
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

frmvalidator.addValidation("size","req","*Please Enter Size!!!");
frmvalidator.addValidation("weight","req","*Please Enter Weight!!!");
</script>


</body>
</html>

