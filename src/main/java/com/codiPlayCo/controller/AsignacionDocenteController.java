package com.codiPlayCo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codiPlayCo.model.AsignacionDocente;
import com.codiPlayCo.service.IAsignacionDocenteService;

@Controller
@RequestMapping("/asignaciones")
public class AsignacionDocenteController {

	@GetMapping("/MisCursos")
	public String Misursos(Model model) {
		List<AsignacionDocente> asignaciones = IAsignacionDocenteService.findAll();
		model.addAttribute("asignaciones", asignaciones);
		return "InterfazDocente/MisCursos";
	}
}
