import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat decFormat=new DecimalFormat("#.##");
		
		double dblUserPxNet,dblUserMtTva;
		int intTva;
		
		intTva=21;
		
		System.out.println("Entrez le prix Net (utilisez la virgule pour délimiter les décimal :");

		Scanner sc=new Scanner(System.in);
		dblUserPxNet=sc.nextDouble();
		
		dblUserMtTva=dblUserPxNet-(dblUserPxNet/(100+intTva)*100);
		System.out.println("Pour un net de "+dblUserPxNet+"€, le coût de la TVA s'élève à "+decFormat.format(dblUserMtTva)+" €.");
		sc.close();
				
		
		
		
	}

}
