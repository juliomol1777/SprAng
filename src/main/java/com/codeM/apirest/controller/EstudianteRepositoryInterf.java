package com.codeM.apirest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeM.apirest.model.Estudiante;

@Repository
public interface EstudianteRepositoryInterf extends JpaRepository<Estudiante, Integer>{

}
