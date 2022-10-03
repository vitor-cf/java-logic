 package Beecrowd;

 import java.util.*;
 public class A1064 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int contador = 1 , qtd = 0;
         double somaValores = 0;
 
         while (contador <= 6) {
            double valor = sc.nextDouble();
            
             if (valor > 0) {
                 qtd++;
                 somaValores += valor;
                 
                }
                contador++;  
                
                
               }
               System.out.println(qtd + " valores positivos" + 
               "\n" + (somaValores / qtd));
            
        }
            
    }
                 

 
     
 
