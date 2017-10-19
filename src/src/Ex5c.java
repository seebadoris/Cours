import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Ex5c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DecimalFormat DdFormat2dec = new DecimalFormat("#.##");


		int intUserTva;
		double dblUserPxNet=0,dblUserMtTva;

		Scanner sc=new Scanner(System.in);
		//	sc.useLocale(Locale.US); // utilise le .
		//sc.useLocale(Locale.FRENCH); // utilise la ,
		
		
		//System.out.println("un A :");
		//String.replaceAll("\\.", ",");
		
		System.out.println("Introduisez la Tva en nombre entier: ");
		intUserTva=sc.nextInt();
		System.out.println("La Tva est égual à "+intUserTva+"%.");

		System.out.println("Introduisez votre prix Net(veuillez mettre la virgule pour delimiter les decimal): ");
		
		dblUserPxNet=sc.nextDouble();
		String strOutput = (string)dblUserPxNet.replaceALL('.', ',');										
			
	

		
		

		dblUserMtTva=dblUserPxNet-(dblUserPxNet/(100+intUserTva)*100);
		System.out.println("Pour un net de "+DdFormat2dec.format(dblUserPxNet)+"€ et une TVA de "+intUserTva+"%, le montant de la TVA est égual à "+DdFormat2dec.format(dblUserMtTva)+" €.");
		sc.close();
		

			
		
		
	}

}
public class Ex5c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
