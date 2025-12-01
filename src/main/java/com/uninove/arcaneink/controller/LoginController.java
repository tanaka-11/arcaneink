package com.uninove.arcaneink.controller;

import com.uninove.arcaneink.model.Usuario;
import com.uninove.arcaneink.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    // Exibe a página de login
    @GetMapping
    public String loginPage() {
        return "login"; // templates/login.html
    }
    
    @GetMapping("/usuario")
    public String usuarioPage(@RequestParam Integer id, Model model) {
        Usuario usuario = usuarioService.buscarPorId(id);
        model.addAttribute("usuario", usuario);
        return "usuario"; // templates/usuario.html
    }

    // Processa o login via formulário -- ROTA ALTERADA PARA /login/auth
    @PostMapping("/auth")
    public String login(@RequestParam String email,
                        @RequestParam String senha,
                        Model model) {

        Usuario usuario = usuarioService.login(email, senha);

        if (usuario != null) {
            model.addAttribute("usuario", usuario);
            return "usuario"; 
        } else {
            model.addAttribute("erro", "Email ou senha inválidos");
            return "login";
        }
    }
}
