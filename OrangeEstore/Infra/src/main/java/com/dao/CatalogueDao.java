package com.dao;

import javax.enterprise.context.ApplicationScoped;

import sheared.Produit;

@ApplicationScoped
public class CatalogueDao implements ICatalogue {

	@Override
	public void save(Produit p) {
		 
		p.persist();
	}

	@Override
	public Produit findById( long id) {
		return Produit.findById(id);
		
	}

	

}
