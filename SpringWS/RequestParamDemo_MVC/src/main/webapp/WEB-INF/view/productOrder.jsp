<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product order</title>

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

#orderForm{
	margin: auto;
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
				<a href="./orderProduct">ORDER PRODUCT |</a>
				<a href="#">SIGN IN |</a>
				<a href="#">SIGN UP</a>			
			</div>
		
		</div>
		<div id="mainContent">
			<h1>Order your product</h1>
			<div id="orderForm">
			<form action="./processProduct" method="post">
				<center>
				<table border="1" >
					<tr>
						<td>Choose Product</td>
						<td>
							<select name="product">
								<option value="pen">pen</option>
								<option value="pencil">pencil</option>
								<option value="marker">marker</option>
								<option value="laptop">laptop</option>							
							</select>
						</td>
					</tr>
					<tr>
						<td>Quantity</td>
						<td><input type="text" name="quantity"/></td>
					</tr>
					<tr>						
						<td colspan="2" style="{text-align: right;}"><input type="submit" value="Order"/></td>
					</tr>
				</table>
				</center>
			</form>
			</div>
		
		</div>
		<div id="footer">
			<h4>Created by pankaj</h4>
		</div>
		
	</div>

</body>
</html>