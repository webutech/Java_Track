package com.ezeon.capp.servlet;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class ContactAppFrontControllerFilter implements Filter{
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println(req instanceof HttpServletRequest);

        HttpServletRequest request=(HttpServletRequest) req;
        HttpServletResponse response=(HttpServletResponse) resp;

        String uri=request.getRequestURI();
        String resource=uri.substring(uri.lastIndexOf("/")+1);
        //first page/login page will be executed without login

        
        if(resource.equals("") || resource.contains("index.jsp") || resource.contains("loginAction.jsp") || resource.contains("regForm.jsp") || resource.contains("regAction.jsp")){
            chain.doFilter(req, resp);//allow to execute this resource/page
            return;
        }

        HttpSession session=request.getSession();
        Integer loggedInUserId =  (Integer)session.getAttribute("aUserId");
        if(loggedInUserId==null){
            //session doesnot exists; user is not logged in
            response.sendRedirect("index.jsp?msg=User Session Does not exists! You must login to access the page ");//go back to login page
        }else{
            //uesr is logged in
            chain.doFilter(req, resp);//permit the page to execute
        }



        System.out.println("-----------doFilter----------"+resource);
    }

    public void destroy() {
        
    }

    public ContactAppFrontControllerFilter() {
         System.out.println("-----------ContactAppFrontControllerFilter obj created----------");
    }


}
