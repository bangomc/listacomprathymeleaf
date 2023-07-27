package net.ddns.crisapp.listacomprathymeleaf.controller;

import net.ddns.crisapp.listacomprathymeleaf.model.Compra;
import net.ddns.crisapp.listacomprathymeleaf.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping
    public String lst(ModelMap modelMap){
        modelMap.addAttribute("compras",compraService.lista());
        return "/compra/lst";
    }

    @GetMapping("/novo")
    public String novo(ModelMap modelMap){
        modelMap.addAttribute("compra",new Compra());
        return "/compra/add";
    }
    @PostMapping
    public String add(Compra compra){
        compraService.add(compra);
        return "redirect:/compras";
    }
}
