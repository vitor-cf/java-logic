package Beecrowd;

import java.util.Scanner;

public class a1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double A, B, C;
        Double X1, X2;

        System.out.println("Informe 3 valores: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        Double delta;
        delta = ( B * B ) - ( 4 * A * C) ;  
        
        Double raizDelta = Math.sqrt(delta); 

        X1 = (- B + raizDelta) / (2 * A);
        X2 = (- B - raizDelta) / (2 * A);  

        if (delta <= 0 || (A == 0)) {

            System.out.println("Impossível calcular");

        } else {

            System.out.printf("R1 = %.5f\n", X1);
            System.out.printf("R1 = %.5f\n", X2);

        }
            
    }
}
            
       

        
