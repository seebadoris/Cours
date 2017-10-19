import java.util.Scanner;
public class Ex8b {										//double if probleme

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int intNumTable=0;
			final int intNUM_DERN_TABLE=23;						//pour faciliter l'update de nouvelle table + le declarer dans le pseudocode
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Entrez le N° de la table");
			
			intNumTable=sc.nextInt();
			
			if (intNumTable >=1 && intNumTable<= intNUM_DERN_TABLE){
				System.out.println("Vous avez entré le N° de table : "+intNumTable+'.');
				
			}
			if (intNumTable <=0 && intNumTable> intNUM_DERN_TABLE){
				System.out.println("N° de table incorrect!");
			}
	
			sc.close();
	}

}
