package poste;

public abstract class  ObjetPostalest {
	public String nomd;
	public String adressed;
	public int codp;
	public String nomv;
	public boolean objet;
	
	public ObjetPostalest(String nomd, String adressed, int codp, String nomv, boolean objet) {
		this.nomd = nomd;
		this.adressed = adressed;
		this.codp = codp;
		this.nomv = nomv;
		this.objet = objet;
	}
	
	
	public abstract double  calculpa();


	
	public String toString() {
		return " Nom du destinataire :" + nomd + "\n adressed=" + adressed + "\n Code postal :" + codp + "\n nom Ville :" + nomv
				+ "\n objet : " + objet ;
	}
	
	

	
	

}
