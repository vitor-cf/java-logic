package Beecrowd;

import java.util.Scanner;

public class a1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D; 

        System.out.println("Informe os valores da entrada:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        if ( B > C && D > A ) {
            if (C + D > A + B) {
                if (C > 0 && D > 0) {
                    if (A % 2 == 0) {
                        System.out.println(A + "" + B + "" + C + "" + D);
                        System.out.println("Valores aceito");
                    }
                }
            } 
        } else {
            System.out.println("Valores não aceito");
        }

    }
}
