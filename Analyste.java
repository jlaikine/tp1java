package tp1;

public class Analyste extends Salarié{
	
	Analyste(String code, String nom, String prenom, String date,String nbdeplacementclient){
		super(code, nom, prenom, date);
		this.nbdeplacementclient = nbdeplacementclient;
		// TODO Auto-generated constructor stub
	}

	private String nbdeplacementclient;
	
	public String getNbdeplacementclient() {
		return nbdeplacementclient;
	}
	
	public void setNbdeplacementclient(String nbdeplacementclient) {
		this.nbdeplacementclient = nbdeplacementclient;
	}

}
