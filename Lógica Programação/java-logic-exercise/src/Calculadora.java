import java.util.Scanner; // Importando a função para poder fazer entrada de dados (Scanner).

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criando uma variável para fazer a entrada de dados. Neste caso (sc).
        double valor1, valor2; // Informando o nome e o tipo das variáveis, no caso tipo Double.

        System.out.println("Informe o valor 1: "); // Primeiro print ao aparecer no terminal 
        valor1 = sc.nextDouble(); // Atribuindo valor a variável (valor1), através da variável do Scanner (sc).
        if(valor1 >= 0 && valor1 <= 10) { // Primeira condição para verificar se o valor 1 está entre 0 e 10.
            System.out.println("Informe o valor 2:"); // Caso seja verdadeiro, Aparece na tela o próximo print.
            valor2 = sc.nextDouble(); // Caso seja verdadeiro, Aparece local para entrada de dados no terminal.
            if(valor2 >= 0 && valor2 <=10) { // Após verificar o valor 1, essa condição verifica o valor 2, que já foi atribuido acima.
                double operacao, resultado; // Caso seja verdade, declaramos duas variáveis do tipo Double (operacao e resultado).
                System.out.println("Selecione a operação: " + "\n (1) Soma " + "\n (2) Subtração" + "\n (3) Divisão" + "\n (4) Multiplicação"); // Em seguida mostra no terminal as operações
                operacao = sc.nextDouble(); // O valor da operação passado pelo usuário.
                if(operacao == 1) { // verificando o valor da operação, caso operacao == 1, executa as instruções abaixo
                    resultado = valor1 + valor2;
                    System.out.println("Soma: " + valor1 + " + " + valor2 + " = " + resultado);
                } else if (operacao == 2 ) { // Caso operacao seja 2, ignora a condição anterior e executa esta instrução.
                    resultado = valor1 - valor2;
                    System.out.println("Subtração: " + valor1 + " - " + valor2 + " = " + resultado);
                } else if (operacao == 3)  { // Caso operacao  seja 3, ignora a condição anterior e executa esta instrução.
                    resultado = valor1 / valor2;
                    System.out.println("Divisão: " + valor1 + " / " + valor2 + " = " + resultado);
                } else if (operacao == 4)  { // Caso operacao  seja 4, ignora a condição anterior e executa esta instrução.
                    resultado = valor1 * valor2;
                    System.out.println("Multiplicação: " + valor1 + " + " + valor2 + " = " + resultado);
                } else { // Caso não satisfaça nenhuma das condições anteriores aparece uma mensagem, dizendo que não possui operação.
                    System.out.println("Número da operação inválido");
                }
            } else {
                System.out.println("VALOR 2 INVÁLIDO"); // Caso a condição do valor 2 seja menor que 0 e maior que 10, Aparece esta mensagem
            }
        } else {
            System.out.println(" VALOR 1 INVÁLIDO "); // Caso a condição do valor 1 seja menor que 0 e maior que 10, Aparece esta mensagem
        } 
        
    }
}
