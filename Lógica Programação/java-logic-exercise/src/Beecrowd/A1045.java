package Beecrowd;

import java.util.Scanner;
import java.util.Arrays; 

public class A1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        

        System.out.println("Informe 3 valores:");
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat(); 

        float[] list = {A, B, C};

        Arrays.sort(list);

        C = list[0];
        B = list[1];
        A = list[2];
        
         float BC = B + C; 
         float AC = A + C;
         float AB = B + C;
         float BB = B * B;
         float CC = C * C;
         float BCQ = BB + CC;
         float AA = A * A;

         if (BC > A && AC > B) {
             if (AB > C) {
                 if (AA == BCQ) {
                     System.out.println("TRIANGULO RETANGULO");
                 } else if (AA > BCQ) {
                     System.out.println("TRIANGULO OBTUSANGULO");
                 } else if (AA < BCQ) {
                     System.out.println("TRIANGULO ACUTANGULO");
                 } 
             } else {
                 System.out.println("NAO FORMA TRIANGULO");
             }
             
         } else {
             System.out.println("NAO FORMA TRIANGULO");
         } 

         if ((A == B && B == C) && A == C) {
            System.out.println("TRIANGULO EQUILATERO");
         } else if ((A == B || B == C) || A == C) {
            System.out.println("TRIANGULO ISOSCELES");
         } 

       
        
    }
}
        


    
