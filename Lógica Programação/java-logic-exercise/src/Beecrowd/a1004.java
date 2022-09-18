package Beecrowd;

import java.util.Scanner;

public class a1004 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int valor1, valor2, PROD;

        System.out.println("Digite valor 1: ");
        valor1 = ent.nextInt();
        System.out.println("Digite valor 2: ");
        valor2 = ent.nextInt(); 

        PROD = valor1 * valor2;

        System.out.println("PROD = " + PROD);
    }
    

    
}
