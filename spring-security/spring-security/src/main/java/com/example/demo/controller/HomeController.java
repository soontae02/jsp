package main.java.com.example.demo.controller;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

}
