package com.tornese.desafio21dias.empresas.repositorio;

import com.tornese.desafio21dias.empresas.models.Empresa;

import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepo extends CrudRepository<Empresa, Integer> {
  
}
