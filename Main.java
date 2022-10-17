package tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main extends Salarié{
	
	Main(String code, String nom, String prenom, String date) {
		super(code, nom, prenom, date);
		// TODO Auto-generated constructor stub
	}
	
	public static String menu(BufferedReader in) throws IOException {
		System.out.println("--------MENU-------");
		System.out.println("1 - Ajouter un concepteur");
		System.out.println("2 - Supprimer un concepteur");
		System.out.println("3 - Lister les concepteurs existants");
		System.out.println("4 - Ajouter un analyste");
		System.out.println("5 - Supprimer un analyste");
		System.out.println("6 - Lister les salariés existants en mettant en évidance la fonction (Concepteur ou Analyste");
		System.out.println("Faites votre choix : ");
		return (in.readLine());
	}
	
	public static void traitement1(Map<String, Concepteur> hmapConcepteur, BufferedReader in) throws IOException {
		System.out.println("Saisir le code, nom, prénom, date d’embauche et "
				+ "nombre d’année de développement : ");
		String s = in.readLine();
		String[] tab = s.split("-");
		
		String code = tab[0];
		String nom = tab[1];
		String prenom = tab[2];
		String date = tab[3];
		String nbanneedev = tab[4];
		
		
		if (hmapConcepteur.containsKey(code)) {
			System.out.println("Code déja existant !\n\n");
		}else {
			Concepteur concepteur = new Concepteur(code,nom,prenom,date,nbanneedev);
			hmapConcepteur.put(code, concepteur);
			System.out.println("Insertion du concepteur " + code + "!\n\n");
		}
		
		
	}
	
	public static void traitement2(Map<String, Concepteur> hmapConcepteur, BufferedReader in) {
		try {
			int tailleAvant = hmapConcepteur.size();
			System.out.println("Saisir le code : ");
			String s = in.readLine();
			hmapConcepteur.remove(s);
			
			int tailleApres = hmapConcepteur.size();
			
			if (tailleAvant == tailleApres) {
				System.out.println("Le code saisi est incorrect");
			} else {
				System.out.println("L'utilisateur a été supprimé");
			}
			System.out.println("\n\n");
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public static void traitement3(Map<String, Concepteur> hmapConcepteur) {
		Iterator iterator = hmapConcepteur.entrySet().iterator();
		ArrayList<Concepteur> al = new ArrayList<Concepteur>();
		int index = 0;
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          al.add((Concepteur) mapentry.getValue());
          System.out.println(al.get(index).getCode() + " " + al.get(index).getNom() + " " + al.get(index).getPrenom() + " " + al.get(index).getDate() + " " + al.get(index).getNbanneedev()) ;
          index += 1;
        }
        System.out.println("\n\n");
	}
	
	public static void traitement4(Map<String, Analyste> hmapAnalyste, BufferedReader in) throws IOException {
		System.out.println("Saisir le code, nom, prénom, date d’embauche et "
				+ "nombre de déplacement client : ");
		String s = in.readLine();
		String[] tab = s.split("-");
		
		String code = tab[0];
		String nom = tab[1];
		String prenom = tab[2];
		String date = tab[3];
		String nbdeplacementclient = tab[4];
		
		if (hmapAnalyste.containsKey(code)) {
			System.out.println("code déjà existant !\n\n");
		} else {
			Analyste analyste = new Analyste(code,nom,prenom,date,nbdeplacementclient);
			hmapAnalyste.put(code, analyste);
			
			System.out.println("Insertion du analyste " + code + "!\n\n");
		}
		
	}
	
	public static void traitement5(Map<String, Analyste> hmapAnalyste, BufferedReader in) {
		try {
			int tailleAvant = hmapAnalyste.size();
			System.out.println("Saisir le code : ");
			String s = in.readLine();
			hmapAnalyste.remove(s);
			
			int tailleApres = hmapAnalyste.size();
			if (tailleAvant == tailleApres) {
				System.out.println("Le code saisi est incorrect");
			} else {
				System.out.println("L'utilisateur a été supprimé");
			}
			System.out.println("\n\n");
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public static void traitement6(Map<String, Salarié> salarie, Map<String, Concepteur> hmapConcepteur, Map<String, Analyste> hmapAnalyste ) {
		salarie.putAll(hmapConcepteur);
		salarie.putAll(hmapAnalyste);
		Iterator iterator = salarie.entrySet().iterator();
		ArrayList<Salarié> al = new ArrayList<Salarié>();
		int index = 0;
        while (iterator.hasNext()) {
          Map.Entry mapentry = (Map.Entry) iterator.next();
          al.add((Salarié) mapentry.getValue());
          System.out.println(al.get(index).getCode() + " " + al.get(index).getNom() + " " + al.get(index).getPrenom() + " " + al.get(index).getDate());
          index += 1;
        }
        System.out.println("\n\n");
	}
	
	//Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Concepteur> hmapConcepteur = new HashMap<String, Concepteur>();
		Map<String, Analyste> hmapAnalyste = new HashMap<String, Analyste>();
		Map<String, Salarié> salarie = new HashMap<String, Salarié>();
		
		try {
			while (true) {
				
			//Menu
			String i = menu(in);
			
			//Ajouter un concepteur
			if (i.equals("1")) {
				traitement1(hmapConcepteur, in);
			}
			
			//Supprimer un concepteur
			if (i.equals("2")) {
				traitement2(hmapConcepteur, in);
			}
			
			//Lister les concepteurs existants
			if (i.equals("3")) {
				traitement3(hmapConcepteur);
			}
			
			//Ajouter un analyste
			if (i.equals("4")) {
				traitement4(hmapAnalyste, in);
			}
			
			//Supprimer un analyste
			if (i.equals("5")) {
				traitement5(hmapAnalyste, in);
			}
			
			//Lister tous les salariés existants
			if (i.equals("6")) {
				traitement6(salarie, hmapConcepteur, hmapAnalyste);
			}
			
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}

}
