package com.avance3.Proyecto3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedSocialController {

    @GetMapping("/")
    public String mostrarRedSocial() {
        return "ProyectoMDW";
    }
}