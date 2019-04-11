package com.tzw.mycircle.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Order(0)
@WebFilter(filterName = "testFilter",urlPatterns = "/*")
public class testFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
               HttpSession session = req.getSession();
               Object user = (Object) session.getAttribute("user");
            if(user != null){
                     filterChain.doFilter(servletRequest,servletResponse);
               }else{
                filterChain.doFilter(servletRequest,servletResponse);

            }
    }

    @Override
    public void destroy() {

    }
}
