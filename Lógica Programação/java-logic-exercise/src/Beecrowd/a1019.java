package Beecrowd;

import java.util.Scanner;

public class a1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N; 
        int hora, minutos, segundos, resto;
        
        System.out.println("Informe o tempo em segundos:");
        N = sc.nextInt();
        
        hora = N / 3600;
        minutos = (N % 3600) / 60; 
        segundos = N % 60;

        
        System.out.println(hora + " : " + minutos + " : " + segundos);
        

    }

}
