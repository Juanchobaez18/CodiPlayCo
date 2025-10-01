package com.codiPlayCo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codiPlayCo.model.Curso;
import com.codiPlayCo.model.Usuario;
import com.codiPlayCo.service.ICursoService;
import com.codiPlayCo.service.IUsuarioService;

@Controller

public class DocenteController {
	@Autowired
	private final IUsuarioService usuarioService;

	public DocenteController(IUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	@GetMapping("/paneldocente")
	public String paneldocente(Model model) {
		List<Usuario> docentes = usuarioService.obtenerUsuariosPorRol(2); // rol_id=2
		model.addAttribute("usuarios", docentes);
		return "/InterfazDocente/paneldocente";
	}

	@GetMapping("/MisCursos")
	public String MisCursos(Model model) {
		Integer docenteId = 2;
		// 2. Buscar los cursos asignados a este docente
		List<Usuario> cursos = usuarioService.obtenerUsuariosPorRol(docenteId);
		model.addAttribute("cursos", cursos);
		return "InterfazDocente/MisCursos";

	}

	@GetMapping("/Tareas")
	public String Tareas() {
		return "InterfazDocente/Tareas";
	}

	@GetMapping("/Foros")
	public String Foros() {
		return "InterfazDocente/Foros";
	}

	@GetMapping("/Mensajes")
	public String Mensajes() {
		return "InterfazDocente/Mensajes";
	}

	@GetMapping("/Asistencia")
	public String Asistencia() {
		return "InterfazDocente/Asistencia";
	}
}
