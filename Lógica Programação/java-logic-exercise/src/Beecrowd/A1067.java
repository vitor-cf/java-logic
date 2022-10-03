package Beecrowd;

import java.util.*;

public class A1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1, limite = sc.nextInt(),qntd = 1;

        while (contador <= limite) {
            if ((qntd % 3 == 0 || qntd % 5 == 0 || qntd % qntd == 0) && qntd <= limite) {
                
                System.out.println(qntd);
            } 
            qntd += 2;
            contador++;
        }
    }
}

            
