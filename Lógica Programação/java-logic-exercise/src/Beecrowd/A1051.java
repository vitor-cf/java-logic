package Beecrowd;

import java.util.Scanner;

public class A1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valor, valorI;

        System.out.println("Informe o valor:");
        valor = sc.nextFloat();

        if (valor >= 0 && valor <= 2000) {
            System.out.println("Isento");
        } else if (valor >= 2000.01 && valor <= 3000) {
            valorI = valor * 0.08f;
            System.out.println("R$ " + valorI);
        } else if (valor >= 3000.01 && valor <= 4500) {
            valorI = (1000 * 0.08f) + (2 * 0.18f);
            System.out.println("R$ " + valorI);
        } else if (valor > 4500) {
            valorI = (1000 * 0.18f) + (2 * 0.28f);
            System.out.println("R$ " + valorI);
        }
    }
}
