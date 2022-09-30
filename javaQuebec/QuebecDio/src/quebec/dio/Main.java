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
	}
}
