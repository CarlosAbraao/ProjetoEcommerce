package com.carlosdev.lojavirtual.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/adminitracao")
    public String index(){
        return "admin/home" ;
    }
}
