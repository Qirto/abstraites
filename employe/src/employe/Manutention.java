package employe;

public class Manutention extends employe implements iemploye {
	public int h;

	public Manutention(String n, String p, int a, String d, int h) {
		super(n, p, a, d);
		this.h = h;
	}

	
	public double calculerSalaire() {
	
		return h*65 + prime;
	}



	
	

}
