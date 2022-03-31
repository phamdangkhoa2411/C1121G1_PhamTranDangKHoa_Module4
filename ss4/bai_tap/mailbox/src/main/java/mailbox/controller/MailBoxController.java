package mailbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailBoxController {
    @RequestMapping(value = ("mailbox") , method = RequestMethod.POST)
public String showForm(ModelAndView modelAndView){

    }

}
