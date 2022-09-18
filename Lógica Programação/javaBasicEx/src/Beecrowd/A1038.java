package Beecrowd;

import java.util.Scanner;

public class A1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Selecione a opção: " );

        double total = 0;
        double num = input.nextDouble(); 
        System.out.println("Quantidade: ");
        double QTD = input.nextDouble();

        if(num == 1) {
            total = 4.00;
        } if (num == 2) {
            total = 4.50;
        } if (num == 3) {
            total = 4.50;
        } if (num == 4) {
            total = 2.00;
        } if (num == 5) {
            total = 1.50;
        }
        double soma = total * QTD; 
        System.out.printf("Total: R$ %.2f%n", soma);
    }  
    
   
    
}
    
        
         

       

        

        

        
        
        
        

       


