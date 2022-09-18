package Beecrowd;

import java.util.Scanner;

public class A1040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float N1, N2, N3, N4;

        System.out.println("Digite as 4 notas:");
        N1 = input.nextFloat();
        N2 = input.nextFloat();
        N3 = input.nextFloat();
        N4 = input.nextFloat(); 

        float mediaPonderada = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10; 

        if (mediaPonderada >= 7.0) {
            System.out.println("Média: " + mediaPonderada);
            System.out.println("Aluno aprovado!");
        } else if (mediaPonderada >= 5.0 &&  mediaPonderada <= 6.9) {
            System.out.println("Média: " + mediaPonderada);
            System.out.println("Aluno em exame.");
            float notaExame;
            notaExame = input.nextFloat();
            float mediaFinal = (notaExame + mediaPonderada) / 2;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado");
                System.out.println("Media final: " + mediaFinal);
            } else {
                System.out.println("Aluno reprovado");
                System.out.println("Media final: " + mediaFinal);
            }
             
        } else {
            System.out.println("Média: " + mediaPonderada);
            System.out.println("Aluno reprovado");
        }
    }
}
            
            
