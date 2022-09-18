package LPA;

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        String diaSemana;

        System.out.println("Informe um valor");
        valor = sc.nextInt();

        switch (valor) {
            case 1:
                diaSemana = "Segunda-feira";
                break;
            case 2:
                diaSemana = "Terça-feira";
                break;
            case 3: 
                diaSemana = "Quarta-feira";
                break;
            case 4: 
                diaSemana = "Quinta-feira";
                break;
            case 5: 
                diaSemana = "Sexta-feira";
                break;
            case 6:
                diaSemana = "Sabado"; 
                break;
            case 7:
                diaSemana = "Domingo";
                break;

                default:
                diaSemana = "ESSE DIA NÃO EXISTE";
                break;
        } 
        System.out.println(diaSemana);
    }
}
