package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteRepository {
	
	public void insertar(Paciente paciente);
	public void actualizar(Paciente paciente);
	public Paciente seleccionar(String cedula);
	public void eliminar(String cedula);

}
