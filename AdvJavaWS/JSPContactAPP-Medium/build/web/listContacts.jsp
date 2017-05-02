 <%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>

<%!
ContactService contactService=ServiceFactory.createContactService();
%>
<%
    Integer loggedInUserId=(Integer)session.getAttribute("aUserId");
    List<Contact> contactList=contactService.findByUser(loggedInUserId);
    request.setAttribute("contactList", contactList);
    pageContext.forward("listContactView.jsp");
%>