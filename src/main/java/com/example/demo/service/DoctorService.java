package com.example.demo.service;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorService {

	//CRUD
			public void guardar(Doctor doctor);
				public void actualizar(Doctor doctor);
				public Doctor buscar(String cedula);
				public void eliminar(String cedula);
	
}
