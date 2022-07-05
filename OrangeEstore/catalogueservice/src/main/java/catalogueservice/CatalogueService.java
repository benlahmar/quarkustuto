package catalogueservice;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.dao.CatalogueDao;

import sheared.Produit;

@ApplicationScoped
public class CatalogueService implements Iservices {

	@Inject
	CatalogueDao dao;
	@Override
	public void save(Produit p) {
		dao.save(p);
		
	}

	@Override
	public Produit findById( long id) {
		// TODO Auto-generated method stub
		return dao.findById( id);
	}

}
