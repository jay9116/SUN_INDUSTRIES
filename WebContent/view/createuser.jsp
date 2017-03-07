<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<%@include file="adminwelcome.jsp" %>
<div id="content" style="padding-top : 10% ">
<center><!-- <div style="height: 200px;" ><img alt="sun" src="sun_logo1.png"></div> -->
<form method="post" action="<%=request.getContextPath() %>/createuser" name="createuser">
<div style="padding-top:20px ">
<table align ="center" border="0" style="font-family: halvetica;">
<tr>
<td colspan="2" align="center" style="color:#4D1F1F; font-family:halvetica;font-size: 25px"><br/>Enter User Details</td>
</tr>
<tr><td>&nbsp;</td></tr>
<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		First Name:
	</td>
	
<td>
<input type="text" name="fname" size="13" placeholder="Name">
</td>


</tr>
<tr>
<td>&nbsp;</td>
<td class="error_strings_header" id="createuser_fname_errorloc" width="auto"></td>
</tr>
<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
User Name:

</td>

<td>
<input type="text" name="uname" size="13" placeholder="Username"> 
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td class="error_strings_header" id="createuser_uname_errorloc" width="auto"></td>
</tr>

<tr><td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Password:

</td>

<td>
<input type="password" name="pass" size="13" placeholder="Password"> 

</td>
</tr>
<tr>
<td>&nbsp;</td>
<td class="error_strings_header" id="createuser_pass_errorloc" width="auto"></td>
</tr>

<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Confirm Password:

</td>

<td>
<input type="password" name="repass" size="13" placeholder="Re-password"> 
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td class="error_strings_header" id="createuser_repass_errorloc" width="auto"></td>
</tr>

<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Designation:

</td>

<td>
<select  name="designation" style="width:200px;height: 40px; font-family: halvetica;font-size:20px;color:#9F3E00;font-style:bold;" >
<option value="Admin" style="font-family: halvetica;">Admin</option>
<option value="Manager" style="font-family: halvetica;">Manager</option>
<option value="Accoutant" style="font-family: halvetica;">Accountant</option>
<option value="Employee" style="font-family: halvetica;">Employee</option>
</select>

 
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td class="error_strings_header" id="createuser_designation_errorloc" width="auto"></td>
</tr>

<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Contact:

</td>

<td>
<input type="text" name="contact" size="13" placeholder="Contact"> 
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td class="error_strings_header" id="createuser_contact_errorloc" width="auto"></td>
</tr>

<tr><td>&nbsp;</td></tr>
<tr>
<td colspan="3" align="center">
<input type="Submit" name="insert" Value="Create" size="100" width="100" class="button1"/>
<a href="adminwelcome.jsp" style="text-decoration:none;"><input type="Button" Value="Cancel" class="button1" /></a>
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
var frmvalidator  = new Validator("createuser");

frmvalidator.EnableOnPageErrorDisplay();
frmvalidator.EnableMsgsTogether();

frmvalidator.addValidation("fname","req","*Enter your Fname!!!");

frmvalidator.addValidation("uname","req","*Enter Username!!!");

frmvalidator.addValidation("pass","req","*Enter Password!!!");

frmvalidator.addValidation("repass","eqelmnt=pass","Password Not Match!!!");

frmvalidator.addValidation("designation","req","*Enter Designation!!!");

frmvalidator.addValidation("contact","req","*Enter Mobile Number!!!");
frmvalidator.addValidation("contact","maxlen=12","*Enter Correct Mobile Number!!!");
frmvalidator.addValidation("contact","minlen=10","*Enter Correct Mobile Number!!!");
frmvalidator.addValidation("contact","numeric","*Mobile Number Should in Numeric Form Only!!!");


</script>

</body>
</html>