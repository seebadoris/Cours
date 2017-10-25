import java.util.Scanner;


public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intStock=100;
		int intUserConso=-1;
		
		Scanner sc=new Scanner(System.in);
		
		
		do {
			do {
				System.out.println(" Entrez le nombre d’unités consommées :");
				intUserConso=sc.nextInt();
				if (intUserConso>intStock || intUserConso<0) {
					System.out.println("Saisie Incorrect!");
				}
				}while(intUserConso>intStock ||intUserConso<0);
			
			intStock=intStock-intUserConso;
			System.out.println("Nombre d’unités en stock : "+intStock+".");
		}while (intStock!=0 );
		System.out.println("Stock à 0 ");
		
		
		sc.close();
	}

}
