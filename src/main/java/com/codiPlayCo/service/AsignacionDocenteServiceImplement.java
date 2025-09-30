package com.codiPlayCo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codiPlayCo.model.AsignacionDocente;
import com.codiPlayCo.repository.IAsignacionDocenteRepository;

@Service
public class AsignacionDocenteServiceImplement implements IAsignacionDocenteService {

	@Autowired
	private IAsignacionDocenteRepository asignacionDocenteRepository;

	@Override
	public List<AsignacionDocente> findByUsuarioId(Integer usuarioId) {
		return asignacionDocenteRepository.findByUsuarioId(usuarioId);
	}

	public AsignacionDocenteServiceImplement(IAsignacionDocenteRepository repo) {
		this.asignacionDocenteRepository = repo;
	}

	@Override
	public List<AsignacionDocente> findByDocente(Integer docenteId) {
		return asignacionDocenteRepository.findByUsuarioId(docenteId);
	}
}