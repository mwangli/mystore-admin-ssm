package com.lmw.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI();
//        if (uri.contains("login.do")) {
            //登录请求不拦截
//            return true;
//        } else {
//            Admin admin = (Admin) request.getSession().getAttribute("admin");
//            if (admin != null) {
                //已登录放行
//                return true;
//            } else {
//                return false;
//            }
//        }
        if(uri.contains("login.do")||request.getSession().getAttribute("admin")!=null){
            return true;
        }else {
            return false;
        }

    }
}