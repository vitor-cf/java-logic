package Beecrowd;

import java.util.Scanner;

public class a1016 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int distancia, tempo;
        
        System.out.println("Informa a distância:");
        distancia = ent.nextInt();

        tempo = distancia * 2;

        System.out.println(tempo + " minutos");

    }
}
