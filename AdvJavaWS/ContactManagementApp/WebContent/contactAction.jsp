
<%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>
<%!
ContactService service=ServiceFactory.createContactService();
%>
<%  
     String contactIds[]=request.getParameterValues("contactIds");
     for(String cid: contactIds){
         service.delete(new Integer(cid));
     }

    response.sendRedirect("listContacts.jsp?msg=Contact(s) Deleted");
%>

<%
   

%>