package com.example.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response) {

        request.setAttribute("message", "컨트롤러에서 보낸 데이터!");
        request.setAttribute("isMember", true);

        List<String> list = Arrays.asList("a","b","c");

        return "home"; // /WEB-INF/views/home.jsp
    }

    @RequestMapping("/jstl")
    public String jstl(HttpServletRequest request, HttpServletResponse response) {

        request.setAttribute("msg", "컨트롤러에서 보낸 jstl메세지");


        return "jstl";
    }

}
