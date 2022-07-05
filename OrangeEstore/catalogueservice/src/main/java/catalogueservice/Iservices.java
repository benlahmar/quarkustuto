package catalogueservice;

import sheared.Produit;

public interface Iservices {

	public void save(Produit p);
	public Produit findById( long id);
}
