
public class ExP36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x1,x2,x3;			//le format par default est double donc pas besoin de lettre a la fin
		x1=3331720;					//
		x2=0.625;
		x3=x1+x2;
		
		System.out.println(x3);		//Valeur exacte
									//
									//
									
		
		x1=123456789;
		x3=5+x1;					//			
		x3=x3-x1;					//Valeur exacte
									//
									//
		
		System.out.println(x3);
		
		x1=853000000;
		x2=  7400000;
		x3=x1+x2;					//Valeur exacte
									//
				
		System.out.println(x3);
		
		x1=0.00000000000853;		//
		x2=0.000000000000074;		//Valeur exacte
									//
		x3=x1+x2;
		
		System.out.println(x3);
		
		x1=0.00000000000853;
		x2=0.000000000000074;
		x3=10.f+x1+x2;				//Tres tres legere imprecision le dernier chiffre devrait etre un 4
									//17 chiffres significatif (un double garde jusqu a 15chiffre significatif)
							
		System.out.println(x3);
									
									//
									//

	}

}
