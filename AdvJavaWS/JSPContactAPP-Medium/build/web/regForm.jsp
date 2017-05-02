<%
    response.addHeader("Expires", "-1");
%>
<html>
    <head>
        <title>New Registration: Contact Application </title>
          <META HTTP-EQUIV="Cache-Control" CONTENT="NO-CACHE">
    </head>
    <body background="images/bg.png">
        <table border="1" width="80%" align="center">
            <tr>
                <td height="30"><h2>Welcome to Contact Application</h2></td>
            </tr>
            <tr>
                <td  height="20"> <%@include file="menu_top.jsp"%> </td>
            </tr>
            <tr>
                <td  height="400" valign="top">
                    <h2>User Registration Form</h2>
                    ${param.msg} <br/><br/>
                    <form action="regAction.jsp" method="post">
                        <table border="0" cellpadding="5" cellspacing="3">
                        <tr>
                            <td>NAME</td>
                            <td><input type="text" name="name"/></td>
                        </tr>
                         <tr>
                            <td>PHONE</td>
                            <td><input type="text" name="phone"/></td>
                        </tr>
                         <tr>
                            <td>EMAIL</td>
                            <td><input type="text" name="email"/></td>
                        </tr>
                         <tr>
                            <td>ADDRESS</td>
                            <td>
                                <textarea name="address" rows="3" cols="20"></textarea>
                            </td>
                        </tr>
                         <tr>
                            <td>LOGIN NAME</td>
                            <td><input type="text" name="loginName"/></td>
                        </tr>
                           <tr>
                            <td>PASSWORD</td>
                            <td><input type="password" name="password"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" align="right">

                                <input type="submit" name="Login"/>
                            </td>
                         </tr>
                    </table>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
