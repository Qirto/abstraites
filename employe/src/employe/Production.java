package employe;

public class Production extends employe  implements iemploye{
	
	public int nbu;

	public Production(String n, String p, int a, String d, int nn) {
		super(n, p, a, d);
		this.nbu=nn;
		
	}

	
	public double calculerSalaire() {

		return nbu *5+prime; 
	}

	

}
