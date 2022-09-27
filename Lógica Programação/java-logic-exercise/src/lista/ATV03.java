package lista;

import java.util.Scanner;

public class ATV03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = 1;
        System.out.println("Informe o valor de N: ");
        int contador = input.nextInt();

        while (contador > 0) {
            valor++;
            if (valor == 2 || valor == 3 || valor == 5 ) {
                System.out.println("Primos: "+ valor);
                contador--;
            }  else if ((valor % 1 == 0 && valor % valor == 0) && (valor % 2 != 0 && valor % 3 !=0 && valor % 5 != 0)) {
                System.out.println("Primos: " + valor);
                contador--;
            }
        }

    }
}
