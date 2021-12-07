package com.tornese.desafio21dias.empresas.models;

import java.time.LocalDateTime;

public class Empresa {
  private int id;
  private String nome;
  private String razaoSocial;
  private String cnpj;
  private String email;
  private LocalDateTime dataCriacao = LocalDateTime.now();
  private LocalDateTime dataAtualizacao = LocalDateTime.now();

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public LocalDateTime getDataAtualizacao() {
    return dataAtualizacao;
  }
  public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  public LocalDateTime getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(LocalDateTime dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
}
