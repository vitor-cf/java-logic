package Beecrowd;

import java.util.Scanner;

public class A1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Informe 2 valores");
        valor1 = input.nextInt();
        valor2 = input.nextInt();

        if(valor2 % valor1 == 0) {
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
    }
}
