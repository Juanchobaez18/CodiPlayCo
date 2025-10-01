package com.codiPlayCo.service;

import java.util.List;

import com.codiPlayCo.model.Usuario;

public interface IUsuarioService {
	List<Usuario> obtenerUsuariosPorRol(Integer rolId);

	Usuario findById(Integer id);

}

import java.util.Optional;
import com.codiPlayCo.model.Usuario;

public interface IUsuarioService {
    List<Usuario> findAll();
    Usuario save(Usuario usuario);
    void delete(Integer id);
    Optional<Usuario> findById(Integer id);
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
    List<Usuario> findByRol(String rolNombre);
    
}

