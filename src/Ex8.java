import java.util.Scanner;



public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNumTable;
		
		System.out.println("Entrez le N° de la table : ");
		
		Scanner sc=new Scanner(System.in);
		
		intNumTable=sc.nextInt();
		
		if (intNumTable<1||intNumTable>20) {
			System.out.print("N° de table incorrect");
		}
		else {
			System.out.println("Vous avez entré le N° de table "+intNumTable+'.');
		}
		
		
		sc.close();
		
	}

}
