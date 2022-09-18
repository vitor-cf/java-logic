package Beecrowd;
import java.util.Scanner;
import java.text.DecimalFormat;

public class a1012 {
    public static void main(String[] args) {
        float valorA, valorB, valorC, aTriangulo, aCirculo, aTrapezio, aQuadrado, aRetangulo;
        final float PI = 3.14159f;
        Scanner ent = new Scanner(System.in);
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(3);

        System.out.println("Informe os valors A, B e C, respectivamente :");
        valorA = ent.nextFloat();
        valorB = ent.nextFloat();
        valorC = ent.nextFloat();

        aTriangulo = (valorA * valorC) / 2;
        aCirculo = PI  * (valorC * valorC ); 
        aTrapezio = ((valorA + valorB) * valorC) / 2;
        aQuadrado = valorB * valorB;
        aRetangulo = valorA * valorB;

        System.out.println("TRIANGULO: " + frmt.format(aTriangulo));
        System.out.println("CIRCULO: "+ frmt.format(aCirculo));
        System.out.println("TRAPEZIO: "+ frmt.format(aTrapezio));
        System.out.println("QUADRADO: "+ frmt.format(aQuadrado));
        System.out.println("RETANGULO: "+ frmt.format(aRetangulo));

    }
}
