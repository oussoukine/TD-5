package TD5;

public class Main {
	public static void main(String[] args) {
		employe emp[]=new employe[3];
		emp[0]=new employe ("Salim","PDG");
		emp[1]=new employeTempPartiel (571.43,"Halima","Secrétaire");
		emp[2]=new employePleinTemps (3500,1000,"AbdelHalim","Sécurité");
		/*employe*/
		emp[0].setSalaire(100000.0);
		emp[0].chequePaie();
		/*employeTempPartiel*/
		((employeTempPartiel)emp[1]).calculePaie();
		((employeTempPartiel)emp[1]).chequePaie();
		/*employePleinTemps*/
		((employePleinTemps)emp[2]).calculePaie();
		((employePleinTemps)emp[2]).chequePaie();	
	}

}
