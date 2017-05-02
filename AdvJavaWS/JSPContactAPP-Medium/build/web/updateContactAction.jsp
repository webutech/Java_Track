 <%
    response.addHeader("Expires", "-1");
%>
<%@include file="imports.jsp" %>
<%!
ContactService service=ServiceFactory.createContactService();
%>

<%
    //read the form data from request
    String name=request.getParameter("name");
    String phone=request.getParameter("phone");
    String email=request.getParameter("email");
    String address=request.getParameter("address");
    String cat=request.getParameter("category");
    Integer loggedInUserId=(Integer)session.getAttribute("aUserId");
    Integer contactId=new Integer(request.getParameter("contactId"));//hidden field values

    Contact c=new Contact();
    c.setName(name);
    c.setEmail(email);
    c.setAddress(address);
    c.setCategory(cat);
    c.setPhone(phone);
    c.setUserId(loggedInUserId);
    c.setContactId(contactId);
    try{
        service.update(c);
       // out.print("data stored successfully");
        response.sendRedirect("listContacts.jsp?msg=Contact Updated Successfully(CID:"+contactId+"- "+c.getName()+")");
    }catch(Exception e){
        e.printStackTrace();
        pageContext.forward("editView.jsp?contactId="+contactId+"&msg=Failed to save contact");//go back to input form
    }


%>