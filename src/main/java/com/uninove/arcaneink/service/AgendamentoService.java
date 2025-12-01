package com.uninove.arcaneink.service;

import com.uninove.arcaneink.model.Agendamento;
import com.uninove.arcaneink.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    // Salvar agendamento
    public Agendamento salvar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    // Listar todos
    public List<Agendamento> listarTodos() {
        return agendamentoRepository.findAll();
    }

    // Buscar por ID
    public Optional<Agendamento> buscarPorId(Integer id) {
        return agendamentoRepository.findById(id);
    }

    // Atualizar
    public Agendamento atualizar(Agendamento agendamento) {
        if (agendamento.getId() == null || !agendamentoRepository.existsById(agendamento.getId())) {
            throw new RuntimeException("Agendamento não encontrado.");
        }
        return agendamentoRepository.save(agendamento);
    }

    // Deletar
    public void deletar(Integer id) {
        agendamentoRepository.deleteById(id);
    }

    // Buscar agendamentos de um usuário (tatuador)
    public List<Agendamento> listarPorUsuario(Integer usuarioId) {
        return agendamentoRepository.findByUsuarioId(usuarioId);
    }
}
