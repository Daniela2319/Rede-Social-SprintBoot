package com.edu.redes.social.service;

import com.edu.redes.social.model.Comentario;
import com.edu.redes.social.model.Postagem;
import com.edu.redes.social.model.Usuario;
import com.edu.redes.social.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;

    public Comentario criarComentario(String texto, Postagem postagem, Usuario autor) {
        Comentario comentario = new Comentario();
        comentario.setTexto(texto);
        comentario.setPostagem(postagem);
        comentario.setAutor(autor);
        comentario.setCriado(LocalDateTime.now());
         // Configura as datas de criação e atualização
        return comentarioRepository.save(comentario);
    }

    public Comentario curtirComentario(Long comentarioId) {
        Optional<Comentario> optionalComentario = comentarioRepository.findById(comentarioId);
        if (optionalComentario.isPresent()) {
            Comentario comentario = optionalComentario.get();
            comentario.setLikes(comentario.getLikes() + 1);
            comentario.setAtualizado(LocalDateTime.now()); // Atualiza a data de modificação
            return comentarioRepository.save(comentario);
        }
        return null;
    }
}
