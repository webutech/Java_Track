<jsp:useBean id="employee" class="com.yash.pojo.Employee" scope="request">
	<jsp:setProperty name="employee" property="*"/>
	
</jsp:useBean>

<jsp:useBean id="address" class="com.yash.pojo.Address" scope="request">
	<jsp:setProperty name="address" property="*"/>
</jsp:useBean>

<%employee.setAddress(address); %>

<jsp:forward page="/employeeView.jsp"/>
