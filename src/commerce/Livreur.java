package commerce;

import java.util.ArrayList;

public class Livreur extends Utilisateur{
	
	public ArrayList<Produit> commandesALivrer;
	
	public Livreur(String id, String nom, String pre, String pwd) {
		super(id, nom, pre, pwd);
	}
	
	public ArrayList<Produit> afficherCommandes() {
		return this.commandesALivrer;
	}
}

