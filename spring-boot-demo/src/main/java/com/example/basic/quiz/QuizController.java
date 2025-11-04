package com.example.basic.quiz;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @GetMapping("/quiz01")
    public String quiz01() {
        return "quiz/quiz01";
    }

    @PostMapping("/join")
    public String join(@ModelAttribute("vo") QuizVO vo) {
        return "quiz/quiz01_ok";
    }

    //quiz02
    @GetMapping("terms")
    public String terms(Model model, @ModelAttribute("msg") String msg) {
        String termsContent = "제1조 (목적)\n" +
                "이 약관은 서비스 이용에 관한 사항을 규정함을 목적으로 합니다.\n\n" +
                "제2조 (정의)\n" +
                "이 약관에서 사용하는 용어의 정의는 다음과 같습니다.\n" +
                "1. '서비스'란 회사가 제공하는 모든 서비스를 의미합니다.\n" +
                "2. '이용자'란 서비스를 이용하는 자를 의미합니다.\n\n" +
                "제3조 (약관의 효력)\n" +
                "이 약관은 이용자가 동의함으로써 효력을 발생합니다.";

        model.addAttribute("termsContent", termsContent);

        return "quiz/terms";
    }

    @PostMapping("/termsForm")
    public String agree(@ModelAttribute("vo") QuizVO vo,
                        RedirectAttributes ra,
                        HttpServletRequest rq,
                        Model model
    ) {

        if(!"Y".equals(vo.getAgree())) {
            ra.addFlashAttribute("msg", "이용약관을 동의해주세요.");
            return "redirect:/quiz/terms";
        } else {
            String phoneNumber = rq.getParameter("phoneNumber");
            model.addAttribute("phoneNumber", phoneNumber);
            return "quiz/terms_ok";
        }

    }
}