package Beecrowd;

import java.util.Scanner;
public class A1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     String[] listDest = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro" 
    , "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"}; 

    int DDD;

    System.out.println("Informe o DDD:");
    DDD = sc.nextInt(); 

    if (DDD == 61) {
        System.out.println(listDest[0]);
    } else if (DDD == 71) {
        System.out.println(listDest[1]);
    } else if (DDD == 11) {
        System.out.println(listDest[2]);
    } else if (DDD == 21) {
        System.out.println(listDest[3]);
    } else if (DDD == 32) {
        System.out.println(listDest[4]);
    } else if (DDD == 19) {
        System.out.println(listDest[5]);
    } else if (DDD == 27) {
        System.out.println(listDest[6]);
    } else if (DDD == 31) {
        System.out.println(listDest[7]);
    }
    }
    
} 

   

    
