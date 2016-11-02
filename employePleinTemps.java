package TD5;

public class employePleinTemps extends employe{
	private double montantParS;
	private double prime;
	public  employePleinTemps(double montantParS,double prime,String name,String job){
		super(name,job);
		this.montantParS= montantParS;
		this.prime=prime;
	}
	public double getMontantParS(double montantParS){return montantParS;}
	public void setMontantParS(double montantParS){this.montantParS= montantParS;}
	public double getPrime(){return prime;}
	public double calculePaie(){ setSalaire(montantParS*4+prime);
	return getSalaire();}
}
