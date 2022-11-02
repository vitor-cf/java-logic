package workMetodos;

public class Sequencias {

	public static void main(String[] args) {
		imprimir(fibonacci(), pgSequencia());
		

	}
	
	public static int[] fibonacci() {
		int fi[] = new int[20];
		int valor1 = 0, valor2 = 1;
		
		for (int i = 0; i < fi.length; i++) {
			fi[i] = valor1 + valor2;
			valor2 = valor1;
			valor1 = fi[i];
		} 
		return fi;
	} 
	
	public static int progressaoGeometrica() {
		final int RAZAO = 2;
		int valorI = 3, pg = 0, cont = 0;
		
		while (valorI < 5000) {
			pg = valorI * RAZAO;
			valorI = pg;
			cont++;
		}
		
		return cont;
		
	} 
	
	public static int[] pgSequencia() {
		int[] pgList = new int[10];
		final int RAZAO = 2;
		int valorI = 3;
		
		for (int j = 0; j < pgList.length; j++) {
			pgList[j] = valorI * RAZAO;
			valorI = pgList[j];
			
		}
			
		
		return pgList;
	}
			
	
	public static void imprimir(int[] fi, int[] pgList) {
		System.out.println("Sequência Fibonacci");
		for (int i = 0; i < fi.length; i++) {
			System.out.println(fi[i] + " ");
			
		} 
		
		System.out.println("---------------------------------");
		System.out.println("Progressão Geométrica");
		for (int j = 0; j < pgList.length; j++) {
			System.out.println(pgList[j] + " ");
			
		}
			
	} 
	
	
}
