package LPA;

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        float valor1, valor2;

        System.out.println("Informe o valor");
        valor1 = sc.nextFloat();
        valor2 = sc.nextFloat();
        if ( valor1 > 0 && valor1 <= 100) {
            if (valor2 > 0 && valor2 <= 100) {
                System.out.println("Selecione a operação" + "\n (1) - Adição" + "\n (2) - Subtraçao" + "\n (3) - Divisão" + "\n (4) - Multiplicação");
                int operator = sc.nextInt();

                switch (operator) {
                    case 1:
                        float soma = valor1 + valor2;
                        text = "Soma: " + soma; 
                        break;
                    case 2:
                        float sub = valor1 - valor2;
                        text = "Subtração: " + sub; 
                        break;
                    case 3: 
                        float div = valor1 / valor2;
                        text = "Divisão: " + div; 
                        break;
                    case 4: 
                        float multi = valor1 * valor2; 
                        text = "Multiplicaçao: " + multi; 
                        break;
                    default:
                        text = "Operação inválida";
                        break;
                } 
                System.out.println(text);
            } 
            
        } else {
            System.out.println("Valor informado inválido");
        } 
        
    }
}
