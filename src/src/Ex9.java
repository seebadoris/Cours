import java.util.Scanner;
public class Ex9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNumTable=0;
		
		System.out.println("Entrez le N° de table: ");
		
		Scanner sc=new Scanner(System.in);
		intNumTable=sc.nextInt();
		
		if (intNumTable <1){
			System.out.println("Saisie incorrecte ! Le N° de table doit être supérieur ou égale à 1");
		}
		else if (intNumTable>20) {
			System.out.println("Saisie incorrecte ! Le N° table plus élevé est 20. Contactez l’administrateur du programme si vous souhaitez augmenter ce nombre");
		}
		else {
			System.out.println("Vous avez entré le numéro de table "+intNumTable);
		}
		sc.close();
	}

}
