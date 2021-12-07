package com.tornese.desafio21dias.empresas.controllers;

import com.tornese.desafio21dias.empresas.model_views.Home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @GetMapping("/")
  public Home index(){
    return new Home();
  }
}
