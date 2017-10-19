
public class ExP46 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strNom="Le Passe Temps";
		
		System.out.println("Lenght : "+strNom.length());
		
		System.out.println("CompareTo 'Le Passe Temps' : "+strNom.compareTo("Le Passe Temps"));
		
		System.out.println("CompareTo 'Le Passe Temps' :"+strNom.compareTo("Le Passe Temps "));
		
		System.out.println("CompareTo 'le passe temps': "+strNom.compareTo("le passe temps"));
		
		System.out.println("CompareToIgnoreCase 'le passe temps': "+strNom.compareToIgnoreCase("le passe temps"));
		
		strNom="	Le	Passe	Temps";
		System.out.println(strNom);
		
		System.out.println(strNom.trim());
		
		System.out.println(strNom);
		
		strNom=strNom.trim();
		System.out.println(strNom);
		
		strNom="Le passe temps";
		System.out.println(strNom.substring(10,12));
		
		System.out.println(strNom.charAt(3));
		
		System.out.println(strNom.concat("\nBienvenu"));
		
		System.out.println("Contenu de la variable :" +strNom);
		
		strNom=strNom+"\nBienvenu";
		System.out.println("Contenu de la variable : "+strNom);
		
		strNom="Le Passe Temps";
		System.out.println("endWith: "+strNom.endsWith("Temps"));
		System.out.println("endWith: "+strNom.endsWith("mps"));

		System.out.println("replace: "+strNom.replace('T', 'P'));
		//System.out.println("replace: " + strNom.replace("Temps","dada");
		
		//Ne fonctionne pas
		
		String replaceStrNom = strNom.replace("Temps","partout");
		System.out.println("replace fonctionnel :"+ replaceStrNom);
		
		System.out.println("Replace ALL"+strNom.replaceAll("e","eee"));
		
		System.out.println("to lower case : "+strNom.toLowerCase());
		
		System.out.println("to upper case : "+strNom.toUpperCase());
		
		System.out.println("Index of : "+strNom.indexOf("s",0));
		
		System.out.println("Index of : "+strNom.indexOf("s",2));
		
		System.out.println("Index of : "+strNom.indexOf("s",7));
		
		System.out.println("Index of : "+strNom.indexOf("x",0));
		
		System.out.println("Last Index of e :"+strNom.lastIndexOf("e",10));
		
		System.out.println("Last Index of e :"+strNom.lastIndexOf("e",9));
		
		System.out.println("Last Index of e :"+strNom.lastIndexOf("e",0));
		
		System.out.println("Last Index of e :"+strNom.lastIndexOf("e"));
		
		String strNom1="Le Passe Temps";
		
		System.out.println("lenght : " + strNom1.length());
		
		System.out.println("compareTo 'Le Passe Temps' : "+strNom1.compareTo("Le Passe Temps"));
		
		System.out.println("compareTo 'le passe temps' : "+strNom1.compareTo("le passe temps"));
		
		System.out.println("compareToIgnoreCase 'le passe temps' : "+strNom1.compareToIgnoreCase("le passe temps"));
		
		
		strNom1="	Le	Passe	Temps";
		
		System.out.println(strNom1);
		
		System.out.println(strNom1.trim());
		
		System.out.println(strNom1);
		
		strNom1=strNom1.trim();
		
		System.out.println(strNom);
		
		strNom="Le Passe Temps";
		System.out.println(strNom.substring(10,12));
		
		System.out.println(strNom.charAt(3));
		
		System.out.println(strNom.concat("\nBienvenu"));
		
		System.out.println("contenu de la variable : "+strNom);
		
		
		
		
		
		
		
		
	}

}
