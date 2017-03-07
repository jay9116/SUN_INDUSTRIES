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
<form method="post" action="<%=request.getContextPath() %>/insertorder" name="order">
<div style="padding-top:20px ">
<table align ="center" border="0" style="font-family: halvetica;">
<tr>
<td colspan="4" align="center" style="color:#4D1F1F; font-family:halvetica;font-size: 25px"><br/>PLACE ORDER</td>
</tr>
<tr><td>&nbsp;</td></tr>
<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Order Date:<font color="Red">*</font>

</td>

<td>
<input type="date" name="date" size="13" placeholder="date"> 
</td>

<td align="left" class="error_strings_header" id="order_date_errorloc" width="100"></td>
		
</tr>

<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
	Order Product:<font color="Red">*</font>
	</td>

<td>
<select  name="product" style="width:200px;height: 40px; font-family: halvetica;font-size:20px;color:#9F3E00;font-style:bold;" >
<option value="M.car" style="font-family: halvetica;">M.car</option>
<option value="SE" style="font-family: halvetica;">SE</option>
<option value="JCB" style="font-family: halvetica;">JCB</option>
</select>

</td>

<td align="left" class="error_strings_header" id="order_product_errorloc" width="100"></td>

		
</tr>
<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
Order Product Size:
<font color="Red">*</font>
</td>

<td>
<input type="text" name="psize" size="13" placeholder="size"> 
</td>

<td align="left" class="error_strings_header" id="order_psize_errorloc" width="100"></td>
		
</tr>
<tr><td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Order Quantity:<font color="Red">*</font>
</td>

<td>
<input type="text" name="quantity" size="13" placeholder="order quantity"> 

</td>
<td align="left" class="error_strings_header" id="order_quantity_errorloc" ></td>
		
</tr>

<tr><td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Order Description:

</td>

<td>
<input type="text" name="description" size="13" placeholder="order description"> 

</td>
<td align="left" class="error_strings_header" id="order_descripton_errorloc" ></td>
		
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

</table>

<a href="bill.jsp" style="text-decoration:none;color:#4D1F1F;"><h3>Generate Bill</h3></a>
<a href="vieworder.jsp" style="text-decoration:none;color:#4D1F1F;"><h3>View Order</h3></a>
</div>



<!--<input type="text" id="txt1" name="uname" placeholder="Username"  />
 <div style="padding-top:20px"><input type="password" id="txt2" name="pass" placeholder="Password" /></div>
<div style="padding-top:20px"><input type="submit" value="Login" class="button1"></div> -->
</form>
</center>
</div>

<script language="JavaScript" type="text/javascript" xml:space="preserve">
var frmvalidator  = new Validator("order");

frmvalidator.EnableOnPageErrorDisplay();
frmvalidator.EnableMsgsTogether();

frmvalidator.addValidation("psize","req","*Enter Size!!!");
frmvalidator.addValidation("quantity","req","*Enter Quantity!!!");
frmvalidator.addValidation("date","req","*Select Date!!!");
</script>


</body>
</html>

