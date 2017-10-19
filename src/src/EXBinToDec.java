
/*public class EXBinToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iEx1,iEx2,iEx3,iEx4,iEx5,iEx6,iEx7;
		short sEx1,sEx2,sEx3,sEx4,sEx5,sEx6,sEx7;
		byte bEx1,bEx2,b2Ex3,bEx4,bEx5,bEx6,bEx7,bEx3;
		long lngEx6;
		
		iEx1=0b0111;//0b pour expliquer a la machine que l on ecrit du binraire
		sEx1=0b0111;
		bEx1=0b0111;
		
		iEx2=0b1010101;
		sEx2=0b1010101;
		bEx2=0b1010101;
		
		iEx3=0b10110011;
		sEx3=0b10110011;
		//bEx3=0b10110011;	//premier etant "1" nombre négatif (voir p26)
							//sachant que le biyte ici n'est pas signé on peut avoir un max de - 128 a 127 
							//ici 
		b2Ex3=(byte)0b10110011; //force a etre en byte -77 correspond a une perte en byte pas bon
		
		iEx4=0b00000000;
		sEx4=0b00000000;
		bEx4=0b00000000;
		
		iEx5=0b10111011100000;
		sEx5=0b10111011100000;
		bEx5=(byte) 0b10111011100000;

		lngEx6=0b1010101001010000;
		iEx6=0b1010101001010000;
		sEx6=(short) 0b1010101001010000;
		bEx6=(byte) 0b1010101001010000;

		iEx7=0b11111111;
		sEx7=0b11111111;
		bEx7=(byte) 0b11111111;
		
		System.out.println("int = Ex1 "+iEx1+", Ex2 "+iEx2+", Ex3 "+iEx3+", Ex4 "+iEx4+", Ex5 "+iEx5+", Ex6 "+iEx6+", Ex7 "+iEx7);
		System.out.println("short = Ex1 "+sEx1+", Ex2 "+sEx2+", Ex3 "+sEx3+", Ex4 "+sEx4+", Ex5 "+sEx5+", Ex6 "+sEx6+", Ex7 "+sEx7);
		System.out.println("byte = Ex1 "+bEx1+", Ex2 "+bEx2+", Ex3 "+b2Ex3+", Ex4 "+bEx4+", Ex5 "+bEx5+", Ex6 "+bEx6+", Ex7 "+bEx7);
	}

}
*/