package com.caio.spring_api.controller;

import com.caio.spring_api.dto.UsuariosDTO;
import com.caio.spring_api.model.Usuarios;
import com.caio.spring_api.service.UsuariosService;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public ResponseEntity<List<Usuarios>> listarUsuarios(){
        List<Usuarios> usuarios = usuariosService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }
    @PostMapping
    public ResponseEntity<Usuarios> criarUsuario(@RequestBody UsuariosDTO usuarioDTO){
        Usuarios novoUsuario = usuariosService.criarUsuario(usuarioDTO);
        return ResponseEntity.status(201).body(novoUsuario);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> buscarUsuario(@PathVariable Long id) {
        Usuarios usuario = usuariosService.buscarUsuario(id);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(usuario);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long id){
        usuariosService.deletarUsuario(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Usuarios> atualizarUsuario(@PathVariable Long id, @RequestBody UsuariosDTO usuarioDTO){
        Usuarios atualizado = usuariosService.atualizarUsuario(id, usuarioDTO);
        if (atualizado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(atualizado);
    }
}
