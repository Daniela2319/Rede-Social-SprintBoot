package com.edu.redes.social.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String texto;

    @ManyToOne
    @JoinColumn(name = "postagem_id", nullable = false)
    private Postagem postagem;

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Usuario autor;
    private int likes;
    @Column(nullable = false, updatable = false)
    private LocalDateTime criado;
    @Column(nullable = false)
    private LocalDateTime atualizado;

    @PrePersist
    protected void onCreate() {
        this.criado = LocalDateTime.now();
        this.atualizado = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.atualizado = LocalDateTime.now();
    }



}
