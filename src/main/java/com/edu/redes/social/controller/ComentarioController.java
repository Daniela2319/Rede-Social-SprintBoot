package com.edu.redes.social.controller;

import com.edu.redes.social.model.Comentario;
import com.edu.redes.social.model.Postagem;
import com.edu.redes.social.model.Usuario;
import com.edu.redes.social.service.ComentarioService;
import com.edu.redes.social.service.PostagemService;
import com.edu.redes.social.service.UsuarioService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {


    @Autowired
    private ComentarioService comentarioService;

    @Autowired
    private PostagemService postagemService; // Injetando PostagemService

    @Autowired
    private UsuarioService usuarioService; // Injetando UsuarioService

    @PostMapping
    public ResponseEntity<Comentario> criarComentario(
            @RequestParam String texto,
            @RequestParam Long postagemId,
            @RequestParam Long autorId) {

        // Busca a postagem pelo ID usando PostagemService
        Optional<Postagem> postagemOptional = postagemService.findById(postagemId);
        if (postagemOptional.isEmpty()) {
            return ResponseEntity.badRequest().body(null); // Retorna 400 se postagem não encontrada
        }
        Postagem postagem = postagemOptional.get();

        // Busca o autor pelo ID usando UsuarioService
        Optional<Usuario> usuarioOptional = usuarioService.findById(autorId);
        if (usuarioOptional.isEmpty()) {
            return ResponseEntity.badRequest().body(null); // Retorna 400 se autor não encontrado
        }
        Usuario autor = usuarioOptional.get();

        // Cria o comentário e retorna a resposta
        Comentario comentario = comentarioService.criarComentario(texto, postagem, autor);
        return ResponseEntity.ok(comentario);
    }


    // Endpoint para curtir um comentário
    @PostMapping("/{id}/curtir")
    public ResponseEntity<Comentario> curtirComentario(@PathVariable Long id) {
        Comentario comentario = comentarioService.curtirComentario(id);
        if (comentario == null) {
            return ResponseEntity.notFound().build(); // Retorna 404 se o comentário não for encontrado
        }
        return ResponseEntity.ok(comentario);
    }
}

