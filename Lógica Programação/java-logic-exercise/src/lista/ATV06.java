package lista;

import java.util.Scanner;

public class ATV06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorA, valorB, aux, fatorial, calculo, aux2, fatorial2;

        System.out.println("Informe valor A e B:");
        valorA = input.nextInt();
        valorB = input.nextInt();
        aux = valorA;
        
        
        while (valorA <= valorB) {
            if (valorA <= valorB && valorA % 2 == 0) {
                
                aux--;
                fatorial = aux * valorA;
                fatorial = valorA; 

                fatorial2 = valorA;

                aux2 = fatorial2;
                
                while(aux2 > 1) {

                    aux2--;
                    calculo = aux2 * fatorial2;
                    fatorial2 = calculo; 
                    if(aux2 == 1) {

                        System.out.println("Fatorial: " + fatorial + " = " + calculo);
                    }
                    
                }
            }
            valorA++;
        }
    }
}
                
                

                
                
