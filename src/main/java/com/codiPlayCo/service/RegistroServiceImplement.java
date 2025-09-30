package com.codiPlayCo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codiPlayCo.model.Registro;
import com.codiPlayCo.repository.IRegistroRepository;

public class RegistroServiceImplement implements IRegistroService {
	@Autowired
	private final IRegistroRepository registroRepository;

	public RegistroServiceImplement(IRegistroRepository repo) {
		this.registroRepository = repo;
	}

	@Override
	public List<Registro> findByCurso(Integer cursoId) {
		return registroRepository.findByCursoId(cursoId);
	}
}
