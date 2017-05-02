package com.yash.cms.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class ContactAppFrontControllerFilter
 */
@WebFilter("/ContactAppFrontControllerFilter")
public class ContactAppFrontControllerFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ContactAppFrontControllerFilter() {
    	
    	 System.out.println("-----------ContactAppFrontControllerFilter obj created----------");
       
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println(request instanceof HttpServletRequest);

        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;

        String uri=req.getRequestURI();
        String resource=uri.substring(uri.lastIndexOf("/")+1);
        //first page/login page will be executed without login
        if(resource.equals("") || resource.contains("index.jsp") || resource.contains("loginProcess.jsp") || resource.contains("registration.jsp") || resource.contains("registrationProcess.jsp")){
            chain.doFilter(req, res);//allow to execute this resource/page
            return;
        }
        HttpSession session=((HttpServletRequest) request).getSession();
        Integer loggedInUserId =  (Integer)session.getAttribute("loggedInUserId");
        if(loggedInUserId==null){
            //session doesnot exists; user is not logged in
            ((HttpServletResponse) response).sendRedirect("index.jsp?msg=User Session Does not exists! You must login to access the page ");//go back to login page
        }else{
            //uesr is logged in
            chain.doFilter(req, res);//permit the page to execute
        }
        
        
        System.out.println("-----------doFilter----------"+resource);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
