
public class ExP35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x1,x2,x3;
		x1=3331720f;				//oblige de mettre un f pour definir sinon  il le considere comme un double
		x2=0.625f;
		x3=x1+x2;
		
		System.out.println(x3);		//Valeur normale attendue 3331720.625
									//Si on developpe en binaire, on remarque que cela prend plus que 23bits
									//donc il s arrete a la 23ieme bits, donc imprecis de 0.125
									
		
		x1=123456789f;
		x3=5+x1;					//normalement on doit avoir ici 123456794.0				
		x3=x3-x1;					//le logiciel fait : 123456794 - 123456789.0 = 5.0
									//valeur franchement erronée
									//on dépasse les 23 bits significatif
		
		System.out.println(x3);
		
		x1=853000000f;
		x2=  7400000f;
		x3=x1+x2;					//valeur normal attendue 860400000
									//ok
				
		System.out.println(x3);
		
		x1=0.00000000000853f;		//très légère imprecision valeur normale attendue 8.604*10E-12
		x2=0.000000000000074f;		//les flottants vont pr 6 chiffres significatif 
									//exemple : 3456781978+0.3 n ira pas car il demande 11 chiffres significatif
		x3=x1+x2;
		
		System.out.println(x3);
		
		x1=0.00000000000853f;
		x2=0.000000000000074f;
		x3=10.f+x1+x2;				//10.000000000.... plus de +6 chiffres significatif donc il ne tient pas compte
									//de x1 + x2
							
		System.out.println(x3);
									
									//solution soit faire des paquet de chiffre
									//ou alors prend autre chose
		
	}

}
