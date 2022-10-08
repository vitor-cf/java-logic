package Beecrowd;

import java.util.*;

public class A1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(), X, in=0, out=0;

        for(int x = 0; x < N; x++) {
            X = sc.nextInt();
            if(X >= 10 && X <= 20) {
                in++;
            } else if (X >= 0 ) {
                out++;
            }

        } 

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}