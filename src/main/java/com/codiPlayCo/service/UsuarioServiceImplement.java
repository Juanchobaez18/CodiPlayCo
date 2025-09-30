package com.codiPlayCo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codiPlayCo.model.Usuario;
import com.codiPlayCo.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
	@Autowired
	private final IUsuarioRepository usuarioRepository;

	public UsuarioServiceImplement(IUsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public List<Usuario> obtenerUsuariosPorRol(Integer rolId) {
		return usuarioRepository.findByRolId(rolId);
	}

	@Override
	public Usuario findById(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> listarEstudiantesActivos(Integer rolEstudianteId) {
		// "ACTIVO" según BD
		return usuarioRepository.findByRolIdAndActivo(rolEstudianteId, "ACTIVO");
	}
}
