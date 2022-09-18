package Beecrowd;

import java.util.Scanner;

public class a1011 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float raio;
        float volume;
        final float PI = 3.14159f;
        
        System.out.println("Informe o Raio: "); 
        raio = ent.nextInt();

        volume = 4 * PI * (raio * raio * raio)/3;

        System.out.println("VOLUME = " + volume);
    }
}
