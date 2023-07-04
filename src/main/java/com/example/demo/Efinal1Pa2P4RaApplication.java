package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
import com.example.demo.repository.modelo.Paciente;
import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
import com.example.demo.service.PacienteService;

@SpringBootApplication
public class Efinal1Pa2P4RaApplication implements CommandLineRunner{
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private PacienteService pacienteService;
	
	@Autowired
	private CitaMedicaService citaMedicaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P4RaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			//INGRESAR 1 DOCTOR
			Doctor doct = new Doctor();
			doct.setCedula("1234");
			doct.setNombre("Roberto");
			doct.setApellido("Aguas");
			doct.setFechaNacimiento(LocalDate.of(2001, 3, 24));
			doct.setNumeroConsultorio("505A");
			doct.setCodigoSenescyt("SENESCYT55");
			doct.setGenero("Masculino");		
			
			//this.doctorService.guardar(doct);
			
			//INGRESAR 1 PACIENTE
			
			Paciente paci = new Paciente();
			paci.setCedula("5678");
			paci.setNombre("Vanessa");
			paci.setApellido("Salazar");
			paci.setFechaNacimiento(LocalDate.of(2000, 9, 18));
			paci.setCodigoSeguro("seg123");
			paci.setEstatura("1.63 m");
			paci.setPeso("54 kg");
			paci.setGenero("Femenino");			
			//this.pacienteService.guardar(paci);
			paci.setId(1);
			paci.setNombre("Daniel");
			paci.setApellido("valencia");
			//actualizo por el Nombre Y Apellido
			//this.pacienteService.actualizar(paci);
			
			//this.citaMedicaService.guardar("123456789", LocalDate.now(), new BigDecimal(35), "Quito-Hospital", "1234", "5678");
			//this.citaMedicaService.actualizar("123456789", "Fractura Mano", "Paralizacion 2 meses", LocalDate.of(2024, 1, 12));
		
	}

}
