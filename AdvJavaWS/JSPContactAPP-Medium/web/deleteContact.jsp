
<%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>
<%!
ContactService service=ServiceFactory.createContactService();
%>
<%
    Integer contactId=new Integer(request.getParameter("contactId"));
    service.delete(contactId);
    response.sendRedirect("listContacts.jsp?msg=Contact Deleted");
%>