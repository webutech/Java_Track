  <%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>

<%!
    UserService service=ServiceFactory.createUserService();
%>
<%
    User u=new User();
    u.setLoginName(request.getParameter("loginName"));
    u.setPassword(request.getParameter("password"));
    try{
        User loggedInUser= service.login(u);
        //bind the user detail to session to track the user through his interaction
        //The session is allocated to the user
        session.setAttribute("aUser", loggedInUser);
        session.setAttribute("aUserId", loggedInUser.getUserId());

        pageContext.forward("welcome.jsp");
    }catch(UserAuthanticationException ex){
        pageContext.forward("index.jsp?msg="+ex.getMessage());
    }

    catch(SQLException ex){
        pageContext.forward("index.jsp?msg=Database server problem");
    }
    catch(Exception ex){
        pageContext.forward("index.jsp?msg=Faild to login, Unexpected problem");
    }
%>


