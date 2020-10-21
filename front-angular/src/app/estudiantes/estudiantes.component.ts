import { Component, OnInit } from '@angular/core';
import {Estudiante} from './estudiante';
import { EstudianteService } from './estudiante.service';

@Component({
  selector: 'app-estudiantes',
  templateUrl: './estudiantes.component.html',
  styleUrls: ['./estudiantes.component.css']
})
export class EstudiantesComponent implements OnInit {

  estudiantes:Estudiante[];

  titulo: string= "Lista de Estudiantes";

  constructor(private estudianteServicio: EstudianteService) { }

  ngOnInit(): void {
    this.estudianteServicio.getAll().subscribe(
      e => this.estudiantes=e
    )
  }
}
