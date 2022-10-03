package Beecrowd;

import java.util.*;
public class A1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1, valor, qtdP = 0, qtdI = 0, qtdPos = 0, qtdN = 0;

        while (contador <= 5) {
            valor = sc.nextInt();
            if (valor % 2 == 0) {
                qtdP++;
                if (valor > 0) {
                    qtdPos++;
                } 
                if (valor < 0) {
                    qtdN++;
                }
            } else if (valor % 3 == 0 || valor % 5 == 0) {
                qtdI++; 
                if (valor > 0) {
                    qtdPos++;
                }  
                if (valor < 0) {
                    qtdN++;
                }
            } 
            contador++;
        } 
        System.out.println(qtdP + " valor(es) par(es)" + 
        "\n" + qtdI + " valor(es) impar(es)" + 
        "\n" + qtdPos + " valor(es) positivo(a)" +
        "\n" + qtdN + " valor(es) negativo(s)");
    }
}
