package com.codiPlayCo.service;

import java.util.List;
import java.util.Optional;

import com.codiPlayCo.model.AsignacionDocente;

public interface IAsignacionDocenteService {

	Optional<AsignacionDocente> findByUsuarioId(Integer usuarioId);

	Optional<AsignacionDocente> findByDocente(Integer docenteId);
	
	static List<AsignacionDocente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
