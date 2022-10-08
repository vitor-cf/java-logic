package Beecrowd;

import java.util.*;

public class A1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), valores=0;

        for (int x = 0; x <= N; x++){
            valores= sc.nextInt();
            if (valores % 2 == 0) {
                System.out.println("EVEN");
            } else if ( valores % 2 != 0)  {
                System.out.println("ODD");
            } else if (valores == 0) {
                System.out.println("NULL");
            }
        }
    }
}
