package Beecrowd;

import java.util.Scanner;
import java.lang.Math;

public class a1015 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float x1, x2, y1, y2, quadradoSomaT1, quadradoSomaT2, distancia;

        System.out.println("Informe o valor de (x1,y1)");
        x1 = ent.nextFloat();
        y1 = ent.nextFloat();
        System.out.println("Informe o valor de (x2,y2)");
        x2 = ent.nextFloat();
        y2 = ent.nextFloat();

        quadradoSomaT1 = (x2 - x1);
        quadradoSomaT2 = (y2 - y1);

        distancia = (quadradoSomaT1 * quadradoSomaT1) + (quadradoSomaT2 * quadradoSomaT2);
        System.out.println(distancia);
        System.out.printf("%.4f",Math.sqrt(distancia));
    }
}
