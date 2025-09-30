package com.codiPlayCo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codiPlayCo.model.AsignacionDocente;
import com.codiPlayCo.model.Curso;

@Repository
public interface IAsignacionDocenteRepository extends JpaRepository<AsignacionDocente, Integer> {

	// Devuelve todas las asignaciones de un docente (por id de usuario)
	List<AsignacionDocente> findByUsuarioId(Integer usuarioId);

	List<Curso> findByAsignacionDocenteId(Integer asignacionDocenteId);
}
