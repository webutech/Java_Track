<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product home</title>


<style>
body {
    background-color: lightblue;
}

h1 {
    color: white;
    text-align: center;
}

p {
    font-family: verdana;
    font-size: 20px;
}

#container{
	margin: 10px;
}

#nav{
	margin:auto;
	border-radius: 25px;
    background: #73AED1;
    padding: 20px; 
    width: 350px;
    height: 20px; 
}

#footer{
	margin: auto;
}
</style>


</head>
<body>
	<div id="container">
		<div id="header">
			<div id="nav">
				<a href="#">HOME |</a>
				<a href="./productOrder">ORDER PRODUCT |</a>
				<a href="#">SIGN IN |</a>
				<a href="#">SIGN UP</a>			
			</div>
		
		</div>
		<div id="mainContent">
			<h1>Success ! Your Order is placed. Below is your Receipt</h1>
			<center>
			<p>
				<table border="1">
					<tr>
						<td>Product Name</td>
						<td>${product}</td>
					</tr>
					<tr>
						<td>Quantity</td>
						<td>${quantity}</td>
					</tr>
					<tr>
						<td>Total</td>
						<td>${total}</td>
					</tr>
				</table>
			</p>
			</center>
		
		</div>
		<div id="footer">
			<h4>Created by pankaj</h4>
		</div>
		
	</div>
	

</body>
</html>