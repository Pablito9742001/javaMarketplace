package commerce;

import java.util.ArrayList;

public class Vendeur extends Utilisateur {
	private ArrayList<Produit> listeProduitExterne;
	public boolean contratSigne;

	public Vendeur(String id, String nom, String pre, String pwd) {
		super(id, nom, pre, pwd);
	}
	
	public void ajouterProduit(Produit nouveauProduit) {
		this.listeProduitExterne.add(nouveauProduit);
	}
	
	public void suppProduit(Produit nouveauProduit) {
		this.listeProduitExterne.remove(nouveauProduit);
	}
	
	public void setProduit (int i, Produit newProduit) {
		listeProduitExterne.set(i, newProduit);
	}
}


