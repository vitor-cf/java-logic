/* 5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, 
em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. 
Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado. */ 

 import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float V = 3.14159f , R, A, volume;

        System.out.println("Informe o Raio: ");
        R = input.nextFloat();
        System.out.println("Informe a Altura ");
        A = input.nextFloat();

        volume = (V * R * R * A);

        System.out.println("Volume: " + volume);
        
    }
} 
