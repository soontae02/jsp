package com.example.demo.security.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import java.io.IOException;

public class CustomAuthenticationFailue implements AuthenticationFailureHandler {

    private String redirectUrl;
    //생성자
    public CustomAuthenticationFailue(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    //인증 실패시 실행할 메서드
    @Override
    public void onAuthenticationFailure(HttpServletRequest request,
                                        HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {

        response.sendRedirect(redirectUrl + "?error=true"); //리다이렉트 해줌
    }



}
