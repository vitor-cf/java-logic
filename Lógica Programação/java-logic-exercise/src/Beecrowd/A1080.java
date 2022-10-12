package Beecrowd;

import java.util.*;
public class A1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), valorI, valorF = 0, pos = 0;
        

        for (int i = 0; i < N; i++) {
            valorI = sc.nextInt();
            valorF = 0;
            if (valorI > valorF) {
                valorF = valorI;
                System.out.println(valorF);
            }   
                
            
        }
    }
}
