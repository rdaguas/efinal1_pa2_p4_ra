package com.example.demo.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.repository.modelo.CitaMedica;

public interface CitaMedicaRepository {

	//CRUD
			public void insertar(CitaMedica citaMedica);
				public void actualizar(CitaMedica citaMedica);
				public CitaMedica seleccionarPorNumeroCita(String numero);
				public void eliminar(String cedula);
	
}
