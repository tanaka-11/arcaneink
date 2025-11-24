package com.uninove.arcaneink.controller;

import com.uninove.arcaneink.model.Usuario;
import com.uninove.arcaneink.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioWebController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public String usuarioPage(@RequestParam Integer id, Model model) {
        Usuario usuario = usuarioService.buscarPorId(id);
        model.addAttribute("usuario", usuario);
        return "usuario"; // templates/usuario.html
    }
}
