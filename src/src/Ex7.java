import java.text.DecimalFormat;
import java.util.Scanner;



public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dblUserPxBrut,dblUserTva,dblPxNet;
		
		DecimalFormat decFormat=new DecimalFormat("#.##");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Px Brut: ");
		dblUserPxBrut=sc.nextDouble();
		System.out.println("Tva: ");
		dblUserTva=sc.nextDouble();
		
		dblPxNet=dblUserPxBrut+dblUserPxBrut*(dblUserTva/100);
		System.out.println("Le montant Net est de :"+dblPxNet+"€.");
		System.out.println("On peut arrondir à :"+decFormat.format(dblPxNet)+"€.");
		
		sc.close();
		
		
		
		
	}

}
