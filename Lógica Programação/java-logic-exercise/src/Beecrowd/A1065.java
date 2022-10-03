package Beecrowd;

import java.util.*;

public class A1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1, valor, qtd = 0; 

        while (contador <= 5) {
            valor = sc.nextInt();
            if (valor % 2 == 0) {
                qtd++;

            }  
            contador++;
        } 
        System.out.println(qtd + " valores pares");
    }
}
