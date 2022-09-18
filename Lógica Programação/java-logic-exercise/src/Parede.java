/* 4. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) 
precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). 
Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.

Começamos declarando as variáveis como double: hp, lp, ha, la e qtd. 
Vamos colocar alguns valores para a dimensão da parede e do azulejo (coloquei a parede como 2.6 x 1.6 e o azulejo como 0.35 x 0.3). 
Em seguida, vamos calcular a quantidade de azulejos necessários, basta multiplicar as duas dimensões da parede, para descobrir a área, 
e dividir pela multiplicação das duas dimensões do azulejo. Vai ficar assim: qtd = (hp * lp) / (ha * la). Por fim, 
é só exibir a quantidade de azulejos que será necessária para cobrir toda a parede. */

 import java.util.Scanner;

public class Parede {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float hp, lp, ha, la, qtd; 

        System.out.println("Indique a altura e largura da parede, respectivamente: ");
        hp = entrada.nextFloat();
        lp = entrada.nextFloat();
        System.out.println("Informe a altura e largura do azuleijo, respectivamente: ");
        ha = entrada.nextFloat();
        la = entrada.nextFloat(); 

        qtd = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azuleijos necessários: " + qtd);
    }

}  
