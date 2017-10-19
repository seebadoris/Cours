import java.text.DecimalFormat;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat DdFormat2dec = new DecimalFormat("#.##");
		
		double dblTVA,dblPxNet,dblMtTVA;
		
		dblTVA=1.21;
		dblPxNet=24.20;
		dblMtTVA=dblPxNet-(dblPxNet/dblTVA);
		
		System.out.println("Pour un net de "+dblPxNet+"€, le cout de la TVA s'élève à "+dblMtTVA+" €.");
		System.out.println("Pour un net de "+dblPxNet+"€, le cout de la TVA s'élève à "+DdFormat2dec.format(dblMtTVA)+" €.");	
				
				
	}

}
