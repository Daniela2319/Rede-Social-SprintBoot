package com.edu.redes.social.service;

import com.edu.redes.social.model.Postagem;
import com.edu.redes.social.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostagemService {
    @Autowired
    private PostagemRepository postagemRepository;

    public Postagem criarPostagem(Postagem postagem){
        return postagemRepository.save(postagem);
    }

    /*este método listarPostagens é responsável
     por consultar todas as postagens armazenadas no banco de dados
     e retornar essa lista para quem chamar esse método*/
    public List<Postagem> listarPostagens(){
        return postagemRepository.findAll();
    }

    public Optional<Postagem> findById(Long postagemId) {
        return postagemRepository.findById(postagemId);
    }
}
