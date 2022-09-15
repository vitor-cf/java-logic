package Beecrowd;

import java.util.Scanner;

public class a1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Double N;

        System.out.println("Informe o valor:");
        N = sc.nextDouble();

        if(N >= 0 && N <= 1000000) {
            // Cedulas 

            Double notas100 = Math.floor(N / 100);
            Double atual = (Math.floor(notas100) * 100) - N;
            Double notas50 = Math.floor(N / 50);
            atual =  (Math.floor(notas50) * 50 ) - N;
            Double notas20 = N / 20;
            atual = (notas20 * 20) - N;
            Double notas10 = N / 10;
            atual = (notas10 * 10) - N;
            Double notas5 = N / 5;
            atual = (notas5 * 5) - N;
            Double notas2 = N / 2;
            atual = (notas2 * 2) - N;
            

            System.out.println("Notas:" + "\n" + notas100 + " nota (s) de R$ 100.00");
            System.out.println("\n"+"Notas:" + "\n" + notas50 + " nota (s) de R$ 50.00");
            System.out.println("\n"+"Notas:" + "\n" + notas20 + " nota (s) de R$ 100.00");
            System.out.println("\n"+"Notas:" + "\n" + notas10 + " nota (s) de R$ 10.00");
            System.out.println("\n"+"Notas:" + "\n" + notas5 + " nota (s) de R$ 5.00");
            System.out.println("\n"+"Notas:" + "\n" + notas2 + " nota (s) de R$ 2.00");

            // Moedas
        } else {
            System.out.println("Error");
        }
    }
}

