package Beecrowd;

import java.util.*; 

public class A1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), tabuada;
        for(int i = 1; i <= 10; i++) {
            tabuada = i * N;
            System.out.println(i + " x " + N + " = " + tabuada);
        }

        
            
    }
}
