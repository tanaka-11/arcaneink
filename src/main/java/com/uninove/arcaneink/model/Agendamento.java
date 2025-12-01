package com.uninove.arcaneink.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "agendamento")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome; // Nome do agendamento (ex: do cliente ou tatuagem)

    @Column(name = "usuario_id", nullable = false)
    private Integer usuarioId; // ID do tatuador

    private LocalDate data; // Data do agendamento

    public Agendamento() {}

    public Agendamento(String nome, Integer usuarioId, LocalDate data) {
        this.nome = nome;
        this.usuarioId = usuarioId;
        this.data = data;
    }

    // GETTERS e SETTERS
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Integer getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Integer usuarioId) { this.usuarioId = usuarioId; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}
