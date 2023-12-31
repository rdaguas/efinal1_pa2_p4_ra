package com.example.demo.repository;

import com.example.demo.repository.modelo.Doctor;

public interface DoctorRepository {

	//CRUD
	public void insertar(Doctor doctor);
		public void actualizar(Doctor doctor);
		public Doctor seleccionar(String cedula);
		public void eliminar(String cedula);
}
