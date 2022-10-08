package Beecrowd;

import java.util.*;

public class A1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), quadrado;

        for(int x = 1; x <= N; x++) {
            if (x % 2 == 0) {
                quadrado = x * x;
                System.out.println(x + " ^ " + x + " = " + quadrado);
            }
        } 
        
    }
}
