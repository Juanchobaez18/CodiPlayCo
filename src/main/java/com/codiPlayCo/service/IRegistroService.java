package com.codiPlayCo.service;

import java.util.List;

import com.codiPlayCo.model.Registro;

public interface IRegistroService {
	
	  List<Registro> findByCurso(Integer cursoId);

}
