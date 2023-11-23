package employe;

public abstract class employe {
	public String nom;
	public String prenom;
	public int age;
	public String date;
	public abstract double calculerSalaire ();
	
	public String getnom()
	{
		return "L'Employe " +" \n nom : "+ nom + " \n prenom :  " + prenom + "\n" ;
	}
	
	public employe (String n, String p , int a, String d) {
		
		this.nom = n;
		this.prenom = p;
		this.age = a;
		this.date = d;
		
	}
	
	
	
	
}
