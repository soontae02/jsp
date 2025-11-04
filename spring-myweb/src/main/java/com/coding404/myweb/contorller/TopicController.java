package com.coding404.myweb.contorller;

import com.coding404.myweb.command.TopicVO;
import com.coding404.myweb.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    @Qualifier("topicService")
    private TopicService topicService;

    @GetMapping("/topicListAll")
    public String topicListAll(Model model){
        String topicWriter = "admin";
        List<TopicVO> list = topicService.getList(topicWriter);
        model.addAttribute("list",list);
        return "topic/topicListAll";
    }

    @GetMapping("/topicReg")
    public String topicReg() {
        return "topic/topicReg";
    }

    @GetMapping("/topicDetail")
    public String topicDetail(@RequestParam("topicId") long topicId, Model model) {
        TopicVO vo = topicService.getDetail(topicId);

        if (vo == null) {
            System.out.println("DEBUG: topicId에 해당하는 데이터 없음");
            return "redirect:/topic/topicListAll";
        }

        model.addAttribute("vo", vo);
        return "topic/topicDetail";
    }


    @GetMapping("/topicModify")
    public String topicModefy(@RequestParam("topicId") long topicId,
                              Model model) {
        TopicVO vo = topicService.getDetail(topicId);
        model.addAttribute("vo",vo);
        return "topic/topicModify";
    }

    @PostMapping("/topicForm")
    public String topicForm(TopicVO vo, RedirectAttributes ra) {
        int result = topicService.topicRegist(vo);

        if (result == 1) {
            ra.addFlashAttribute("msg", "등록완료");
        } else {
            ra.addFlashAttribute("msg", "등록에 실패했습니다.");
        }

        return "redirect:/topic/topicListAll";
    }

    @PostMapping("topicUpdate")
    public String topicUpdate(TopicVO vo, RedirectAttributes ra) {
        int result = topicService.topicUpdate(vo);
        if (result == 1) {
            ra.addFlashAttribute("msg", "글이 수정되었습니다.");
            return "redirect:/topic/topicListAll";
        } else {
            ra.addFlashAttribute("msg", "수정에 실패했습니다.");
            return "redirect:/topic/topicListAll";
        }
    }

    @GetMapping("/topicDelete")
    public String topicDelete(@RequestParam("topicId") long topicId, RedirectAttributes ra) {
        int result = topicService.topicDelete(topicId);
        if (result == 1) {
            ra.addFlashAttribute("msg", "글이 삭제되었습니다.");
            return "redirect:/topic/topicListAll";
        } else {
            ra.addFlashAttribute("msg", "삭제해 실패했습니다.");
            return "redirect:/topic/topicListAll";
        }
    }

    @GetMapping("/topicListMe")
    public String topicListMe(){
        return "topic/topicListMe";
    }

}
