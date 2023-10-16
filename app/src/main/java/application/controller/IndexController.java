package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home(Model visualizacao, @RequestParam("nome") String n) {
        visualizacao.addAttribute("mensagem", "Olá " + n);
        return "home";
    }
}