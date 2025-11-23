package com.uninove.arcaneink.controller;

import com.uninove.arcaneink.model.Usuario;
import com.uninove.arcaneink.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioService.cadastrar(usuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) {
        return usuarioService.login(usuario.getEmail(), usuario.getSenha());
    }

    @GetMapping("/listar")
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @GetMapping("/listar/{tipo}")
    public List<Usuario> listarPorTipo(@PathVariable String tipo) {
        return usuarioService.listarPorTipo(tipo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        usuarioService.deletar(id);
    }
}
