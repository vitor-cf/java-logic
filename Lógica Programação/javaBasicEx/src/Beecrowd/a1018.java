package Beecrowd;

import java.util.Scanner;

public class a1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cedulas;

        System.out.println("Informe um valor:");
        cedulas = sc.nextInt();
        if(cedulas >= 0 && cedulas <= 100000) {
            
            int atual = cedulas;
            int notas100 = atual / 100;
            atual -= notas100 * 100; 
            int notas50 = atual / 50;
            atual -= notas50 * 50;
            int notas20 = atual / 20;
            atual -= notas20 * 20;
            int notas10 = atual / 10;
            atual -= notas10 * 10;
            int notas5 = atual / 5;
            atual -= notas5 * 5;
            int notas2 = atual / 2;
            atual -= notas2 * 2;
            int notas1 = atual / 1;
            atual -= notas1 * 1;

            System.out.println(cedulas);
            System.out.println(notas100 + " notas ( s ) " + " de " + " R$ 100,00");
            System.out.println(notas50 + " notas ( s ) " + " de " + " R$ 50,00");
            System.out.println(notas20 + " notas ( s ) " + " de " + " R$ 20,00");
            System.out.println(notas10 + " notas ( s ) " + " de " + " R$ 10,00");
            System.out.println(notas5 + " notas ( s ) " + " de " + " R$ 5,00");
            System.out.println(notas2 + " notas ( s ) " + " de " + " R$ 2,00");
            System.out.println(notas1+ " notas ( s ) " + " de " + " R$ 1,00");


        } else {
            System.out.println("Presentation Error");
        }
    }
}
