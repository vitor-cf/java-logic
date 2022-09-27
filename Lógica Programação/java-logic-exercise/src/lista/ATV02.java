package lista;

import java.util.Scanner;

public class ATV02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor:");
        int valor = input.nextInt(); 

        if (((valor == 2 || valor == 3)) || (valor == 5)) {
            System.out.println("Primo");
        } else if ((valor % 1 == 0 && valor % valor == 0) && (valor % 2 != 0 && valor % 3 !=0 && valor % 5 != 0)) {
            System.out.println("primo");
        } else {
            System.out.println("NÃO É PRIMO");
        }
    }
}
