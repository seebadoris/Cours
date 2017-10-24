import java.util.Scanner;
import java.text.DecimalFormat;


public class Ex10Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	double[] dblTva={0,6.0,12.0,21.0};
//	int intUserTva;
	double dblUserTva2=0;
	
	Double dblUserTva;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Tva : ");
	dblUserTva2=sc.nextDouble();
	
	
//dblUserTva!=dblTva[dblUservTva2];
	if (dblUserTva2!= 1 &&dblUserTva2!= 2 &&dblUserTva2!=3) {
		System.out.println("fail");
	}
	else {
	dblUserTva = dblTva[(int) dblUserTva2];
	System.out.println(dblUserTva);
	
	}
	
	sc.close();
	}

}
