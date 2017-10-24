import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	DecimalFormat dF=new DecimalFormat("#.##");
	
	double[] dblTva={0,6.0,12.0,21.0};
	double dblUserTva2=0;
	Double dblUserTva,dblUserPxBrut,dblPxNet;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21 : ");			
	dblUserTva2=sc.nextDouble();															//demande de TVA
	
	
//dblUserTva!=dblTva[dblUservTva2];
	if (dblUserTva2!= 1 &&dblUserTva2!= 2 &&dblUserTva2!=3) {								//si l user encode une valeur autre que 1,2,3
		System.out.println("fail");
	}
	else {																					
	dblUserTva = dblTva[(int) dblUserTva2];
	System.out.println("Inserez votre prix brut : ");
	dblUserPxBrut=sc.nextDouble();
	dblPxNet=dblUserPxBrut+dblUserPxBrut/100*dblUserTva;
	System.out.println("Pour un prix brut de "+dblUserPxBrut+ "€, le prix net est de "+dF.format(dblPxNet)+" € (TVA "+dblUserTva+"%). ");
	}
	
	sc.close();
	}

}
