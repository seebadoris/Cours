import java.util.Scanner;


public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNomConso;
		int[] intNbrConso=new int [5];
		int intConsoMax=-1;
		Boolean blnQuitter=false;
		
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println(" Entrez le nom du consommable, Q pour Quitter");
			strNomConso=sc.next();
			if (strNomConso=="Q") {
				blnQuitter=true;
			}
			
			
		}while (intNbrConso[intConsoMax]!=5|| blnQuitter==false);
	
	
	}
	

}
