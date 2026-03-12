package com.caio.spring_api.service;

import com.caio.spring_api.dto.UsuariosDTO;
import com.caio.spring_api.model.Usuarios;
import com.caio.spring_api.repository.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {
    private final UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuarios> listarUsuarios(){
        return usuariosRepository.findAll();
    }
    public Usuarios criarUsuario(UsuariosDTO usuarioDTO){
        Usuarios usuario = new Usuarios();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setIdade(usuarioDTO.getIdade());
        usuario.setSexo(usuarioDTO.getSexo());
        return usuariosRepository.save(usuario);
    }
    public Usuarios buscarUsuario(Long id){
        return usuariosRepository.findById(id).orElse(null);
    }
    public void deletarUsuario(Long id) {
        usuariosRepository.deleteById(id);
    }
    public Usuarios atualizarUsuario(Long id, UsuariosDTO usuarioAtualizado){
        Usuarios usuario = usuariosRepository.findById(id).orElse(null);

        if (usuario != null){
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setIdade(usuarioAtualizado.getIdade());
            usuario.setSexo(usuarioAtualizado.getSexo());

            return usuariosRepository.save(usuario);
        }
        return null;
    }


}
