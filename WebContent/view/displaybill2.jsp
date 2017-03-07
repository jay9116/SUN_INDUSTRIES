<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>$UN</title>
<script type="text/javascript" src="gen_validatorv4.js"></script>


<script language="JavaScript" type="text/javascript">
 
 function fun()
{ 
	
	  var a=(document.bill.quant.value)*(document.bill.price.value); 
	
	  document.bill.total.value=parseInt(a);	
	  
   
}

</script>

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
<form method="post" action="<%=request.getContextPath() %>/insertbill" name="bill">
<div style="padding-top:20px ">
<table align ="center" border="0" style="font-family: halvetica;">
<tr>
<td colspan="4" align="center" style="color:#4D1F1F; font-family:halvetica;font-size: 25px"><br/>Bill Details</td>
</tr>
<tr><td>&nbsp;</td></tr>

		<input type="hidden" name="newname" size="13" value=<%=request.getParameter("pname")%>> 
		<input type="hidden" name="newsize" size="13" value=<%=request.getParameter("size")%>> 
		<input type="hidden" name="newquant" size="13" value=<%=request.getParameter("quant")%>> 
		

<tr>
	<td style="color:#4D1F1F;font-size:18px;font-family: halvetica;">
		Product Name:
	</td>


<td>
	<input type="text" name="pname" size="13" value=<%=request.getParameter("pname")%> disabled="disabled"> 
</td>
		
</tr>
<tr><td style="color:#4D1F1F;font-size:18px;font-family: halvetica;" >
Product Size:

</td>

<td>
<input type="text" name="size" size="13" placeholder="size"  value=<%=request.getParameter("size")%> disabled="disabled"> 
</td>

		
</tr>
<tr><td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Product quantity:

</td>

<td>
<input type="text" name="quant" size="13" value=<%=request.getParameter("quant")%> disabled="disabled"> 

</td>
		
</tr>

<tr><td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Product Price:

</td>

<td>
<input type="text" name="price" size="13" onblur="fun();"> 
</td>
		
	<td align="left" class="error_strings_header" id="bill_price_errorloc"  ></td>
	
</tr>


<tr><td style="color:#4D1F1F; font-size: 18px;font-family: halvetica;">
Total Amount:

</td>

<td>
<input type="text" name="total" size="13"> 
</td>
		
	<td align="left" class="error_strings_header" id="bill_total_errorloc" ></td>
	
</tr>

<tr><td>&nbsp;</td></tr>

<tr>
<td colspan="3" align="center">
<input type="Submit" name="insert" Value="Generate" size="100" width="100" class="button1"/>
<a href="bill.jsp" style="text-decoration: none;"><input type="button" value="Cancel" class="button1" /></a>
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

<script language="JavaScript" type="text/javascript" xml:space="preserve">
var frmvalidator  = new Validator("bill");

frmvalidator.EnableOnPageErrorDisplay();
frmvalidator.EnableMsgsTogether();

frmvalidator.addValidation("price","req","* Enter Price!!!");
frmvalidator.addValidation("total","req","*mandatory!!!");
//frmvalidator.addValidation("newweight","req","*Enter weight Value!!!");
</script>


</body>
</html>

