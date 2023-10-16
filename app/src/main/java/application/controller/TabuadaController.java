package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class TabuadaController {
    @RequestMapping("/tabuada")
    public String calcula(@RequestParam("numero") int num, Model ui ){
        int[] resultado = new int[10];
        for(int pos = 0; pos < 10; pos++){
            resultado[pos] = (pos + 1) * num;
        }
        ui.addAttribute("tabuada", resultado);
       return "tabuada"; 
    }
}
