package Beecrowd;

import java.util.*;

public class A1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorY = sc.nextInt(), valorX = sc.nextInt();

        while (valorX < valorY) {
            
            if (valorX % 2 != 0) {
               
                int res = valorX;
                
                System.out.println(res);
            } 
            valorX++;
        }
        
    }
}
            


