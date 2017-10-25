import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	DecimalFormat dF=new DecimalFormat("#.##");
	
	double[] dblTva={6.0,12.0,21.0};
//	double dblTva[][] = {{1,6},{2,12},{3,21}};
	double dblUserTva2=0;
	double dblUserTva,dblUserPxBrut,dblPxNet;

	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21 : ");			
	dblUserTva2=sc.nextDouble();															//demande de TVA


		if (dblUserTva2!= 1 && dblUserTva2!= 2 && dblUserTva2!=3) {								//si l user encode une valeur autre que 1,2,3
			System.out.println("Donnée incorrect!!");
		}
		else {																					

			dblUserTva = dblTva[(int)dblUserTva2-1];
			
			System.out.println("Inserez votre prix brut : ");
			dblUserPxBrut=sc.nextDouble();															//demande de prix brut
			dblPxNet=dblUserPxBrut+dblUserPxBrut/100*dblUserTva;									//calcul
			System.out.println("Pour un prix brut de "+dblUserPxBrut+ "€, le prix net est de "+dF.format(dblPxNet)+" € (TVA "+dblUserTva+" %). ");
		}
	
	sc.close();
	}																	//fin main

}																	//fin class
