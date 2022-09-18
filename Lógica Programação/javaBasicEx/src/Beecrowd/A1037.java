package Beecrowd;

import java.util.Scanner;

public class A1037 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double valor; 
        System.out.println("Digite um valor:");
        valor = entrada.nextDouble();

        if(valor >= 0 && valor <= 25) {
            System.out.println("Intervalor [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalor (25,50]");

        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalor (50,50)");

        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalor (75,100)");

        } else {
            System.out.println("Fora do intervalo");
        }
        
    }
}

        
