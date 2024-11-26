package es.santander.ascender.proyecto10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/solicitud")
public class SolicitudController {
    
    @GetMapping
    public String elsa(Model model) {
        // Aquí iría mi lógica
        model.addAttribute("mivalor", "mensaje");
        return "pagina1";
    }

}
