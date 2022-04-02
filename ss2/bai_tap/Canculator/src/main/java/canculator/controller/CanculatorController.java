package canculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CanculatorController {
    @GetMapping("/list")

    public String canculator()
    {
        return "list";
    }

    @PostMapping("/list")

    public String resut(@RequestParam String result, @RequestParam Double number1, @RequestParam Double number2, Model model) {

        Double total = 0.0;

        switch (result) {
            case "+":
                total = number1 + number2;
                break;

            case "-":
                total = number1-number2;
                break;

            case "x":
                total=number1*number2;
                break;

            case "/":
                total=number1/number2;
                break;
        }

        model.addAttribute("total",total);

        return "list";
    }

}
