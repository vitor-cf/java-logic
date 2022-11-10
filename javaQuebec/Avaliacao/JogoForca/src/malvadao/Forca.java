package malvadao;

import java.util.Scanner; 

public class Forca {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qL=6;
		String l;
		String[] palavras = {"BRUTO", "MALVADO"};	 
		char[] letras = new char[10]; // letras da palavra 
		char[] letraDigitada = new char[20]; // letras digitadas 
		
		letras = palavras[1].toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.print("_ ");
		} 
		for (int i = 0; i < letras.length; i++) {
			if(qL <= 6) {
				System.out.println("\n Digite uma letra:");
				l = sc.next(); 
				l = l.toUpperCase(); // Converte para maiúsculo
				letraDigitada[i] = l.charAt(0); 
				if (letraDigitada[i] == letras[i]) {
					System.out.println("deu certo!");
					
				}
				
			}
		}
		
		
	}
	
}
		
		






//String[] partesForca = {"           O", "         --", "|", "--", "          /", " \\"};


//System.out.println("JOGO DA FORCA");
//System.out.println();
//System.out.println("------------|" + "\n|" + partesForca[0] + "\n|" + partesForca[1] + partesForca[2] + partesForca[3] + " \n|" +partesForca[4] + partesForca[5] + "\n|" + "\n|" + "\n|");
//System.out.println();
//System.out.println(partesForca[0] + "\n" + partesForca[1] + partesForca[2] + partesForca[3] + " \n" +partesForca[4] + partesForca[5]);