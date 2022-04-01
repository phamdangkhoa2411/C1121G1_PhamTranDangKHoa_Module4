package khaibao.controller;

import khaibao.model.ToKhai;
import khaibao.service.IToKhaiService;
import khaibao.service.impl.ToKhaiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ToKhaiController {

    IToKhaiService toKhaiService = new ToKhaiImpl();


    @GetMapping("/list")
    public ModelAndView list(){
        return new ModelAndView("/list","list", toKhaiService.list());
    }
    @GetMapping("/create")
    public String form(Model model){
        ToKhai toKhai=new ToKhai();
        model.addAttribute("thongTinDiLaiList",new String[] {"Tàu bay","Tàu thuyền","Ô tô"});
        model.addAttribute("toKhai",toKhai);
        return "create";
    }
    @PostMapping("/created")
    public String create(@ModelAttribute ToKhai toKhai, RedirectAttributes redirectAttributes){
        toKhaiService.create(toKhai);
        redirectAttributes.addFlashAttribute("smg","Thêm thành công");
        return "redirect:/list";
    }
}
