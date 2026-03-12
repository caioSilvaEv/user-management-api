package com.caio.spring_api.repository;

import com.caio.spring_api.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{

}

