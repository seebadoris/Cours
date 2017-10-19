import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intUserTVA1=6,intUserTVA2=12,intUserTVA3=21,intUserTVA;
		double dblUserPxBrut=0,dblPxNet;
		
		Scanner sc=new Scanner(System.in);
		
		DecimalFormat dF=new DecimalFormat("#.##");
		
		System.out.println("Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21");
		intUserTVA=sc.nextInt();
		
		if (intUserTVA ==1) {
			System.out.println("Inserez votre prix brut : ");
			
			dblUserPxBrut=sc.nextDouble();
			
			dblPxNet=dblUserPxBrut+dblUserPxBrut*intUserTVA1/100;
			System.out.println("Pour un prix brut de "+dblUserPxBrut+ "€, le prix net est de "+dF.format(dblPxNet)+" € (TVA "+intUserTVA1+"%). ");
		}
		else if (intUserTVA ==2) {
			System.out.println("Inserez votre prix brut : ");
			
			dblUserPxBrut=sc.nextDouble();
			
			dblPxNet=dblUserPxBrut+dblUserPxBrut*intUserTVA2/100;
			System.out.println("Pour un prix brut de "+dblUserPxBrut+ "€, le prix net est de "+dF.format(dblPxNet)+" € (TVA "+intUserTVA2+"%). ");
		}
		else if (intUserTVA ==3) {
			System.out.println("Inserez votre prix brut : ");
			
			dblUserPxBrut=sc.nextDouble();
			
			dblPxNet=dblUserPxBrut+dblUserPxBrut*intUserTVA3/100;
			System.out.println("Pour un prix brut de "+dblUserPxBrut+ "€, le prix net est de "+dF.format(dblPxNet)+" € (TVA "+intUserTVA3+"%). ");
		}
		else {
			System.out.println("Saisie du taux incorrecte ");
		}
		
		
		
		sc.close();
		
	}

}