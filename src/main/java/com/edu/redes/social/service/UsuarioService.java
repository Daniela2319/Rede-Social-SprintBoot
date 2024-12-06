package com.edu.redes.social.service;

import com.edu.redes.social.model.Usuario;
import com.edu.redes.social.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorEmail(String email){
        return usuarioRepository.findByEmail(email);
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioRepository.findById(id);
    }
}
