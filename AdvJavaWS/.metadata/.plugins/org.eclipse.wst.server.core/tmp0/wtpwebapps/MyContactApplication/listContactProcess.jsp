<%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>

<%!
	ContactService contactService=new ContactServiceImpl();
%>

<%
	Integer userId=(Integer)session.getAttribute("loggedInUserId");
	List<Contact>contactList=contactService.listAllContactsByUserId(userId);
	request.setAttribute("contactList", contactList);
	pageContext.forward("listContactView.jsp");
	
%>