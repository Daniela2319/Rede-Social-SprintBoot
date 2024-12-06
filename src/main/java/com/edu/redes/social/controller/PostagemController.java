package com.edu.redes.social.controller;

import com.edu.redes.social.model.Postagem;
import com.edu.redes.social.service.PostagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postagens")
public class PostagemController {
    @Autowired
    private PostagemService postagemService;
    @PostMapping("/criar")
    public ResponseEntity<Postagem> criar(@RequestBody Postagem postagem){
        return ResponseEntity.ok(postagemService.criarPostagem(postagem));
    }
    @GetMapping
    public ResponseEntity<List<Postagem>> listar(){
        return ResponseEntity.ok(postagemService.listarPostagens());
    }
}
