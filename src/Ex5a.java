import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.Locale;

public class Ex5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat DdFormat2dec = new DecimalFormat("#.##");
		
		double dblPxNet,dblMtTVA;
		final int intTVA;			//final pr la constante
		
		
		intTVA=21;
		dblPxNet=100;
		dblMtTVA=dblPxNet-(dblPxNet/(100+intTVA)*100);
		//dblMtTVA=dblPxNet-dblPxNet/((double)intTVA*100);
		System.out.println("Pour un net de "+dblPxNet+"€, le cout de la TVA s'élève à "+dblMtTVA+" €.");
		System.out.println("Pour un net de "+dblPxNet+"€, le cout de la TVA s'élève à "+DdFormat2dec.format(dblMtTVA)+" €.");	
		
		
		
		System.out.println("#################");
		System.out.println("");
		System.out.println("#################");
		//
		//
		//Exercice avec demande à l'utilisateur
		//
		int intUserTva;
		double dblUserPxNet=0,dblUserMtTva;
		
		Scanner sc=new Scanner(System.in);
		//	sc.useLocale(Locale.US); // utilise le .
		//sc.useLocale(Locale.FRENCH); // utilise la ,
		
		
		System.out.println("Introduisez la Tva en nombre entier: ");
		intUserTva=sc.nextInt();
		System.out.println("La Tva est égual à "+intUserTva+"%.");

		System.out.println("Introduisez votre prix Net(veuillez mettre la virgule pour delimiter les decimal): ");

		
		
		
		try{																				//try: pour dire a l utilisateur que le n est pas correct pr les décimales
			dblUserPxNet=sc.nextDouble();
		} catch (InputMismatchException e){													//catch: pr le try
	    System.out.println("Veuillez utiliser la virgule pour les décimales !");
		}
		dblUserMtTva=dblUserPxNet-(dblUserPxNet/(100+intUserTva)*100);
		System.out.println("Pour un net de "+DdFormat2dec.format(dblUserPxNet)+"€ et une TVA de "+intUserTva+"%, le montant de la TVA est égual à "+DdFormat2dec.format(dblUserMtTva)+" €.");
		sc.close();
	}

}