package com.primeirapi.primeiraAPI.service;

import com.primeirapi.primeiraAPI.model.Usuario;

import java.util.ArrayList;
import java.util.Optional;

public interface UsuarioService {

    Usuario post(Usuario usuario);

    Usuario put(Usuario usuario);

    ArrayList<Usuario> get();

    Usuario getById(Long id);

    String delete(Long id);



}
