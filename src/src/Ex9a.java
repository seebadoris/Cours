import java.util.Scanner;
public class Ex9a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNumTable=0;
		final int intNUM_DERN_TABLE=23;		
		
		System.out.println("Entrez le N° de table: ");
		
		Scanner sc=new Scanner(System.in);
		intNumTable=sc.nextInt();
		
		if (intNumTable <1){
			System.out.println("Saisie incorrecte ! Le N° de table doit être supérieur ou égale à 1");
		}
		else if (intNumTable>intNUM_DERN_TABLE	) {
			System.out.println("Saisie incorrecte ! Le N° table plus élevé est " +intNUM_DERN_TABLE+".Contactez l’administrateur du programme si vous souhaitez augmenter ce nombre");
		}
		else {
			System.out.println("Vous avez entré le numéro de table "+intNumTable);
		}
		sc.close();
	}

}
