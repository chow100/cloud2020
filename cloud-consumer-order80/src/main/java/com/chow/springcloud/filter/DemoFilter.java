package com.chow.springcloud.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


/**
 * 测试过滤器
 *
 * @WebFilter 注解声明这个类是过滤器类，urlPatterns 是要过滤的地址
 */
@Component
@WebFilter(urlPatterns = "/consumer,/consumer2", filterName = "filter1")
public class DemoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("程序初始化了");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("doFilter()开始执行：发往 " + ((HttpServletRequest) servletRequest).getRequestURL().toString() + " 的请求已被拦截");

        System.out.println("检验接口是否被调用，尝试获取contentType如下： " + servletResponse.getContentType());

        // filter的链式调用；将请求转给下一条过滤链
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("检验接口是否被调用，尝试获取contentType如下： " + servletResponse.getContentType());

        System.out.println("doFilter()执行结束。");
    }

    @Override
    public void destroy() {
        System.out.println("程序被销毁了");
    }

}
