package Beecrowd;
import java.util.Scanner;

public class A1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float A,B,C;

        System.out.println("Informe A, B e C: ");
        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat(); 

        float BC;
        BC = B + C;
        

        if (BC > A ) {
            float perimetro = A + B + C;
            System.out.println("Perimetro = " + perimetro);
        } else {
            float areaTrapezio = ((A + B) * C ) / 2;
            System.out.println("Area = " + areaTrapezio);
        }
    } 
}
        
            
