package com.coding404.myweb.util.interceptor;

import com.coding404.myweb.command.UserVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

//인터셉트 클래스로 동작하려면 HandlerInterceptor를 상속받음
public class UserAuthHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //System.out.println("컨트롤러 이전에 동작함");
        HttpSession session = request.getSession(); //현재 세션을 반환
        UserVO vo = (UserVO) session.getAttribute("userVO");

        if (vo == null) { //로그인이 안된사람
            response.sendRedirect("/user/login");
            return false; //컨트롤러를 실행하지 않음.
        }

        return true; //true 입력시 컨트롤러로 넘어감, false 입력시 컨트롤러 실행 x
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);

        System.out.println("컨트롤러 이후에 동작함");
    }
}
