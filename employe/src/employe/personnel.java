package employe;

public class personnel  {
	int nb=0;
	public employe [] collectiont ;

	
	
	public personnel(int max) {
		collectiont = new employe[max];
	}



	public void ajoutere(employe e) {
		
		this.collectiont[nb] = e;
		nb++;
	}
	
	
	
	
	public  void calculerSalaires() {
		for(int i=0 ;i<nb-1;i++) {
			
			System.out.println(collectiont[i].getnom() + "salaire : "+collectiont[i].calculerSalaire()  );
			
			
		}
		}
	
	public double salaireMoyen() {
		int tot = 0;
		for(int i=0 ;i<nb-1;i++) {
			tot +=collectiont[i].calculerSalaire(); 
		}
		return tot/nb-1;
		
		
		
	}

}
