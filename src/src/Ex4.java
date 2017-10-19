import java.text.DecimalFormat;

public class Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat DdFormat=new DecimalFormat("#.##");
		
		double dblMBrut,dblMNet,dblTVA;

		dblMBrut=20.10;
		dblTVA=1.21;
		dblMNet=dblMBrut*dblTVA;
		
		System.out.println("Pour le prix brut de "+dblMBrut+" €, le prix net est de "+ dblMNet+" €.");
		
		System.out.println("Pour le prix brut de "+dblMBrut+" €, le prix net est de "+ DdFormat.format(dblMNet)+" €. Avec le format de 2 décimal.");
	}

}
