 <%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>
<c:if  test="${sessionScope.aUserId == null}">
    <%--user is not logged in--%>
<a href="index.jsp">HOME</a> |
<a href="regForm.jsp">REGISTRATION</a> |
<a href="index.jsp">LOGIN</a> |
<a href="about.jsp">ABOUT</a> |

</c:if>

<c:if  test="${sessionScope.aUserId != null}">
    <%--user is logged in--%>
<a href="welcome.jsp">HOME</a> |
<a href="newContact.jsp">NEW CONTACT</a> |
<a href="listContacts.jsp">CONTACT LIST</a> |
<a href="logout.jsp">LOGOUT</a> |
</c:if>