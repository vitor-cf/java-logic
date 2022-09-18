package Beecrowd;

import java.util.Scanner;

public class A1041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float x, y;

        System.out.println("Informa as coordenadas x , y : ");
        x = input.nextFloat();
        y = input.nextFloat();

        if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        } else if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("EIXO Y");
        } else if (y == 0) {
            System.out.println("EIXO X");
        }
         else {
            System.out.println("Error");
        }
    }
}
