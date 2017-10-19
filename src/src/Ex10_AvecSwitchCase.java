import java.util.Scanner;

public class Ex10_AvecSwitchCase {
public static void main(String[] args) {
	
	
	final double dblPCT_TVA1 = 6.0, dblPCT_TVA2 = 12.0, dblPCT_TVA3=21.0;
	double dblPctTVA=0.0, dblPrixNet, dblPrixBrut;
	int intChoixTVA;
	boolean bFlagSaisieOK = false;

	
	Scanner SaisieUtilisateur = new Scanner(System.in);

	System.out.println("Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21%\".");
	intChoixTVA = SaisieUtilisateur.nextInt();
		
	switch (intChoixTVA)									//entre case1, case 2, case 3
	{
		case 1 :											//est egual a 1 alors
		dblPctTVA =dblPCT_TVA1 ;
		bFlagSaisieOK = true;								//bFlagSaisieOk pr ne pas a avoir a repeter l operation
		break;												//correspond a l intTVA=intUserTVA1;intTVA=intUserTVA2;intTVA=intUserTVA3;
															//dans l  Ex10opti
		case 2 :
		dblPctTVA =dblPCT_TVA2 ;
		bFlagSaisieOK = true;
		break;
		
		case 3 :						
		dblPctTVA =dblPCT_TVA3 ;
		bFlagSaisieOK = true;
		break;												//met fin au case
		
	default :												//si autre que ce qu il y a dans le switch
		System.out.println("Saisie du taux incorrecte");
	}
	
	if (bFlagSaisieOK) {
		System.out.println("Entrez le prix brut");
		dblPrixBrut= SaisieUtilisateur.nextDouble();
		dblPrixNet = dblPrixBrut + dblPrixBrut * (dblPctTVA/100);
		System.out.println("Pour un prix brut de " + dblPrixBrut + "€ le prix net est de " + dblPrixNet + "€ (TVA " + dblPctTVA +"%)" );
	}//fin si
		
	SaisieUtilisateur.close();
	}//fin main
}//fin classe