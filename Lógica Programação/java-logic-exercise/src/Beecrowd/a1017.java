package Beecrowd;

import java.util.Scanner;

public class a1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempo, vMedia, distancia, qtLitros;

        System.out.println("Informe o tempo gasto:");
        tempo = sc.nextDouble();
        System.out.println("Informe a velocidade media:");
        vMedia = sc.nextDouble();

        distancia = tempo * vMedia;
        qtLitros = distancia / 12;

        System.out.printf("%.3f", qtLitros);
    }
}
