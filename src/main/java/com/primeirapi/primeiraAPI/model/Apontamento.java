package com.primeirapi.primeiraAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "apontamentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apontamento {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "descricao",nullable = false,length = 100)
    private String descricao;

    @Column(name = "data_lancamento",nullable = false)
    private Date dataLancamento;

    @ManyToOne
    @JoinColumn(name = "usuario",nullable = false,updatable = false)
    private Usuario usuario;

}
