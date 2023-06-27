package com.primeirapi.primeiraAPI.controller;


import com.primeirapi.primeiraAPI.model.Usuario;
import com.primeirapi.primeiraAPI.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @Autowired UsuarioService usuarioService;
    @GetMapping("/get")
    public ResponseEntity<ArrayList<Usuario>> get(){

        ArrayList<Usuario> user = usuarioService.get();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById(@PathVariable Long id){
        Usuario user = usuarioService.getById(id);
        return ResponseEntity.ok().build()
    }

    @PostMapping("/post")
    public ResponseEntity<Usuario> post(@RequestBody Usuario u){
        Usuario user = usuarioService.post(u);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/put")
    public ResponseEntity<Usuario> put(@RequestBody Usuario u){
        Usuario user = usuarioService.put(u);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        this.usuarioService.delete(id);
        return "Usuario Deletado";
    }




}
