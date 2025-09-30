package com.codiPlayCo.service;

import java.util.List;

import com.codiPlayCo.model.AsignacionDocente;

public interface IAsignacionDocenteService {

	List<AsignacionDocente> findByUsuarioId(Integer usuarioId);

	List<AsignacionDocente> findByDocente(Integer docenteId);
	
	static List<AsignacionDocente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
