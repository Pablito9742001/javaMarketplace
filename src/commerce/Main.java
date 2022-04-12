package commerce;

import java.io.File;
import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour qui etes- vous ? (1 : marketplace, 2 : vendeur, 3 : client, 4 : livreur)");
		int x;
		x=sc.nextInt();
		
		if (x==1) {
			String login="", mdp="", prenom="", nom="";
			int compte;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Avez vous un compte ? (1 : oui, 0 : non)");
			compte=sc2.nextInt();
			
			if (compte==1) {
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc3.nextLine();
				System.out.println("Mdp: ");
				mdp=sc3.nextLine();
				sc3.close();
				
				nom = readNomFile("connexion.csv", login, mdp);
				prenom = readPrenomFile("connexion.csv", login, mdp);
				
				Marketplace m = new Marketplace(login,nom,prenom,mdp);
			}
			
			else if (compte==0){
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc4.nextLine();
				System.out.println("Mdp: ");
				mdp=sc4.nextLine();
				System.out.println("Prenom: ");
				prenom=sc4.nextLine();
				System.out.println("Nom: ");
				nom=sc4.nextLine();
				sc4.close();
				
				Marketplace m = new Marketplace(login,nom,prenom,mdp);
				writeIDFile("connexion.csv", login, nom, prenom, mdp);
				
				System.out.println("Votre CA: "+ m.getTotalCommissionsCA());
			}
			System.out.println("Bonjour "+prenom+" ("+login+") "+nom+". Que voulez faire ? (1 : ajouter un produit, 2 : ajouter un vendeur, 3 : afficher ton chiffre d'affaire, 4 : expedier une commande)");
			
		}
		
		if (x==2) {
			String login="", mdp="", prenom="", nom="";
			int compte;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Avez vous un compte ? (1 oui, 0 non)");
			compte=sc2.nextInt();
			
			if (compte==1) {
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc3.nextLine();
				System.out.println("Mdp: ");
				mdp=sc3.nextLine();
				sc3.close();
				
				nom = readNomFile("connexion.csv", login, mdp);
				prenom = readPrenomFile("connexion.csv", login, mdp);
				
				Vendeur v = new Vendeur(login,nom,prenom,mdp);
			}
			
			else if (compte==0){
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc4.nextLine();
				System.out.println("Mdp: ");
				mdp=sc4.nextLine();
				System.out.println("Prenom: ");
				prenom=sc4.nextLine();
				System.out.println("Nom: ");
				nom=sc4.nextLine();
				sc4.close();
				
				Vendeur v = new Vendeur(login,nom,prenom,mdp);
				writeIDFile("connexion.csv", login, nom, prenom, mdp);
			}
			
			System.out.println("Bonjour "+prenom+" ("+login+") "+nom+". Que voulez-faire ? (1 : ajouter un produit, 2 : modifier un produit, 3 : supprimer un produit, 4 : suivre les ventes)");
		}
		
		if (x==3) {
			String login="", mdp="", prenom="", nom="";
			int compte;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Avez vous un compte ? (1 oui, 0 non)");
			compte=sc2.nextInt();
			
			if (compte==1) {
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc3.nextLine();
				System.out.println("Mdp: ");
				mdp=sc3.nextLine();
				sc3.close();
				
				nom = readNomFile("connexion.csv", login, mdp);
				prenom = readPrenomFile("connexion.csv", login, mdp);
				
				Client c = new Client(login,nom,prenom,mdp);
			}
			
			else if (compte==0){
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc4.nextLine();
				System.out.println("Mdp: ");
				mdp=sc4.nextLine();
				System.out.println("Prenom: ");
				prenom=sc4.nextLine();
				System.out.println("Nom: ");
				nom=sc4.nextLine();
				sc4.close();
				
				Client c = new Client(login,nom,prenom,mdp);
				writeIDFile("connexion.csv", login, nom, prenom, mdp);
			}
			
			System.out.println("Bonjour "+prenom+" ("+login+") "+nom+". Que voulez-vous faire ? (1 : consulter et sélectionner des produits, 2 : optimiser votre panier, 3 : valider votre commande, 4 : suivre votre livraison)");
		}
		
		if (x==4) {
			String login="", mdp="", prenom="", nom="";
			int compte;
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Avez vous un compte ? (1 oui, 0 non)");
			compte=sc2.nextInt();
			
			if (compte==1) {
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc3.nextLine();
				System.out.println("Mdp: ");
				mdp=sc3.nextLine();
				sc3.close();
				
				nom = readNomFile("connexion.csv", login, mdp);
				prenom = readPrenomFile("connexion.csv", login, mdp);
				
				Livreur l = new Livreur(login,nom,prenom,mdp);
			}
			
			else if (compte==0){
				Scanner sc4 = new Scanner(System.in);
				System.out.println("Login: ");
				login=sc4.nextLine();
				System.out.println("Mdp: ");
				mdp=sc4.nextLine();
				System.out.println("Prenom: ");
				prenom=sc4.nextLine();
				System.out.println("Nom: ");
				nom=sc4.nextLine();
				sc4.close();
				
				Livreur l = new Livreur(login,nom,prenom,mdp);
				writeIDFile("connexion.csv", login, nom, prenom, mdp);
			}
			System.out.println("Bonjour "+prenom+" ("+login+") "+nom+". Que voulez-vous faire ? (1 : afficher tes commandes a livrer, 2 : optimiser ton trajet, 3 : notifier les clients)");
			
		}
		sc.close();
	}
	
	
	public static void writeIDFile(String filePath, String login, String nom, String prenom, String mdp) {
		File file = new File (filePath);
		try {
			FileWriter f = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(f);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println(login+","+nom+","+prenom+","+mdp);
			
			pw.flush();
			pw.close();
			bw.close();
			f.close();
		}   
		
		catch(Exception e)
	    {
	      e.printStackTrace();
	    }
    }
	
	
	public static String readNomFile(String filePath, String login, String mdp) {
		File file = new File (filePath);
		String line = "";
		String a = "";
		
		try {
			FileReader f = new FileReader(file);
			BufferedReader br = new BufferedReader(f);
			
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if ((values[0].equals(login)) && (values[3].equals(mdp))) {
					a = values[1];
				}
			}
			br.close();
			f.close();
		}
		catch(Exception e)
	    {
	      e.printStackTrace();
	    }
		
		return a ;
	}
	
	public static String readPrenomFile(String filePath, String login, String mdp) {
		File file = new File (filePath);
		String line = "";
		String a = "";
		
		try {
			FileReader f = new FileReader(file);
			BufferedReader br = new BufferedReader(f);
			
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				if ((values[0].equals(login)) && (values[3].equals(mdp))) {
					a = values[2];
				}
			}
			br.close();
			f.close();
		}
		catch(Exception e)
	    {
	      e.printStackTrace();
	    }
		
		return a ;
	}
}
