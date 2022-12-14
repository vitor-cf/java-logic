package quebec.dio;

public class Main {
	public static void main(String[] args) {
		// calculadora 
		System.out.println("Exercício calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5); 
		
		
		
		// Mensagem
		System.out.println("Exercício mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1); 
		
		// Quadrilatero 
		System.out.println("Exercício quadrilatero");
		Quadrilatero.area(3);
		Quadrilatero.area(5d,5d );
		Quadrilatero.area(7, 8, 9);
		Quadrilatero.area(5f, 5f); 
		
		// Quadrilatero usando return
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println(areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5,5);
		System.out.println(areaRetangulo);
		
	}
}
