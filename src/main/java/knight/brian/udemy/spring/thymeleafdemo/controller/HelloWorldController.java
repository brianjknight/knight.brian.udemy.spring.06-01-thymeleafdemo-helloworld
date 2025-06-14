package knight.brian.udemy.spring.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class HelloWorldController {

    // controller method to show initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(Model model) {

        model.addAttribute("theDate", LocalDateTime.now());

        return "helloworld";
    }
}
