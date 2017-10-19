
public class ExP43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short shMaVariableShort; 
		int intMaVariableInt; 
		double dblMaVariableDouble; 
		 

		intMaVariableInt = 156000;		//en binaire 100110000101100000 sachant que le int peut avoir 32bits
		dblMaVariableDouble=3.5; 	//il s arrete avant la virgule, pas d arrondi.
		
		shMaVariableShort = (short)intMaVariableInt;	//Le short ne peut contenir que 16bits donc de l'int precedent (100110000101100000)
														//on ne peut prendre que les 16premieres bits (0110000101100000)
		
		intMaVariableInt = (int)dblMaVariableDouble; 	//La variable int ne prend que des donnée entiere pas de decimal d'ou le 3
		 
		System.out.println(shMaVariableShort); 
		System.out.println(intMaVariableInt); 

	}

}
