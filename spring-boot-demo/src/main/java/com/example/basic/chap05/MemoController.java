package com.example.basic.chap05;

import com.example.basic.chap04.BookVO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/chap05")
public class MemoController {

    private final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }

    @GetMapping("/memoList")
    public String memoList(Model model) {
        List<MemoVO> memoList = memoService.list();
        model.addAttribute("memoList", memoList);
        return "chap05/memoList";
    }

    @GetMapping("/memoWrite")
    public String memoWrite(){
        return "chap05/memoWrite";
    }

    @PostMapping("/memoRegist")
    public String memoRegist(MemoVO memoVO){
        memoService.memoRegist(memoVO);
        return "redirect:/chap05/memoList";
    }

    @PostMapping("/memoDelete")
    public String memoDelete(MemoVO memoVO){
        memoService.memoDelete(memoVO);
        return "redirect:/chap05/memoList";
    }

}