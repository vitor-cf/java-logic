package lista;

import java.util.Scanner; 

public class ATV05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, fatorial, aux;

        System.out.println("Informe o número: ");
        
        valor = input.nextInt();
        aux = valor;
        while (aux > 1) {
            aux--;
            fatorial = aux * valor;
            valor = fatorial;
            if(aux == 1) {
                System.out.println(fatorial);
            }
            
        }
    }
}
            

            
