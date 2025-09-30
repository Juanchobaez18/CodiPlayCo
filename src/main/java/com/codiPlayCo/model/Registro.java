package com.codiPlayCo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "registros")
public class Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	@ManyToOne
	private Curso curso;

	@ManyToOne
	private Usuario usuario;

	public Registro() {

	}

	public Registro(Integer id, Curso curso, Usuario usuario) {
		super();
		this.id = id;
		this.curso = curso;
		this.usuario = usuario;
	}

	public Usuario getEstudiante() {
		return usuario;
	}

	public void setEstudiante(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Registro [id=" + id + "]";
	}

}
