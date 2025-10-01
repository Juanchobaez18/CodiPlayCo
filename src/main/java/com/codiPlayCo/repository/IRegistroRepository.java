package com.codiPlayCo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codiPlayCo.model.Registro;

public interface IRegistroRepository extends JpaRepository<Registro, Integer> {
	
	 List<Registro> findByCursoId(Integer cursoId);

}
