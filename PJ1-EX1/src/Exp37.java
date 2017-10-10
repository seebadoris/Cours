


import java.text.DecimalFormat;

public class Exp37 {
	
public static void main(String[] args) {
	
float x1,x2,x3,x4,x5;

	DecimalFormat DfFormat1 = new DecimalFormat("0.0000");
	DecimalFormat DfFormat2 = new DecimalFormat("#.####");

	
	x1=52945000000000.0f;
	x2=3000000000.0f;
	x3=x1+x2;
	x4=15.0f/4.0f;
	x5=1.2f/7.0f;


	System.out.println("x3 sans format : " + x3);
	System.out.println("x3 Format 1 : " + DfFormat1.format(x3));
	System.out.println("x3 Format 2 : " + DfFormat2.format(x3));
	System.out.println("x4 sans format : " + x4);
	System.out.println("x4 Format 1 : " + DfFormat1.format(x4));
	System.out.println("x4 Format 2 : " + DfFormat2.format(x4));
	System.out.println("x5 sans format : " + x5);
	System.out.println("x5 Format 1 : " + DfFormat1.format(x5));
	System.out.println("x5 Format 2 : " + DfFormat2.format(x5));

	}

}


