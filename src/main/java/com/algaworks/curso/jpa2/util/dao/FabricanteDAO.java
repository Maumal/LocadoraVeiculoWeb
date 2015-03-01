package com.algaworks.curso.jpa2.util.dao;

import com.algaworks.curso.jpa2.util.modelo.Fabricante;
import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;



public class FabricanteDAO implements Serializable {

	@Inject
	private EntityManager em;
	
	public void salvar(Fabricante fabricante) {
		em.persist(fabricante);
	}
	
}
