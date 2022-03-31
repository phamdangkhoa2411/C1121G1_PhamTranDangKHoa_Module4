package mailbox.controller;



import mailbox.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class MailBoxController {
    @RequestMapping(value = "/setting", method = RequestMethod.GET)
    public ModelAndView setting() {
        ModelAndView modelAndView = new ModelAndView("/setting", "mailbox", new MailBox());
        return modelAndView;
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public ModelAndView result(@ModelAttribute("mailbox") MailBox mailBox) {
        ModelAndView modelAndView = new ModelAndView("/result");
        modelAndView.addObject("language", mailBox.getLanguages());
        modelAndView.addObject("pageSize", mailBox.getPageSize());
        modelAndView.addObject("spamsFilter", mailBox.isSpmasFillter());
        modelAndView.addObject("signature", mailBox.getSingnature());
        return modelAndView;
    }
}