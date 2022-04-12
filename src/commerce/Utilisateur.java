package commerce;

public class Utilisateur {
	private String idUser;
	private String nom;
	private String prenom;
	private String password;
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Utilisateur(String id, String nom, String pre, String pwd) {
		this.idUser = id;
		this.nom = nom;
		this.prenom = pre;
		this.password = pwd;
	}
}
