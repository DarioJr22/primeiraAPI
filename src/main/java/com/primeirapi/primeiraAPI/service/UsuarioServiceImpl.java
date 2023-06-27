package com.primeirapi.primeiraAPI.service;

import com.primeirapi.primeiraAPI.model.Usuario;
import com.primeirapi.primeiraAPI.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired UsuarioRepository usuarioRepository;
    @Override
    @Transactional
    public Usuario post(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public Usuario put(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public ArrayList<Usuario> get() {
        return (ArrayList<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Usuario getById(Long id) {
        return null;
    }

    /* @Override
    public Usuario getById(Long id) {

        return this.usuarioRepository.findById(id);
    }*/


    @Override
    public String delete(Long id) {
        this.usuarioRepository.deleteById(id);
        return "Usuario Deletado !";
    }
}
