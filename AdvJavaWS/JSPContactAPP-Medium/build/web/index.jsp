<%
    response.addHeader("Expires", "-1");
%>

<html>
    <head>        
        <title>Home: Contact Application </title>
        <style type="text/css">
            .message{
                color:red;
                font-weight:bold
            }
      </style>
        <META HTTP-EQUIV="Cache-Control" CONTENT="NO-CACHE">

    </head>
    
    <body background="images/bg.png">
        <table border="1" width="80%" align="center">
            <tr>
                <td height="30"><h2>Welcome to Contact Application</h2></td>
            </tr>
            <tr>
                <td  height="20">
                    <%@include file="menu_top.jsp"%>
                </td>
            </tr>
            <tr>
                <td  height="400" valign="top">
                    <h2>Login Form</h2>

                   <%-- <%=request.getParameter("msg")%>--%>

                   <span class="message"> ${param.msg}</span>

                    <form action="loginAction.jsp" method="post">
                        <table border="0" cellpadding="5" cellspacing="3">
                        <tr>
                            <td>Login Name</td>
                            <td><input type="text" name="loginName"/></td>
                        </tr>
                           <tr>
                            <td>Password</td>
                            <td><input type="password" name="password"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="right">
                               
                                <a href="regForm.jsp">Sign Up</a> <input type="submit" name="Login" value="Login"/>
                            </td>
                         </tr>
                    </table>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
