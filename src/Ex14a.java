import java.util.Scanner;

public class Ex14a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intStockConso[][]= {{1,92},{2,16},{3,27},{4,72}};								//0,0 
		String strNomConso[]= {"Eau plate","Cocal Cola","Bi�re pression","Caf� Long"};
		int intUserNumConso,intTLI=-1,intTCS=-1,intStrTN=-1,intUserNbrCom;
		boolean blnNR=false,blnTab=false;
		char chrYes='n';
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez le N� d�identifiant : ");
		intUserNumConso=sc.nextInt();
		switch (intUserNumConso) {
		case 1:
			intTLI=0;
			intTCS=1;
			intStrTN=0;
			blnNR=true;
			break;
		case 2:
			intTLI=1;
			intTCS=1;
			intStrTN=1;
			blnNR=true;
			break;
		case 3:
			intTLI=2;
			intTCS=1;
			intStrTN=2;
			blnNR=true;
			break;
		case 4:
			intTLI=3;
			intTCS=1;
			intStrTN=3;
			blnNR=true;
			break;
			
		default:
			System.out.println("N� non r�f�renc�");
	}

		if (blnNR) {
			System.out.println("Entrez le nombre d�unit�s consomm�es pour "+strNomConso[intStrTN]+". Quantit� actuellement en stock "+intStockConso[intTLI][intTCS]+".");
			
			intUserNbrCom=sc.nextInt();
				if (intUserNbrCom>intStockConso[intTLI][intTCS]) {
					System.out.println("Erreur de saisie ou de quantit� en stock pour "+strNomConso[intStrTN]+"! Annuler ou Mettre � Zero le stock. A/Z ");
						chrYes=sc.next().charAt(0);
						if (chrYes=='a'|| chrYes=='A') {
							System.out.println("Modification annul�e.");
						}
						else if  (chrYes=='z'|| chrYes=='Z') {
							intStockConso[intTLI][intTCS]=0;
							System.out.println("Stock "+intStockConso[intTLI][intTCS]+" pour "+strNomConso[intStrTN]);
							blnTab=true;
						}
				}
				else if (intUserNbrCom<=intStockConso[intTLI][intTCS]) {
					intStockConso[intTLI][intTCS]=intStockConso[intTLI][intTCS]-intUserNbrCom;
					blnTab=true;
				}
			}
		if(blnTab) {
			//System.out.println(strNomConso[intStrTN]+" : "+intStockConso[intTLI][intTCS]+" en Stock.");
			System.out.println("################################");
			System.out.println(strNomConso[0]+" : "+intStockConso[0][1]+" en Stock.");
			System.out.println(strNomConso[1]+" : "+intStockConso[1][1]+" en Stock.");
			System.out.println(strNomConso[2]+" : "+intStockConso[2][1]+" en Stock.");
			System.out.println(strNomConso[3]+" : "+intStockConso[3][1]+" en Stock.");
			System.out.println("################################");
		}
		sc.close();
}
}