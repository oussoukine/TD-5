package TD5;

public class employeTempPartiel extends employe {
	private double montantH;
	final int heure=35;
	public employeTempPartiel(double montantH,String name,String job){
		super(name,job);
		this.montantH= montantH;
	}
	public double getMontantH(double montantH){return montantH;}
	public void setMontantH(double montantH){this.montantH= montantH;}

	public double calculePaie(){ setSalaire(montantH*heure);
	return getSalaire();}
}
