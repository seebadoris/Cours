import java.util.Scanner;


public class Ex9Boucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int intTblMax=20;
		int intUserTbl;
		
		Scanner sc=new Scanner(System.in);
		
		 do {
			 System.out.println(" Entrez le N� de table :");
			 intUserTbl=sc.nextInt();
			 
			 	if (intUserTbl<1) {
			 		System.out.println("Saisie incorrecte ! Le N� de table doit �tre sup�rieur ou �gale � 1");
			 	}
			 	else if (intUserTbl>intTblMax) {
			 		System.out.println("Saisie incorrecte ! Le N� table le plus �lev� est 20. Contactez l�administrateur du programme si vous souhaitez augmenter ce nombre");
			 	}
		
		 }while (intUserTbl<1 || intUserTbl>intTblMax) ;
		 
		 System.out.println("Vous avez entr� le num�ro de table "+intUserTbl+".");
		 
		 sc.close();
	}

}
