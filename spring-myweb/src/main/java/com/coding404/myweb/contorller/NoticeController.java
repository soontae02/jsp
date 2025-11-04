package com.coding404.myweb.contorller;

import com.coding404.myweb.command.NoticeVO;
import com.coding404.myweb.notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    @Qualifier("noticeService")
    private NoticeService noticeService;

    @GetMapping("/noticeList")
    public String noticeList() {
        return "noticeList";
    }

    @GetMapping("/noticeReg")
    public String noticeReg() {
        return "noticeReg";
    }

    @GetMapping("noticeDetail")
    public String noticeDetail() {
        return "noticeDetail";
    }

    @PostMapping("/NoticeRegist")
    public String noticeRegist(NoticeVO noticeVO) {
        noticeService.noticeRegist(noticeVO);
        return "redirect:/notice/noticeList";
    }

}
