//package com.uninove.arcaneink.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "portfolio")
//public class Portfolio {
//
//
//    private Long id;
//
//    private String titulo;
//    private String descricao;
//    private String estilo; // Old School, Realismo etc.
//    private String urlImagem;
//
//    @ManyToOne
//    private Usuario tipo;
//
//// GETTERS e SETTERS
//    
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public String getDescricao() {    // <-- getter que faltava
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {   // setter opcional
//        this.descricao = descricao;
//    }
//
//    public String getEstilo() {    // <-- getter que faltava
//        return estilo;
//    }
//
//    public void setEstilo(String estilo) {   // setter opcional
//        this.estilo = estilo;
//    }
//    
//    public String getUrlImagem() {
//        return urlImagem;
//    }
//
//    public void setUrlImagem(String urlImagem) {
//        this.urlImagem = urlImagem;
//    }
//    
//}