<jsp:useBean id="employee" class="com.yash.pojo.Employee" scope="request"/>
<h2>Thanks for the Registration</h2><br>
Name :  <jsp:getProperty property="name" name="employee"/><br>
Salary :  <jsp:getProperty property="salary" name="employee"/><br>
Address Information <br><hr>
HNo : ${employee.address.hno}<br>
State : ${employee.address.state}<br>
City : ${employee.address.city}<br>
Zip : ${employee.address.zip}<br>