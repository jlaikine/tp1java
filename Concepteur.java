package tp1;

public class Concepteur extends Salarié{
	
	public Concepteur(String code, String nom, String prenom, String date, String nbanneedev) {
		super(code, nom, prenom, date);
		this.nbanneedev = nbanneedev;

	}

	private String nbanneedev;
	
	
	public String getNbanneedev() {
		return nbanneedev;
	}
	
	public void setNbanneedev(String nbanneedev) {
		this.nbanneedev = nbanneedev;
	}
}
