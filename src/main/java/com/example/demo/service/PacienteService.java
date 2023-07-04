package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteService {

	// CRUD
	public void guardar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente buscar(String cedula);
	public void eliminar(String cedula);

}
