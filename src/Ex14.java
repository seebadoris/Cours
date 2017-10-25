import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intStockConso[][]= {{1,92},{2,16},{3,27},{4,72}};
		String strNomConso[]= {"Eau plate","Cocal Cola","Bière pression","Café Long"};
		int intUserNumConso,intStock=-1,intUserNbrCom,intStockF=-1,intL=-1,intT=-1;
		String strNomF="";
		boolean blnNR=false,blnTab=false;
		char chrYes='n';
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Entrez le N° d’identifiant : ");
		intUserNumConso=sc.nextInt();
			switch (intUserNumConso) {
			case 1:
				intL=0;
				intT=1;
				intUserNumConso=intStockConso[0][0];
				strNomF=strNomConso[0];
				intStock=intStockConso[0][1];
				blnNR=true;
				break;
			case 2:
				intL=1;
				intT=1;
				intUserNumConso=intStockConso[1][0];
				strNomF=strNomConso[1];
				intStock=intStockConso[1][1];
				blnNR=true;
				break;
			case 3:
				intL=2;
				intT=1;
				intUserNumConso=intStockConso[2][0];
				strNomF=strNomConso[2];
				intStock=intStockConso[2][1];
				blnNR=true;
				break;
			case 4:	
				intL=3;
				intT=1;
				intUserNumConso=intStockConso[3][0];
				strNomF=strNomConso[3];
				intStock=intStockConso[3][1];
				blnNR=true;
				break;

				 
				 
			default:
				System.out.println("N° non référencé");
			}
		if (blnNR) {
		System.out.println("Entrez le nombre d’unités consommées pour "+strNomF+". Quantité actuellement en stock "+intStock+".");
		
		intUserNbrCom=sc.nextInt();
			if (intUserNbrCom>intStock) {
				System.out.println("Erreur de saisie ou de quantité en stock pour "+strNomF+"! Annuler ou Mettre à Zero le stock. A/Z ");
					chrYes=sc.next().charAt(0);
					if (chrYes=='a'|| chrYes=='A') {
						System.out.println("Modification annulée.");
					}
					else if  (chrYes=='z'|| chrYes=='Z') {
						intStockF=0;
						System.out.println("Stock "+intStockF+" pour "+strNomF);
						blnTab=true;
					}
			}
			else if (intUserNbrCom<=intStock) {
				intStockF=intStock-intUserNbrCom;
				blnTab=true;
			}
		
			if(blnTab) {
				intStockConso[intL][intT]=intStockF;
				System.out.println(strNomF+" : "+intStockConso[intL][intT]+" en Stock.");
				System.out.println("################");
				System.out.println(strNomConso[0]+" : "+intStockConso[0][1]+" en Stock.");
				System.out.println(strNomConso[1]+" : "+intStockConso[1][1]+" en Stock.");
				System.out.println(strNomConso[2]+" : "+intStockConso[2][1]+" en Stock.");
				System.out.println(strNomConso[3]+" : "+intStockConso[3][1]+" en Stock.");
			}												//fin si blnTab
		}													//si blnNR
		
		
		
		
		sc.close();
	}

}
