package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.CitaMedica;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CitaMedicaImpl implements CitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CitaMedica citaMedica) {
		this.entityManager.persist(citaMedica);
		
	}

	@Override
	public void actualizar(CitaMedica citaMedica) {
		this.entityManager.merge(citaMedica);
	}

	@Override
	public CitaMedica seleccionarPorNumeroCita(String numero) {
		TypedQuery<CitaMedica> myQuery = this.entityManager.createQuery("SELECT e FROM CitaMedica e WHERE e.numeroCita = :datoNumero", CitaMedica.class);
		myQuery.setParameter("datoNumero", numero);
		return myQuery.getSingleResult();
	}

	@Override
	public void eliminar(String cedula) {
		this.entityManager.remove(cedula);
	}

}
