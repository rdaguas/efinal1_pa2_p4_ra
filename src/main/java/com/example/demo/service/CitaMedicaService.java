package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.demo.repository.modelo.CitaMedica;

public interface CitaMedicaService {

	// CRUD
	public void guardar(String NumeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente);
	public void eliminar(String cedula);
	public void actualizar(String numero, String Diagnostico, String Receta, LocalDate fechaProximaCita);

}
