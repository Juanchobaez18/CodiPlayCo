package com.codiPlayCo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codiPlayCo.model.Curso;
import com.codiPlayCo.repository.ICursoRepository;

@Service
public class CursoServiceImplement implements ICursoService {

	@Autowired
	private ICursoRepository cursoRepository;

	public CursoServiceImplement(ICursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}

	@Override
	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	@Override
	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

	@Override
	public Curso update(Curso curso) {
		return cursoRepository.save(curso);
	}

	@Override
	public void delete(Integer id) {
		cursoRepository.deleteById(id);
	}

	@Override
	public Optional<Curso> get(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Curso findById(Integer id) {
		return cursoRepository.findById(id).orElse(null);
	}

	@Override
	public List<Curso> findByAsignacionDocente(Integer asignacionDocenteId) {
		return cursoRepository.findByAsignacionDocente_Id(asignacionDocenteId);
	}
}
