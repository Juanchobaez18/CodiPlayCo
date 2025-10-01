package com.codiPlayCo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codiPlayCo.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

	Optional<Usuario> findByEmail(String email);

	// Listar todos los docentes
	List<Usuario> findByRolNombre(String rol);

	List<Usuario> findByRolId(Integer rolId);

	
}
