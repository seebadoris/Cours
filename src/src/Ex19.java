import java.util.Scanner;

/**
 * 
 * @author Julien Henry
 *
 */

public class Ex19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String strStock = "Entrez le stock initial : ",
		strConso = "Entrez le nombre d’unités consommées :",
		strNbStock = "Nombre d’unités en stock ",
		strNul = "Stock nul",
		strErreur = "saisie incorrecte";
		
		final int intStockF = 0;
		int intStockI,
		intConso;
			
		System.out.println(strStock);
		intStockI = sc.nextInt();
		
		
		while (intStockI != intStockF && intStockI > intStockF){
			
			System.out.println(strConso);
			
			intConso=sc.nextInt();
			if (intConso > intStockI || intConso < 0){
				System.out.println(strErreur);
			}
			else {
				intStockI=intStockI-intConso;
			
				System.out.println(strNbStock+intStockI);
			}
			
		}

		
		System.out.println(strNul);
		
		
	}

}
