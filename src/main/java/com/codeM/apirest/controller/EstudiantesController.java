package com.codeM.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeM.apirest.model.Estudiante;

@RestController
public class EstudiantesController {
	
	@Autowired
	private EstudianteServiceImpl estudianteService;
	
	@GetMapping("api/estudiante")
	public List<Estudiante> obtenerEstudiantes(){
		List<Estudiante> listaEstudiantes= new ArrayList<>();
		Estudiante e = new Estudiante();
		e.setNombres("Jul");
		e.setApellido("Mol");
		e.setEmail("jul@email.com");
		e.setNota(7);
		listaEstudiantes.add(e);
		return listaEstudiantes;
	}
	
	@PostMapping("api/estudiantes")
	public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {
		System.out.println(estudiante);
		estudianteService.guardar(estudiante);
		return estudiante;
	}
	
	@GetMapping("api/estudiantes")
	public List<Estudiante> obtener(){
		return estudianteService.obtenerTodos();
	}
	
	@GetMapping("api/estudiantes/{id}")
	public Estudiante obtenerEstudiante(@PathVariable("id") Integer id) {
		return estudianteService.obtenerEstudiante(id);
	}
	
	@PutMapping("api/estudiantes")
	public void actualizarEstudiante(@RequestBody Estudiante estudiante) {
		estudianteService.actualizar(estudiante);
	}
	
	@DeleteMapping("api/estudiantes/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		estudianteService.eliminar(id);
	}

}
