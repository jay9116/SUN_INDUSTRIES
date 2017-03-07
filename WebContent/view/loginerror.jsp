<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Sun Industries</title>
<meta name="keywords" content="" />
<meta name="description" content="" />

<script type="text/javascript" src="gen_validatorv4.js"></script>
<script>
function fn(x)
{
	if(x.value=="   Username")
	{
		x.value="";
		x.style.color="black";
	}
	x.style.color="black";	

	if(x.value=="   Password")
	{
		x.type="password";
		x.value="";
		x.style.color="black";	
	}
}
</script>
<style>
input 
{
height:40px;
width:225px;
color:#000;
border-radius:5px;
border:1px solid;
border-color: #333;

}

.button1
{
height:40px;
width:225px;
color:#FFEBCD;
border:none;
border-radius:10px;
background-color:#000;
padding-left: 0px;
cursor:pointer;

}

</style>

<link href="styles.css" rel="stylesheet" type="text/css" media="screen" />
<link href="css/" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/slider.css" />
<script type="text/javascript" src="gen_validatorv4.js"></script>
<script src="js/jquery-1.7.1.min.js"></script>
<script src="js/script.js"></script>

</head>
<body>
<div id="content">
<!-- header begins -->
<!-- header ends -->
<!-- content begins -->
<div id="main">
<div id="conbot">
	<div id="right">
	<div id="logo">
		Welcome to SUN INDUSTRIES
		
	</div>
	 <div id="">
	 <p align="center" style="color:#333">
<font face="halvetica" size="5">

		<a href="Home.jsp" style="text-decoration: none"><button type="button" class="button">Home</button></a>

<a href="Gallery.jsp" style="text-decoration: none"><button type="button" class="button">Gallery</button></a>

<a href="AboutUs.jsp" style="text-decoration: none"><button type="button" class="button">About Us</button></a>

<a href="#" style="text-decoration: none"><button type="button" class="button">Contact Us</button></a>

<a href="login.jsp" style="text-decoration: none"><button type="button" class="button" id="current">Login</button></a>
</font></p>
	</div>
	<div id="righttop"></div>
	<div id="rightbg">
	<div class="rightgrad">	
	 <div class="clr"></div>
  
  <div class="a" ><br /><br/>
<br /><br/><center>
<form method="post" action="<%=request.getContextPath()%>/login" name="login" align="center">
<div style="padding-top:20px ">
	<p>Enter correct username or password</p>
	<input type="text" id="txt1" name="uname" placeholder="Username"  />
	<table>
		<tr>
			<td align="left" class="error_strings_header" id="login_uname_errorloc" ></td>
		</tr>
	</table>
</div>
<div style="padding-top:20px"><input type="password" id="txt2" name="pass" placeholder="Password" />
<table>
		<tr>
			<td align="left" class="error_strings_header" id="login_pass_errorloc" ></td>
		</tr>
	</table>
</div>
<div style="padding-top:20px"><input type="submit" value="Login" class="button1"></div>
</form></center>		</div>
	</div>
	
		<div class="borbot"></div>
		
		
	
		
	</div>
	</div>
	
	
	
		<div id="left">
	<div id="header"></div>
	<div id="lefttop"></div>
		<div id="leftbg">
			<!--<div class="leftgrad">
				<h3>Archives</h3>
				<div id="archives">
				<ul>
					<li><a href="#">Sed dignissim placerat tellus </a></li>
					<li><a href="#">Donec egestas purus sed nisl</a></li>
					<li><a href="#">Nulla a diam nec magna</a></li>
					<li><a href="#">Sed et arcu porta quam aliquam </a></li>
					<li><a href="#">Morbi metus sapien, congue</a></li>
					<li><a href="#">Nullam aliquet nisl eu mi convallis viverra</a></li>
					<li><a href="#">Praesent eros velit, vulputate id pretium in</a></li>
				</ul>
				</div>
			</div>-->
			<div class="leftgrad">
			<h3>Our Esteemed Clients</h3>
			<div id="last">
				<ul><br/>
					<li>Kolkata Radiators</li><br/>
					<li>Punjab Radiators</li><br/>
					<li>K.K Radiators</li><br/>
					<li>Patel Radiators</li><br/>
					<li>Shah Radiators</li><br/>
					<li>Magnify Radiators</li><br/>
					<li>Expert Radiators</li><br/>
					<li>Delhi Radiators</li><br/>
					
				</ul>
			</div>
			</div>
		</div>
	</div><div style="clear:both;"></div>
<!--content ends -->
<!--<div id="mainbot"></div>-->

</div>
</div>
<!--footer begins -->
<div id="footer">
<p><a href="AboutUs.jsp">About Us </a> :: <a href="#">Contact Us </a></p> 
	<p>Design by : <!-- Do not Remove -->
Jay Patel
<!--End of notice -->
		</p>
	</div>
</div>
<!-- footer ends-->
<script language="JavaScript" type="text/javascript" xml:space="preserve" class=script1>
var frmvalidator  = new Validator("login");

frmvalidator.EnableOnPageErrorDisplay();
frmvalidator.EnableMsgsTogether();

frmvalidator.addValidation("uname","req","*Please Enter your User Name!!!");
frmvalidator.addValidation("pass","req","*Please Enter your Password!!!");



</script>
</body>
</html>
