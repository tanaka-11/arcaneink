package com.uninove.arcaneink.repository;

import com.uninove.arcaneink.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
    boolean existsByEmail(String email);

    // Filtrar por tipo
    List<Usuario> findByTipo(String tipo);
    
}
