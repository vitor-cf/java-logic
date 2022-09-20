package Beecrowd;

import java.util.Scanner;
import java.util.Arrays;

public class A1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 3 valores:");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();

        int [] list = {valor1, valor2, valor3};

        Arrays.sort(list);

        System.out.println("modificado: " + 
        Arrays.toString(list));
        System.out.println(valor1 + "\n" + valor2 + "\n" + valor3);
    }
    
}
