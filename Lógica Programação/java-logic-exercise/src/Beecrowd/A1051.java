 package Beecrowd;

 import java.util.Scanner;

 public class A1051 {     public static void main(String[] args) {         Scanner sc = new Scanner(System.in);

         float valor, valor1;

         System.out.println("Informe o valor:");
         valor = sc.nextFloat();

         if (valor >= 0 && valor <= 2000) {
             System.out.println("Isento");
         } else if (valor >= 2000.01 && valor <= 3000) {
            valor1 = 1000 * 0.08f;
             System.out.println("R$ " + valor1);
         } else if (valor >= 3000.01 && valor <= 4500) {
            valor1 = 1000 * 0.08f;
             System.out.println("R$ " + valor1);
         } else if (valor > 4500) {
             valor1 = valor * 0.28f;
            System.out.println("R$ " + valor1);
         }
     }
 }
