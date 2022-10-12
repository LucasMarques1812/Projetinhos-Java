package com.udyr.java1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udyr.java1.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
