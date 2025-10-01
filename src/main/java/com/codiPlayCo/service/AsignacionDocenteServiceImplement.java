package com.codiPlayCo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codiPlayCo.model.AsignacionDocente;
import com.codiPlayCo.repository.IAsignacionDocenteRepository;

@Service
public class AsignacionDocenteServiceImplement implements IAsignacionDocenteService {

	@Autowired
	private IAsignacionDocenteRepository asignacionDocenteRepository;

	@Override
	public Optional<AsignacionDocente> findByUsuarioId(Integer id) {
		return asignacionDocenteRepository.findById(id);
	}

	public AsignacionDocenteServiceImplement(IAsignacionDocenteRepository repo) {
		this.asignacionDocenteRepository = repo;
	}

	@Override
	public Optional<AsignacionDocente> findByDocente(Integer id) {
		return asignacionDocenteRepository.findById(id);
	}
}