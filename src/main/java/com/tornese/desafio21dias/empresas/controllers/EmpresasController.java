package com.tornese.desafio21dias.empresas.controllers;

import java.util.ArrayList;
import java.util.List;

import com.tornese.desafio21dias.empresas.models.Empresa;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresasController {
  @GetMapping("/empresas")
  public List<Empresa> index(){
    List<Empresa> empresas = new ArrayList<Empresa>();
    empresas.add(new Empresa());
    empresas.add(new Empresa());
    empresas.add(new Empresa());
    empresas.add(new Empresa());
    return empresas;
  }

  @GetMapping("/empresas/{id}")
  public Empresa show(@PathVariable int id){
    Empresa empresa = new Empresa();
    empresa.setId(id);
    return empresa;
  }

  @PostMapping("/empresas")
  public Empresa create(@RequestBody Empresa empresa){
    return empresa;
  }

  @PutMapping("/empresas/{id}")
  public Empresa update(@PathVariable int id, @RequestBody Empresa empresa){
    return empresa;
  }

  @DeleteMapping("/empresas/{id}")
  public Empresa update(@PathVariable int id){
    return new Empresa();
  }
}
