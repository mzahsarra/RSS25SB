package fr.univrouen.rss25sb.rss25sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {
    @GetMapping("/help")
    public String help(Model model) {
        model.addAttribute("operations", new String[][]{
                {"/", "GET", "Affiche la page d'accueil", "HTML"},
                {"/help", "GET", "Affiche la page d'aide", "HTML"},
                {"/rss25SB/resume/xml", "GET", "Liste des articles (XML)", "XML"},
                {"/rss25SB/resume/html", "GET", "Liste des articles (HTML)", "HTML"},
                {"/rss25SB/xml/{id}", "GET", "Détail article (XML)", "XML"},
                {"/rss25SB/html/{id}", "GET", "Détail article (HTML)", "HTML"},
                {"/rss25SB/insert", "POST", "Ajout d'un article (XML)", "XML"},
                {"/rss25SB/delete/{id}", "DELETE", "Suppression d'un article", "XML"}
        });
        return "help";
    }
}