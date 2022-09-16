package LPA;

import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        int mes;
        

        System.out.println("Informe o valor entre 1 e 12:" + "\n 1 - Janeiro" + "\n 2 - Fevereiro" + "\n 3 - Março"
        + "\n 4 - Abril" + "\n 5 - Maio" + "\n 6 - Junho" + "\n 7 - Julho" + "\n 8 - Agosto" + "\n 9 - Setembro" + "\n 10 - Outubro" + "\n 11 - Novembro"
        + "\n 12 - Dezembro");
        mes = sc.nextInt();

        switch (mes) {
            case 1: case3: case5: case7: case8: case10: case12:
            text = "31 dias";
            break; 

            case 2: 
            System.out.println("Qual o ano?");
            int ano = sc.nextInt();
            if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                text = "29 dias";
            } else {
                text = " 28 dias";
            }
            break; 

            case 4: case 6: case 9: case 11:
            text = "30 dias";
            break;

            default:
            text = "VALOR INFORMADO INVÁLIDO";
            break;
        } 

        System.out.println(text);
    }
}
