package TD5;

public class employe {
	private String name;
	private String job;
	private double salaire;
	public employe(){
		name=null;
		job=null;
	}
	public  employe(String name,String job){
		this.name=name;
		this.job=job;
	}
	public String getNom(){return this.name;}
	public String getJob(){return this.job;}
	public double getSalaire(){return this.salaire;}
	public void setSalaire(double salaire){this.salaire= salaire;}
	public double calculePaie(){
		return salaire;}
	public void chequePaie(){
		System.out.println("payer à l'ordre de "+name+" ("+job+") *** "+salaire+" DA");
	}
}