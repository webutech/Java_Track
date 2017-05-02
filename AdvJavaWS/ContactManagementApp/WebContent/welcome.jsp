<%
    response.addHeader("Expires", "-1");
%>
<html>
    <head>
        <title>Welcome: Contact Application </title>
          <META HTTP-EQUIV="Cache-Control" CONTENT="NO-CACHE">
        <style type="text/css">
            .message{
                color:red;
                font-weight:bold
            }
      </style>

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
                    <h2>Welcome to contact management application</h2>                   
                </td>
            </tr>
        </table>
    </body>
</html>
