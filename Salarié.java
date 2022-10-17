package tp1;

import java.util.Date;

public class Salarié {
	
	private String code;
	private String nom;
	private String prenom;
	private String date;
	
	public Salarié (String code, String nom, String prenom, String date){
		this.code = code;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
	}
	
	//-----------------GET
	public String getCode() {
		return this.code;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getDate() {
		return this.date;
	}
	
	//-----------------SET
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public static void main(String[] args) {
		

	}

}
