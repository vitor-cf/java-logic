package Beecrowd;

import java.util.Scanner;
import java.lang.Math;
public class a1014 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float valorX, valorY, gasto;

        System.out.println("Informe a distância percorrida: ");
        valorX = ent.nextFloat();
        System.out.println("Informe combustível gasto: ");
        valorY = ent.nextFloat();

        gasto = valorX / valorY;

        System.out.printf("%.3f km/l", gasto);
    }

}
