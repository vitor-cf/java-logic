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
            System.out.println("NOTAS:");

            Double atual = 0.0; 

            Double notas100 = Math.floor(N / 100);
            atual = N - (notas100 * 100);
            
            Double notas50 = Math.floor(atual / 50);
            atual -= notas50 * 50; 
            
            Double notas20 = Math.floor(atual / 20);
            atual -= notas20 * 20; 

            Double notas10 = Math.floor(atual / 10);
            atual -= notas10 * 10; 

            Double notas5 = Math.floor(atual / 5);
            atual -= notas5 * 5; 

            Double notas2 = Math.floor(atual / 2);
            atual -= notas2 * 2;
            

            System.out.println("Notas:" + "\n" + notas100 + " nota (s) de R$ 100.00");
            System.out.println("\n"+"Notas:" + "\n" + notas50 + " nota (s) de R$ 50.00");
            System.out.println("\n"+"Notas:" + "\n" + notas20 + " nota (s) de R$ 100.00");
            System.out.println("\n"+"Notas:" + "\n" + notas10 + " nota (s) de R$ 10.00");
            System.out.println("\n"+"Notas:" + "\n" + notas5 + " nota (s) de R$ 5.00");
            System.out.println("\n"+"Notas:" + "\n" + notas2 + " nota (s) de R$ 2.00");

            // Moedas 

            System.out.println("MOEDAS:");

            Double moeda1 = Math.floor(atual / 1);
            atual -= moeda1 * 1; 

            Double moeda050 = Math.floor(atual / 0.50);
            atual -= moeda050 * 0.50; 

            Double moeda025 = Math.floor(atual / 0.25);
            atual -= moeda025 * 0.25; 

            Double moeda010 = Math.floor(atual / 0.10);
            atual -= moeda010 * 0.10; 

            Double moeda005 = Math.floor(atual / 0.05);
            atual -= moeda005 * 0.05; 

            Double moeda001 = Math.floor(atual / 0.01);
            atual -= moeda001 * 0.01; 

            System.out.println("Moedas:" + "\n" + moeda1 + " moeda (s) de R$ 1.00");
            System.out.println("\n"+"Moedas:" + "\n" + moeda050 + " moeda (s) de R$ 0.50");
            System.out.println("\n"+"Moedas:" + "\n" + moeda025 + " moeda (s) de R$ 0.25");
            System.out.println("\n"+"Moedas:" + "\n" + moeda010 + " moeda (s) de R$ 0.10");
            System.out.println("\n"+"Moedas:" + "\n" + moeda005 + " moeda (s) de R$ 0.05");
            System.out.println("\n"+"Moedas:" + "\n" + moeda001 + " moeda (s) de R$ 0.01");

        } else {
            System.out.println("Error");
        }
    }
}

