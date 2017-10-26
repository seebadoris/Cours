import java.util.Scanner;

/**
 * PJ1Ex1-17
 * 
 *  Le programme permet � l�utilisateur d�encoder le nom de 5 consommations maximum  dans un tableau.
 *  
 *  Pour ce faire il r�pond � l�invitation � Entrez le nom du consommable, Q pour Quitter �. 
 *  
 *  Lorsque l�utilisateur a saisi 5 noms ou qu�il a d�cid� de quitter la saisie, le programme affiche 
 *  
 *  � Liste des consommations encod�es � suivi d�un r�capitulatif  indiquant ligne par ligne le nom des consommables qui viennent d��tre saisis (pas forc�ment 5).
 *  
 *   Si l�utilisateur n�a entr� aucune consommation (il a quitt� d�s la premi�re invitation de saisie), le programme affiche � Pas de consommations encod�es �. 
 *   
 *   *Utilisez une boucle r�p�ter�tant que pour la saisie et pour le r�capitulatif.
 *   **/



public class Ex17a {

	/**
	 * Demande de consommable ou Quitter
	 */
	public final static String  INV_CONSO_NAME = "Entrez le nom du consommable, Q pour Quitter."; 

	public final static String LIST_CONSO="Liste des consommations encod�es: ";

	public final static String PAS_CONSO="Pas de consommations encod�es.";
	
	public final static int CONSO_MAX= 5;
	
	public static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int intNum=0;
		String strConso[]=new String[intNum];
		int intConso=0;
		boolean blnNext=false;
		
		
		
		do {
			System.out.println(INV_CONSO_NAME);
			if(sc.hasNext()) {
				strConso[intNum]=sc.nextLine();
				System.out.println(strConso.length);
				
			}
			else if (sc.nextLine().equalsIgnoreCase("q")) {
				System.out.println("Fin du programme");
				System.exit(0);
			}
				
			
		}while (!blnNext);
		blnNext=false;
		
		
		
	}

}
/*
//DEBUT CREER TABLEAU PRIX
		public static double[] cr�erTabPrix(int nb) {	
		Scanner sc = new Scanner(System.in);
		double prix[]= new double[nb];
		for (int i=0;i<nb;i++) {
			System.out.println("Prix de l'article "+(i+1)+": ");
			prix [i] = sc.nextDouble();
		}
		return prix;	
		}
//FIN CREER TABLEAU PRIX
*/