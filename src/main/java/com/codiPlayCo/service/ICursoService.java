package com.codiPlayCo.service;

import java.util.List;
import java.util.Optional;
import com.codiPlayCo.model.Curso;

public interface ICursoService {


	public Curso save(Curso curso);

	public Optional<Curso> get(Integer id);

	public Curso update(Curso curso);

	public void delete(Integer id);

	public List<Curso> findAll();

	Curso findById(Integer id);

	List<Curso> findByAsignacionDocente(Integer asignacionDocenteId);

}

