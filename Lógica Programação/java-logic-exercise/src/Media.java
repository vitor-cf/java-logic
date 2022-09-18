/* 3. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

Vamos declarar as variáveis de quatro salários dos funcionários e da média como double e definir alguns valores para cada um dos salários. 
Em seguida, vamos calcular a média dos mesmos, para isso, basta somar todos os salários e dividir pela quantidade de funcionários (que serão 4). 
Para finalizar, é só exibir a média na tela! */ 

 import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        float salario, somaSalario = 0;
        int func = 4; 

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o salário: ");
            salario = entrada.nextFloat();
            somaSalario = somaSalario + salario;
        } 
       float mediaSalario = somaSalario / func;  

       System.out.println("Media salário: " + mediaSalario);
    } 
} 
