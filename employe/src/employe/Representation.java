package employe;

public class Representation extends employe {
	public double cha;
	

	public Representation(String n, String p, int a, String d, double cha) {
		super(n, p, a, d);
		this.cha = cha;
	}
	
	public double calculerSalaire() {
		
		return cha*0.2+800 ;
	}
	

}
