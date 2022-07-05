package sheared;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Categorie  extends PanacheEntity{

	String libelle;
	String descript;
	
	@OneToMany(mappedBy = "categorie")
	List<Produit> produits=new ArrayList<Produit>();
	
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		
		
		this.libelle = libelle;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
}
