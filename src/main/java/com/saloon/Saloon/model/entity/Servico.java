package com.saloon.Saloon.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private int duracaoEmMinutos;

    @ManyToOne
    @Column(name = "usuario_id")
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioId;
}
