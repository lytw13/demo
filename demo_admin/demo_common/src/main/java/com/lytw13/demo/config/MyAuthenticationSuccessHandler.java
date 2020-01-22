package com.lytw13.demo.config;//package com.lytw13.demo.config;
//
//import com.alibaba.fastjson.JSONObject;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
//        JSONObject json = new JSONObject();
//        json.put("200","认证通过");
//        httpServletResponse.setContentType("application/json;charset=utf-8");
//        PrintWriter out = httpServletResponse.getWriter();
//        out.write(json.toJSONString());
//        out.flush();
//        out.close();
//        System.out.println("chenggong!!!!!!!!!");
//    }
//
//
//}
