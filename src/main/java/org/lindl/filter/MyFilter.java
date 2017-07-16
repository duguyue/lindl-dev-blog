package org.lindl.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by lin on 2017/7/16.
 */
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest sRequest= (HttpServletRequest) request;
        System.out.println("this is MyFilter,url :"+sRequest.getRequestURI());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
