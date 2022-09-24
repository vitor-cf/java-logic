package Beecrowd;

import java.util.Scanner;

public class A1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a hora inicial e final:");
        int horaInicial = input.nextInt(), horaFinal = input.nextInt(), total; 

        if (horaInicial > horaFinal) {
            total = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
        } else if (horaInicial < horaFinal) {
            total = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + total + " HORA(S)");
        } else if (horaInicial == 0 && horaFinal == 0) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
