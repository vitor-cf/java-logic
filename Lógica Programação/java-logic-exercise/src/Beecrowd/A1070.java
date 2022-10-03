package Beecrowd;

import java.util.*;

public class A1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1,qntd = sc.nextInt();

        while (contador <= 6) {
            qntd += 1;
            if (qntd % 2 != 0) {
                System.out.println(qntd);
                contador++;
            } 
            
        }
    }
                
}
