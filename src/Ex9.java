import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNumTable=0;
		
		System.out.println("Inserez le N� de table de la commande : ");
		
		Scanner sc=new Scanner(System.in);
		
		intNumTable=sc.nextInt();
		
		if (intNumTable <1) {
			System.out.println("Saisie incorrect!!");
		}
		else 			if(intNumTable >20) {
			System.out.println("Saisie incorrecte ! Le N� table plus �lev� est 20. \nContactez l�administrateur du programme si vous souhaitez augmenter ce nombre .");
		}
			
		else {
			System.out.println("Vous avez entr� le num�ro de table "+intNumTable+" .");
		}
		sc.close();
	}

}
