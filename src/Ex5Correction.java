
public class Ex5Correction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final double dblPctTVA=21.0;
		double dblPrixNet,dblPrixBrut,dblCoutTVA;
		
		dblPrixNet=100.25;
		
		dblPrixBrut=dblPrixNet/(1+(dblPctTVA/100));
		dblCoutTVA=(dblPctTVA/100)*dblPrixBrut;
		
		System.out.println("Pour un prix net de "+dblPrixNet+"€ le cout de la TVA s'élève à "+dblCoutTVA);
		

	}

}
