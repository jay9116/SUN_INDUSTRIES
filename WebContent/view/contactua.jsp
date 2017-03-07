<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Sun Industries</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="styles.css" rel="stylesheet" type="text/css" media="screen" />
<link href="css/" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/slider.css" />
<script type="text/javascript" src="gen_validatorv4.js"></script>
<script src="js/jquery-1.7.1.min.js"></script>
<script src="js/script.js"></script>
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
.fir 
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

<a href="#" style="text-decoration: none"><button type="button" class="button" id="current">Contact Us</button></a>

<a href="login.jsp" style="text-decoration: none"><button type="button" class="button">Login</button></a>
</font></p>
	</div>
	<div id="righttop"></div>
	<div id="rightbg">
	<div class="rightgrad">	
	 <div class="clr"></div><br/><br/>
  <center>Please fill up the form for futher Enquiry</center>
  <div class="a" ><br/><br/><center>
<form method="post" action="<%=request.getContextPath() %>/sendmail" name="contact">

			<input type="text" id="username" name="username" class="login_input" onblur="fun1()" placeholder="Enter Username"/>
			<table>
				<tr>
					<td class="error_strings header" id="contact_username_errorloc"></td>
				</tr>
			</table><br/>
				
			<input type="text" id="emailid" name="emailid" class="login_input" placeholder="Enter Email_Id"/>
			<table>
				<tr>
					<td id="contact_emailid_errorloc" class="error_strings header"></td>
				</tr>
			</table>
				<br/>
			<input type="text" id="subject" name="subject" class="login_input" placeholder="Enter Subject" />
			<table>
				<tr>
					<td id="contact_subject_errorloc" class="error_strings header"></td>
				</tr>
			</table>
			<br/>
			<textarea cols="19" rows="3" name="message" placeholder="Enter Message" class="fir"></textarea>
			<table>
				<tr>
					<td id="contact_message_errorloc" class="error_strings header"></td>
				</tr>
			</table><br/>
				<input type="submit" name="send" value="Send" class="button1" />
		
		</form>
	</center>
	</div>
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
<script language="JavaScript" type="text/javascript" xml:space="preserve">
	var frmvalidator  = new Validator("contact");

	frmvalidator.EnableOnPageErrorDisplay();
	frmvalidator.EnableMsgsTogether();

	frmvalidator.addValidation("username","req","*Please Enter your User Name!!!");

	frmvalidator.addValidation("subject","req","*Please Mention Subject!!!");

	frmvalidator.addValidation("message","req","*Please Enter Message!!!");

	frmvalidator.addValidation("emailid","req","*Please Enter Your EmailId!!!");
	frmvalidator.addValidation("emailid","maxlen=30","!!!");
	frmvalidator.addValidation("emailid","email");

</script>
</body>
</html>
