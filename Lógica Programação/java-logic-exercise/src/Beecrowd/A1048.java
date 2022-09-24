package Beecrowd;

import java.util.Scanner;

public class A1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float valor, valorAtual, novoSalario;

        System.out.println("Informe o valor do salário:");
        valor = input.nextFloat();

        if (valor >= 0 && valor <= 400) {
            valorAtual = valor * 0.15f;
            novoSalario = valorAtual + valor;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.printf(" Reajuste ganho: %.2f", valorAtual);
            System.out.println(" Em percentual: 15 %" );
        } else if (valor >= 400.01 && valor <= 800) {
            valorAtual = valor * 0.12f;
            novoSalario = valorAtual + valor;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.printf(" \nReajuste ganho: %.2f", valorAtual);
            System.out.println(" \nEm percentual: 12 %" );
        } else if (valor >= 800.01 && valor <= 1200) {
            valorAtual = valor * 0.10f;
            novoSalario = valorAtual + valor;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.printf(" \nReajuste ganho: %.2f", valorAtual);
            System.out.println(" \nEm percentual: 10 %" );
        } else if (valor >= 1200.01 && valor <= 2000) {
            valorAtual = valor * 0.07f;
            novoSalario = valorAtual + valor;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.printf(" \nReajuste ganho: %.2f", valorAtual);
            System.out.println(" \nEm percentual: 7 %" );
        } else if (valor > 2000) {
            valorAtual = valor * 0.04f;
            novoSalario = valorAtual + valor;
            System.out.printf("Novo salario: %.2f", novoSalario);
            System.out.printf(" \nReajuste ganho: %.2f", valorAtual);
            System.out.println(" \nEm percentual: 4 %" );
        }
    }
}
