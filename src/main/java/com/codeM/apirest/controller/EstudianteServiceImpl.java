package com.codeM.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeM.apirest.model.Estudiante;

@Service
public class EstudianteServiceImpl {
	
	@Autowired
	private EstudianteRepositoryInterf estudianteRepositoryInterf;
	
	public void guardar(Estudiante estudiante) {
		estudianteRepositoryInterf.save(estudiante);
	}
	
	public List<Estudiante> obtenerTodos(){
		return estudianteRepositoryInterf.findAll();
	}
	
	public Estudiante obtenerEstudiante(Integer id){
		return estudianteRepositoryInterf.getOne(id);
	}
	
	public void actualizar(Estudiante estudiante) {
		estudianteRepositoryInterf.save(estudiante);
	}
	
	public void eliminar(Integer id) {
		estudianteRepositoryInterf.deleteById(id);
	}
}
