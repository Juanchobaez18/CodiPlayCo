package com.codiPlayCo.service;

import java.util.List;
import com.codiPlayCo.model.Usuario;

public interface IUsuarioService {
	List<Usuario> obtenerUsuariosPorRol(Integer rolId);

	Usuario findById(Integer id);

	List<Usuario> listarEstudiantesActivos(Integer rolEstudianteId);
}
