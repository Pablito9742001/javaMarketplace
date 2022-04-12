package commerce;

import java.util.ArrayList;

public class Marketplace extends Utilisateur {
	
	private ArrayList<Vendeur> listVendeur;

	private int totalCommissionsCA = 0;
	public ArrayList<Produit> listeProduitInterne;
	
	public Marketplace(String id, String nom, String pre, String pwd) {
		super(id, nom, pre, pwd);
	}
	
	public int getTotalCommissionsCA() {
		return this.totalCommissionsCA;
	}
	
	public Produit getListeProduitInterne(int i) {
		return listeProduitInterne.get(i);
	}
	
	public void setProduit (int i, Produit newProduit) {
		listeProduitInterne.set(i, newProduit);
	}
	
	public void setTotalCommissionsCA(int nouvelleCommissionCA) {
		this.totalCommissionsCA = nouvelleCommissionCA;
	}

	public void ajouterProduit(Produit nouveauProduit) {
		this.listeProduitInterne.add(nouveauProduit);
	}
	
	public void ajouterVendeur(Vendeur nouveauVendeur) {
		if (nouveauVendeur.contratSigne == true) {
			this.listVendeur.add(nouveauVendeur);
		} else {
			System.out.println("Ce vendeur n'a pas de contrat");
		}
		
	}
	
	public void expedierCommande(Livreur livreur, Produit produit) {
		produit.setExpedie(true);
		livreur.commandesALivrer.add(produit);
	}
	
}



