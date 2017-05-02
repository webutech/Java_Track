<html>
    <head>
        <title>New Contact: Contact Application </title>
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
                    <h2>New Contact Form</h2>
                    <span class="message"> ${param.msg}</span>
                    <form action="contactAction.jsp">

                        <input type="submit" name="btnDeleteSelected" value="Delete Selected Records"/>

                        <table border="1" cellspacing="3" cellpadding="3">
                            <tr>
                                <th>SR</th>
                                <th>SELECT</th>
                                <th>NAME</th>
                                <th>PHONE</th>
                                <th>EMAIL</th>
                                <th>ADDRESS</th>
                                <th>CATEGORY</th>
                                <th>ACTION</th>
                            </tr>
                           <%-- ${requestScope.contactList}--%>
                        
                           <%
                           int i=0;
                    %>

                            <c:forEach items="${requestScope.contactList}" var="contact">
                                <tr>
                                    <td><%=++i%></td>
                                    <td><input type="checkbox" name="contactIds" value="${contact.contactId}"></td>
                                    <td>${contact.name}</td>
                                    <td>${contact.phone}</td>
                                    <td>${contact.email}</td>
                                    <td>${contact.address}</td>
                                    <td>${contact.category}</td>
                                    <td> <a href="editView.jsp?contactId=${contact.contactId}"> Edit </a> | <a href="deleteContact.jsp?contactId=${contact.contactId}"> Delete </a> </td>
                                </tr>
                               </c:forEach>

                                </table>
                            </form>

                        </td>
                    </tr>
                </table>
            </body>
        </html>
<%
    response.addHeader("Expires", "-2");
%>