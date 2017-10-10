import java.text.DecimalFormat;
public class Ex4a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dblMBrut,dblMNet;
		int intTVA;
		
		DecimalFormat DfFormat1=new DecimalFormat("#.##");
		
		dblMBrut=20.2101;
		intTVA=21;
		
		dblMNet=dblMBrut*(intTVA/100)+dblMBrut;			//si on met la parenthese et que int est divise en 100 cela donne "0" pas double :))
		dblMNet=dblMBrut*intTVA/100+dblMBrut;			//ici il fait le brut *21 et ensuite divise en 100 avec la variable double 
														//correct
		
		System.out.println("Pour le prix brut de "+dblMBrut+" €, le prix net est de "+ DfFormat1.format(dblMNet)+" €.");
	}

}
