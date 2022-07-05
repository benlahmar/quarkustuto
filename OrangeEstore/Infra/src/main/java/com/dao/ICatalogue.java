package com.dao;

import sheared.Produit;

public interface ICatalogue {

	public void save(Produit p);
	public Produit findById( long id);
}
