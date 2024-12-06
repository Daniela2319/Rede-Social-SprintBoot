package com.edu.redes.social.controller;

import com.edu.redes.social.model.Usuario;
import com.edu.redes.social.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrar (@RequestBody Usuario usuario)
    {   Usuario novoUsuario = usuarioService.registrarUsuario(usuario);
        return ResponseEntity.ok(novoUsuario);
    }}
