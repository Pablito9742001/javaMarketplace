package commerce;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;  

public class Produit {
	private int idProduit;
	private String nom;
	private String description;
	private int prix;
	private boolean dispo;
	Date dateEstimee;
	private boolean estExpedie;
	Vendeur vendeur;
	
	public Produit (int id, String nom, String desc, int prix, boolean dispo, Date date, Vendeur vendeur) {
		this.idProduit = id;
		this.nom = nom;
		this.description = desc;
		this.prix = prix;
		this.dispo = dispo;
		this.dateEstimee = date;
		this.vendeur = vendeur;
	}
	
	public int getIdProduit() {
		return this.idProduit;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getPrix() {
		return this.prix;
	}
	
	public boolean getDispo() {
		return this.dispo;
	}
	
	public Date getDate() {
		return this.dateEstimee;
	}
	
	public Vendeur getVendeur() {
		return this.vendeur;
	}
	
	public void setIdProduit(int newId) {
		this.idProduit = newId;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	public void setExpedie(boolean expedie) {
		this.estExpedie = expedie;
	}
}
