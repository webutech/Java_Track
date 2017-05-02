<%@page import="java.sql.*"%>
<%@ page errorPage="errorPage.jsp" %>

<%
	Connection con=null;
	String url="jdbc:mysql://localhost/mydb";
	String username="root";
	String pwd="root";
	String userid=request.getParameter("userid");
	String password=request.getParameter("pwd");
	System.out.println(userid+", "+password);
	try{
	//register driver
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url,username,pwd);
	System.out.println(con);
	Statement stmt=con.createStatement();
	System.out.println(stmt);
	ResultSet rs=stmt.executeQuery("select * from users where username='"+userid+"' and password='"+password+"'");
	System.out.println(rs);
	
	if(rs.next()){
		session.setAttribute("userid",userid);
		pageContext.forward("welcome.jsp");
	}
	else{
		request.setAttribute("errMsg", "User id or password is incorrect");
		pageContext.forward("home.jsp");
	}
	
	}// try end
	catch(SQLException ex){
		
		
	}
	finally{
		con.close();
	}
		
%>
