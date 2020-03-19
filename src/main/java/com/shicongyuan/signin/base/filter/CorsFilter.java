package com.shicongyuan.signin.base.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 配置跨域访问
 *
 * @author Administrator
 *
 */
@WebFilter(filterName = "crosFilter",urlPatterns = "/*")
public class CorsFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        // Access-Control-Allow-Origin就是我们需要设置的域名
        // Access-Control-Allow-Headers跨域允许包含的头。
        // Access-Control-Allow-Methods是允许的请求方式
        resp.setHeader("Access-Control-Allow-Origin", "*");// *,任何域名
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, DELETE");
        //允许客户端发一个新的请求头jwt
        resp.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, jwt");
        //允许客户端处理一个新的响应头jwt
        resp.setHeader("Access-Control-Expose-Headers", "jwt");
        if ("OPTIONS".equals(req.getMethod())) {// axios的ajax会发两次请求，第一次提交方式为：option，直接返回即可
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}