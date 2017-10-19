	
	public class ExP46 { 
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String strNom="Le Passe Temps";
			
			System.out.println("Lenght : "+strNom.length());				//le nombre de caracter y compris les espaces
			
			System.out.println("CompareTo 'Le Passe Temps' : "+strNom.compareTo("Le Passe Temps"));		//compare la variable strNom avec ce qu il y a entre ""
																										//renvoie 0 si meme chose
			System.out.println("CompareTo 'Le Passe Temps' :"+strNom.compareTo("Le Passe Temps "));		// un espace en plus donc -1
			
			System.out.println("CompareTo 'le passe temps': "+strNom.compareTo("le passe temps"));
			
			System.out.println("CompareToIgnoreCase 'le passe temps': "+strNom.compareToIgnoreCase("le passe temps"));		//IgnoreCase ne considere plus les majuscule et miniscule
			
			strNom="	Le	Passe	Temps    ";
			System.out.println("a"+strNom);
			
			System.out.println("b"+strNom.trim());			//supprime les espaces avant et apres le texte
			
			System.out.println("c"+strNom);
			
			strNom=strNom.trim();
			System.out.println("d"+strNom);					//contenu memoire modifie
			
			strNom="Le passe temps";
			System.out.println(strNom.substring(10,12));			//On prend le caracte 10 jusqu au 12 non inclus sachant que l on commence a compter a ZERO
																	//Ici le caractere ZERO est le 'L'
			
			System.out.println(strNom.charAt(3));				//Prend le 3ieme caractere en commencant par ZERO
																//zero=L;un=e;deux=index(espace);trois=p
			
			System.out.println(strNom.concat("\nBienvenu"));		//ajouter une ligne a celle deja contenue en memoire sans la modifier
			
			System.out.println("Contenu de la variable :" +strNom);	
			
			strNom=strNom+"\nBienvenu";			//ici on modifie la memoire
			System.out.println("Contenu de la variable : "+strNom);		//\n retour a la ligne
			
			strNom="Le Passe Temps";
			System.out.println("endWith: "+strNom.endsWith("Temps"));		//verifie si les characteres finisse par Temps en considerant la majuscule
			System.out.println("endWith: "+strNom.endsWith("mps"));
			System.out.println("endWith: "+strNom.endsWith("mas"));			//faut
			
				//pr le prochain avec remplacement de temps exercice cours correct mais le programme ecole a besoin d update
			
			System.out.println("replace: "+strNom.replace('T', 'P'));		//remplace le T(majuscule) par P
			System.out.println("replace: "+strNom.replace('T', 'u'));		//ici une seul caractere donc ''
			
			System.out.println("replace All: " + strNom.replaceAll("e", "EEE"));	//ici "" car on peut utiliser la chaine de charactere
			
			System.out.println("to lower case: " + strNom.toLowerCase());		//tout en miniscule
			System.out.println("to upper case: " + strNom.toUpperCase());		//tout en majuscule
			
			System.out.println("Index of1: " + strNom.indexOf("s", 0));			//Cherche l index du "s" a partir du 0ieme caractere (index7)
			System.out.println("Index of2: " + strNom.indexOf("s", 2));			
																				//on commence encore a ZERO
			
			System.out.println("Index of22: " + strNom.indexOf("s", 6));		
			
			System.out.println("Index of3: " + strNom.indexOf("s", 7));			//Cherche l index du "s" a partir du 8ieme caractere (index7)
			System.out.println("Index of4: " + strNom.indexOf("x", 0));
			
			System.out.println("Last Index of e 5: " + strNom.lastIndexOf("e",10));		//cherche la derniere occurence du "e" en regardant a gauche du 11ieme caractere
			System.out.println("Last Index of e 6: " + strNom.lastIndexOf("e",9));		
			
			System.out.println("Last Index of e 7: " + strNom.lastIndexOf("e",0));		//cherche a gauche du premier caractere 
			System.out.println("Last Index of e 8: " + strNom.lastIndexOf("e"));		//Cherche  le dernier "e"
			
			strNom=Integer.toString(38);								//méthode de conversion d un entier vers une chaine de caracteres.
			System.out.println("string ou entier??"+strNom);			//C est bien une chaine de caracteres.
		}																
	
	}
