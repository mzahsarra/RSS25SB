package fr.univrouen.rss25sb.rss25sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("projectName", "rss25SB");
        model.addAttribute("version", "1.0.0");
        model.addAttribute("developer", "Mzah Sarra");
        model.addAttribute("universityLogo", "resources/Université_de_Rouen.png");
        return "home";
    }
}