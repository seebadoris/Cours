import java.util.Scanner;
import java.text.DecimalFormat;


public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dblPxCom[]= {3.00,3.00,2.80,2.90};
		String strNomCom[]= {"Eau plate","Coca Cola","Bi�re pression","Caf� long"};
		int intNumCom;
		boolean blnHappyHour=false;
		double dblPxComF=0,dblPromo=0.5;
		String strNomComF="";
		char chrYes='n';
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat dF=new DecimalFormat("#.##");
		
		System.out.println("Entrez le num�ro de la commande :");
		
		intNumCom=sc.nextInt();
		
		switch (intNumCom){															//choix du num�ro qui va determiner le prix et la boisson command�e
			case 1:
				dblPxComF=dblPxCom[0];
				strNomComF=strNomCom[0];
				break;
			case 2:
				dblPxComF=dblPxCom[1];
				strNomComF=strNomCom[1];
				break;
			case 3:
				dblPxComF=dblPxCom[2];
				strNomComF=strNomCom[2];
				break;
			case 4:
				dblPxComF=dblPxCom[3];
				strNomComF=strNomCom[3];
				break;
		default:
			System.out.println("N� non r�f�renc�.");
		}																				//fin du switch
		
		System.out.println("HappyHour : Y/N?");
		chrYes=sc.next().charAt(0);

			if (chrYes=='y'||chrYes=='Y') {
				dblPxComF=dblPxComF*dblPromo;
				blnHappyHour=true;
			}
			else if (chrYes=='n'||chrYes=='N') {
				blnHappyHour=true;
			}
			else {
				System.out.println("Donn�e incorrect!");
			}
		
		
		
		
	/*	switch (chrYes) {
				case 'y':
					dblPxComF=dblPxComF*dblPromo;
					blnHappyHour=true;
					break;		
				case 'Y':
					dblPxComF=dblPxComF*dblPromo;
					blnHappyHour=true;
					break;	
				case 'n':
					blnHappyHour=true;
					break;
				case 'N':
					blnHappyHour=true;
					break;
					
			default:
				System.out.println("Donn�e incorrect!");
				
			}*/
			
			
			if (blnHappyHour) {
				System.out.println("Consommation : "+strNomComF+" : "+dF.format(dblPxComF)+" �.");				//affiche la consommation et le prix
			}
			sc.close();
	}

}
