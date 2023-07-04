package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepository;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.CitaMedica;
import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService {

	@Autowired
	private PacienteRepository pacienteRepository;

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private CitaMedicaRepository citaMedicaRepository;

	@Override
	public void guardar(String NumeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		Paciente paci = this.pacienteRepository.seleccionar(cedulaPaciente);
		Doctor doct = this.doctorRepository.seleccionar(cedulaDoctor);
		LocalDate ld = LocalDate.of(2023, 3, 6);
		
		CitaMedica cime = new CitaMedica();
		cime.setNumeroCita(NumeroCita);
		cime.setFechaCita(fechaCita);
		cime.setValorCita(valorCita);
		cime.setLugarCita(lugarCita);
		cime.setDoctor(doct);
		cime.setPaciente(paci);
		
		this.citaMedicaRepository.insertar(cime);

	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(String numero, String Diagnostico, String Receta, LocalDate fechaProximaCita) {
		CitaMedica cime = this.citaMedicaRepository.seleccionarPorNumeroCita(numero);
		cime.setDiagnostico(Diagnostico);
		cime.setReceta(Receta);
		cime.setFechaProximaCita(fechaProximaCita);
		this.citaMedicaRepository.actualizar(cime);

	}

}
