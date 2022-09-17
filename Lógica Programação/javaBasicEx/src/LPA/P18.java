package LPA;

import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        

        System.out.println("Escolha uma das opções: "
        + "\n (1) - Média ponderada" + "\n (2) - Média aritmética");
        int media = sc.nextInt();
        

        switch (media) {
            case 1:
            System.out.println("Informe dois valores: ");
               Double valor1 = sc.nextDouble();
               Double valor2 = sc.nextDouble();

                if(valor1 >= 0 && valor1 <= 10) {
                    if (valor2 >= 0 && valor2 <= 10) {
                        Double mediaPonderada = (valor1 * 4 + valor2 * 6) / 10; 
                        System.out.println("Média ponderada: " + mediaPonderada);
                    } 
                } else {
                    System.out.println("VALOR FORA DO INTERVALO VÁLIDO");
                }
                 
                break; 
            case 2: 
            System.out.println("Informe dois valores: ");
                Double valor3 = sc.nextDouble();
                Double valor4 = sc.nextDouble(); 

                if (valor3 >= 0 && valor3 <= 10) {
                    if (valor4 >= 0 && valor4 <= 10) {
                        Double mediaAritmetica = (valor3 + valor4) / 2;
                        System.out.println(" Média aritmética: " + mediaAritmetica);
                    }
                } else {
                    System.out.println("VALOR FORA DO INTERVALO");
                }
                break;
        
            default: 
                System.out.println("Opção inválida");
                break;
        }

    }

}
