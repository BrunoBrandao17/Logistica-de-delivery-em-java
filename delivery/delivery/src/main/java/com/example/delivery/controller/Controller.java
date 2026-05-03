package com.example.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String bemVindo(){
        return "Seja bem-vindo ap sistema de delivery";
    }

    @GetMapping("/dev")
    public String desenvolvedor(){
        return "Desenvolvedor: Bruno Machado Brandão";
    }
}
