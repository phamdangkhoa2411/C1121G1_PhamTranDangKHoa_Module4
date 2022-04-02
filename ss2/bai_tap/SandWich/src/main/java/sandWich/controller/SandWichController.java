package sandWich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class SandWichController {

//    @GetMapping("/SandWichCondiments" )
//
//        String sandWichCondiments(){
//      return "SandWichCondiments";
//    }

//    @PostMapping("/SandWichCondiments")
//
//    public String list(@RequestParam(required = false) String lettuce ,
//                       @RequestParam(required = false) String tomato,
//                       @RequestParam(required = false) String mustard,
//                       @RequestParam(required = false) String sprouts ,
//                       Model model){
//
//        model.addAttribute("lettuce",lettuce);
//
//        model.addAttribute("tomato",tomato);
//
//        model.addAttribute("mustard",mustard);
//
//        model.addAttribute("sprouts",sprouts);
//
//        return "list";
//    }



    //source code sau khi tham khảo và fix lại theo comment của tuter
    @GetMapping("/SandWichCondiments")
    public String sandWichCondiments(){
        return "SandWichCondiments";
        }
    @RequestMapping("/add")
    public String save(@RequestParam( value = "condiment", defaultValue = "you have to choose one of four !!") String[] condiment, Model model) {
        model.addAttribute("SandWichCondiments", condiment);
        return "list";
    }

}
