
import java.util.Scanner;
import java.text.DecimalFormat;

public class ExRecap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int intValBonAchat=2,intValTranche=20;

		int intUserNbre,intNbreBonAchatMax,intUserBonAchat,intBonAchatRendu ,intBonAchatF=0;
		
		double dblUserPxNet,dblRA=0.10 ,dblRB=0.20 ,dblRC=0.40 ,dblReduc=0,dblPxNetReduc=1,dblPxNetReducBon,dblTotalReduc;
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat dF=new DecimalFormat("#.##");
		
		System.out.println("Entrez le prix net à l'unité : ");
		dblUserPxNet=sc.nextDouble();
		
		System.out.println("Nombre d’unités pour cet article ?");
		intUserNbre=sc.nextInt();
		
			if (intUserNbre >= 10 && intUserNbre <20) {
				dblReduc=dblRA;
			}
			else if(intUserNbre >=20 && intUserNbre<30){
				dblReduc=dblRB;
			}
			else if (intUserNbre >=30){
				dblReduc=dblRC;
			}
		dblPxNetReduc=(dblUserPxNet*intUserNbre)-(dblUserPxNet*intUserNbre*dblReduc);
		intNbreBonAchatMax=(int)dblPxNetReduc/intValTranche;
		System.out.println("Prix total intermédiaire "+dblPxNetReduc+" nombre de bons d’achat maximum : "+intNbreBonAchatMax);
		
		System.out.println("Nombre de bons collectés ?");
		intUserBonAchat=sc.nextInt();
			if(intUserBonAchat>intNbreBonAchatMax){
				intBonAchatRendu=intUserBonAchat-intNbreBonAchatMax;
				System.out.println("Rendre "+intBonAchatRendu+" bons d'achat au client");
				intBonAchatF=intNbreBonAchatMax*intValBonAchat;
			}
			else if (intUserBonAchat>0 && intUserBonAchat<=intNbreBonAchatMax){
				intBonAchatF=intUserBonAchat;
			}
			else if (intUserBonAchat<=0){
				System.out.println("Pas de bon d'achat!");
				intBonAchatF=0;
			}
		
			dblPxNetReducBon=dblPxNetReduc-intBonAchatF;
			dblTotalReduc=dblPxNetReduc*intUserNbre-dblPxNetReducBon;
			
			System.out.println("Montant total à payer "+dF.format(dblPxNetReducBon)+" €, total réduction "+dblTotalReduc+" € ");

			
			sc.close();

	}

}