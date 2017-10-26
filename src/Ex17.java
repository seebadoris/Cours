import java.util.Scanner;


public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String strNomConso;
		String strNomConso[]=new String [5] ;
	//	int[] intNbrConso=new int [10];
		int intConsoMax=4;
	//	Boolean blnQuitter=false

		int intNum=0;																// a chaque fois faire plus 1 jusqu a 5
		
		Scanner sc=new Scanner(System.in);
		
			do {
				System.out.println("Entrez le nom du consommable, Q pour Quitter");
				strNomConso[intNum]=sc.nextLine();
				intNum=intNum+1;
			//}while(intQ==1||(intNbrConso[intConsoMax]>0&&intNbrConso[intConsoMax]<=5));
			//}while(!strNomConso.equalsIgnoreCase("q")||(intNbrConso[intConsoMax]>0&&intNbrConso[intConsoMax]<=5));
		}while(!strNomConso[intNum].equalsIgnoreCase("q")||(intNum>0&&intNum!=intConsoMax));
		//	}while (!strNomConso.equalsIgnoreCase("q"));	
			//}while (blnQuitter==false);
			
		
		
	System.out.println("Liste des consommations encodées ");
	System.out.println("####################################");
	System.out.println(strNomConso);
	
	sc.close();
	}
	

}
