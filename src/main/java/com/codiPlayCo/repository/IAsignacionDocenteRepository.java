package com.codiPlayCo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codiPlayCo.model.AsignacionDocente;


@Repository
public interface IAsignacionDocenteRepository extends JpaRepository<AsignacionDocente, Integer> {

	// Devuelve todas las asignaciones de un docente (por id de usuario)

	Optional findById(Integer id);
}
