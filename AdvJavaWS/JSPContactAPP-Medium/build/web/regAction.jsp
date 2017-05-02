  <%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>
<jsp:useBean  id="user" class="com.ezeon.capp.domain.User" scope="request"/>
<jsp:setProperty name="user" property="*"/>
<%!
    UserService service=ServiceFactory.createUserService();
%>

<%
    try{
       service.register(user);
       //success
       pageContext.forward("index.jsp?msg=User Registration Successful, Please Login"); //after successful reg go to login.jsp page
    }catch(Exception e){
        //fail
        pageContext.forward("regForm.jsp?msg=Failed to register user"); //go back to reg form
    }
%>