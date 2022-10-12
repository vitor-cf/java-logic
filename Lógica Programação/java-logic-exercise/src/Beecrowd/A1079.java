package Beecrowd;

import java.util.Scanner;

public class A1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double valor1,valor2,valor3, mediaponderada = 0;
        final int[] PESO = {2, 3, 5};
        final int SOMAPESOS = 10;

        for(int i = 0; i < N; i++) {
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();
            mediaponderada = (valor1*PESO[0] + valor2*PESO[1] + valor3*PESO[2])/SOMAPESOS;
            System.out.println(mediaponderada);
        }
            
    }
            
}
