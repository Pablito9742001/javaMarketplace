package commerce;

import java.util.ArrayList;

public class Client extends Utilisateur {
	private ArrayList<Produit> panier;
	private boolean livraisonGratuite;

	public Client(String id, String nom, String pre, String pwd) {
		super(id, nom, pre, pwd);
	}
	
	public void setPanier(ArrayList<Produit> panier) {
		this.panier = panier;
	}
	
	public void ajouterProduit(Produit nouveauProduit) {
		this.panier.add(nouveauProduit);
	}
	
	public Produit getPanier(int i) {
		return panier.get(i);
	}
	
	public ArrayList<Produit> optiPanier(ArrayList<Produit> listeProduitInterne) {
		for (int i = 0; i < listeProduitInterne.size() - 1; i++) {
			if (listeProduitInterne.get(i).getPrix() > listeProduitInterne.get(i + 1).getPrix()) {
				Produit a = listeProduitInterne.get(i) ;
				Produit b = listeProduitInterne.get(i+1) ;
				Produit temp = a;
				a = b ;
				b = temp;
			}
		}
		return listeProduitInterne;
	}
}

