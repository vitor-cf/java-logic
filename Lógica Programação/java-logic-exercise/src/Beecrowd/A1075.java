package Beecrowd;

import java.util.*;

public class A1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(),qnt = 1;
        for(int i = 1; i <= 10000; i++) {
            if (i % N == 2) {
                System.out.println(i);
            }
            
        }
    }
}
            
