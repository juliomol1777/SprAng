package com.codeM.apirest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "estudiantes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estudiante {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String nombres;
	private String apellido;
	private String email;
	private double nota;
	
	public Estudiante() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombres=" + nombres + ", apellido=" + apellido + ", email=" + email
				+ ", nota=" + nota + "]";
	}
	
}
