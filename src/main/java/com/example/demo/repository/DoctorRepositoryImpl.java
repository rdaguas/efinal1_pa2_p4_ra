package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class DoctorRepositoryImpl implements DoctorRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor doctor) {
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizar(Doctor doctor) {
		this.entityManager.merge(doctor);
	}

	@Override
	public Doctor seleccionar(String cedula) {
		TypedQuery<Doctor> myQuery = this.entityManager.createQuery("SELECT e FROM Doctor e WHERE e.cedula = :datoCedula", Doctor.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		this.entityManager.remove(cedula);
	}

}
