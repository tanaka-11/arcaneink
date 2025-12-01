package com.uninove.arcaneink.controller;

import com.uninove.arcaneink.model.Agendamento;
import com.uninove.arcaneink.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    // Criar agendamento
    @PostMapping
    public ResponseEntity<Agendamento> criar(@RequestBody Agendamento agendamento) {
        Agendamento salvo = agendamentoService.salvar(agendamento);
        return ResponseEntity.ok(salvo);
    }

    // Listar todos
    @GetMapping
    public ResponseEntity<List<Agendamento>> listarTodos() {
        return ResponseEntity.ok(agendamentoService.listarTodos());
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public ResponseEntity<Agendamento> buscarPorId(@PathVariable Integer id) {
        return agendamentoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Agendamento> atualizar(@PathVariable Integer id, @RequestBody Agendamento agendamento) {
        agendamento.setId(id);
        try {
            Agendamento atualizado = agendamentoService.atualizar(agendamento);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        agendamentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    // Listar por tatuador
    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<List<Agendamento>> listarPorUsuario(@PathVariable Integer usuarioId) {
        return ResponseEntity.ok(agendamentoService.listarPorUsuario(usuarioId));
    }
}
