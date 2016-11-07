 
 public class employemod {
	private String name;
	private String job;
	private double salaire;
  private int nba;
	public employe(){
		name=null;
		job=null;
	}
	public  employe(String name,String job,int nba){
		this.name=name;
		this.job=job;
    this.nba=nba;
	}
	public String getNom(){return this.name;}
	public String getJob(){return this.job;}
  public int getNba(){return this.nba}
	public double getSalaire(){return this.salaire;}
	public void setSalaire(double salaire){this.salaire= salaire;}
	public double calculePaie(){
		return salaire;}
	public void chequePaie(){
  if(this.nba>=3)
		System.out.println("payer à l'ordre de "+name+" ("+job+") *** "+salaire+" DA"+"nombre d'absence"+nba);
	}
}
