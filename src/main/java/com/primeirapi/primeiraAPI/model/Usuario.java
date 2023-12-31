package com.primeirapi.primeiraAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",unique = true,nullable = false,length = 60)
    private String nome;

    @OneToMany(mappedBy = "usuario")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Apontamento> apontamentoList = new ArrayList<Apontamento>();


}
