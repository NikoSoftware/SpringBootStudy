package com.example.springbootstudy.filter;


import com.example.springbootstudy.entity.MsgEntity;
import com.example.springbootstudy.entity.TokenStatus;
import com.example.springbootstudy.loginInfo.JwtToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@WebFilter(urlPatterns = "/app")
@Order(10)
public class TokenFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String token  = req.getHeader("token");
        TokenStatus tokenStatus = JwtToken.getAppUID(token);
        if(null != tokenStatus&&tokenStatus.isLiving()&&tokenStatus.getUserId()!=null){
            chain.doFilter(request,response);
        }else{
             response.setContentType("application/json;charset=UTF-8");
             ObjectMapper mapper = new ObjectMapper();
             MsgEntity msgEntity  = new MsgEntity();
             msgEntity.setCode(msgEntity.ERROR);
             msgEntity.setMsg("Token有误");

             response.getWriter().print(mapper.writeValueAsString(msgEntity));
             response.getWriter().close();
        }

    }

    @Override
    public void destroy() {

    }
}
