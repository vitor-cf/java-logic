/* 1 - Escreva um programa que, com base em uma 
temperatura em graus celsius, a converta e 
exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
 Ra = C * 1.8 + 32 + 459.67 */

/* public class App {
    public static void main(String[] args) throws Exception {
        float C = 2.43f;

        float F = C * 1.8f + 32;
        float K = C + 273.15f;
        float Re = C * 0.8f;
        float Ra = C * 1.8f + 32 + 459.67f;

        System.out.println("Temperatura F: " + F );
        System.out.println("Temperatura K: " + K );
        System.out.println("Temperatura Re: " + Re );
        System.out.println("Temperatura Ra: " + Ra );


    }
} */ 


/* 2. Tem-se um conjunto de dados contendo a 
altura e o sexo (masculino, feminino) de 10 pessoas. 
Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("Escolhe o sexo (1 - Mulher, 2 - Homem):" );
            sexo = entrada.nextInt();
            System.out.println("Digite a altura: ");
            altura = entrada.nextFloat();
            if(sexo == 1) {
                qtMulheres++; 
                System.out.println("Mulher nº:" + qtMulheres);
            } else if (sexo == 2) {
                qtHomens++;
                System.out.println("Homem nº: " + qtHomens);
            }

            
        }
    }
}