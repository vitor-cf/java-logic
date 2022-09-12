package Beecrowd;

import java.util.Scanner;

public class a1010 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int codP1, codP2, nPeca1, nPeca2;
        float valor1, valor2, valorTotalP1, valorTotalP2, valorTotal;

        System.out.println("Informe o Código da peça 1, o número de peças 1 e ovalor unitário de cada peça 1, respectivamente: "); 
        codP1 = ent.nextInt();
        nPeca1 = ent.nextInt();
        valor1 = ent.nextFloat(); 

        valorTotalP1 = nPeca1 * valor1; 

        System.out.println("Informe o Código da peça 2, o número de peças 2 e ovalor unitário de cada peça 2, respectivamente: "); 
        codP2 = ent.nextInt();
        nPeca2 = ent.nextInt();
        valor2 = ent.nextFloat(); 

        valorTotalP2 = nPeca2 * valor2; 

        valorTotal = valorTotalP1 + valorTotalP2;

        System.out.printf("VALOR A PAGAR: " + valorTotal);
        
    }
}
