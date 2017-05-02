<jsp:useBean id="employee" class="com.yash.pojo.Employee" scope="request"/>
	
Name :  <jsp:getProperty property="name" name="employee"/><br>
Salary :  <jsp:getProperty property="salary" name="employee"/><br>
<br>
Address Details <br><hr>
H.No: ${employee.address.hno}<br>
state: ${employee.address.state}<br>
city: ${employee.address.city}<br>
Zip: ${employee.address.zip}

