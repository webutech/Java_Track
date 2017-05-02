  <%
    response.addHeader("Expires", "-1");
%>
<%!
ContactService service=ServiceFactory.createContactService();
%>
<%
    //read the contactId from query string(parameter)
    Integer cid = new Integer(request.getParameter("contactId"));
    //existing contact
    Contact contact=service.findById(cid);
    request.setAttribute("contact", contact);
%>

<html>
    <head>
        <title>New Contact: Contact Application </title>
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

                    <%-- <%=request.getParameter("msg")%>--%>

                    <span class="message"> ${param.msg}</span>

                    <form action="updateContactAction.jsp" method="post">
                        <input type="hidden" name="contactId" value="${requestScope.contact.contactId}">

                        <table border="0" cellpadding="5" cellspacing="3">
                            <tr>
                                <td>Name</td>
                                <td><input type="text" name="name" value="${contact.name}"/></td>
                            </tr>
                            <tr>
                                <td>Phone</td>
                                <td><input type="text" name="phone" value="${contact.phone}"/></td>
                            </tr>
                            <tr>
                                <td>Email</td>
                                <td><input type="text" name="email" value="${contact.email}"/></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td>
                                    <textarea name="address" rows="3" cols="20">${contact.address}</textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>Category</td>
                                <td>
                                    
                                    <select name="category" id="category">
                                         <option value="noset">--- Select Category---</option>
                                         <option value="FRIEND" selected>FRIEND</option>
                                         <option value="FAMILY">FAMILY</option>
                                         <option value="BUSINESS">BUSINESS</option>
                                         <option value="OTHER">OTHER</option>
                                    </select>

                                    <script type="text/javascript">
                                   document.getElementById("category").value='${contact.category}';
                          </script>                                    

                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" align="right">
                                   <input type="submit" name="btn" value="Submit"/>
                                </td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
