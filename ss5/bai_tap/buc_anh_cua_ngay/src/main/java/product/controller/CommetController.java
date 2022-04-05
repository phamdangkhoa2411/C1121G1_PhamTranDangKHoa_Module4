package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import product.model.Comment;
import product.service.ICommentService;

import java.time.LocalDate;
import java.util.List;

@Controller
public class CommetController {

    @Autowired
    private ICommentService iCommentService;

    @GetMapping("/view")
    public String showPicture(Model model ) {
        model.addAttribute("comment", new Comment());
        List<Comment> commentList = iCommentService.findAllComment();
        model.addAttribute("commentList", commentList);
        return "view";
    }
    @PostMapping("/comment")
    public String receiveComment(@ModelAttribute Comment comment) {
        comment.setDate(String.valueOf(LocalDate.now()));
        comment.setLike(0);
        iCommentService.save(comment);
        return "redirect:/view";
    }

}
