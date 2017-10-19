
public class ExP31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char chCharTest='a';
		char chCharTest1=90;
		char chCharTest2=50;
		char chPremierCharTest=50;		//caractere 50 en ASCII
		char chDeuxiemeCharTest=54;
		int intTroisiemeCharTest;
		
		System.out.println(chCharTest +"h d'accord");
		
		System.out.println("Le charactère "+chCharTest1+" a pour point de code "+ (int)chCharTest1);
		
		System.out.println("Le caractère "+chCharTest2+" a pour point de code "+(int)chCharTest2);
	
		intTroisiemeCharTest=(int)chPremierCharTest + (int)chDeuxiemeCharTest;
		
		System.out.println(chPremierCharTest + " + "+chDeuxiemeCharTest + " = " +(char)intTroisiemeCharTest);
	}

}
