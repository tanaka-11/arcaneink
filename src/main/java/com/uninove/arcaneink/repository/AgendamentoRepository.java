package com.uninove.arcaneink.repository;

import com.uninove.arcaneink.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {

    // Buscar todos os agendamentos de um usuário (tatuador)
    List<Agendamento> findByUsuarioId(Integer usuarioId);
}
