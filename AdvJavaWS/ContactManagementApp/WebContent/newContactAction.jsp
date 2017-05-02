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
    
    Contact c=new Contact();
    c.setName(name);
    c.setEmail(email);
    c.setAddress(address);
    c.setCategory(cat);
    c.setPhone(phone);
    c.setUserId(loggedInUserId);
    try{
        service.save(c);
       // out.print("data stored successfully");
        response.sendRedirect("listContacts.jsp?msg=Contact Saved Successfully");
    }catch(Exception e){
        e.printStackTrace();
        pageContext.forward("newContact.jsp?msg=Failed to save contact");//go back to input form
    }


%>