/* 1 - Escreva um programa que, com base em uma 
temperatura em graus celsius, a converta e 
exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
 Ra = C * 1.8 + 32 + 459.67 */

/* public class App {
    public static void main(String[] args) throws Exception {
        float C = 2.43f;

        float F = C * 1.8f + 32;
        float K = C + 273.15f;
        float Re = C * 0.8f;
        float Ra = C * 1.8f + 32 + 459.67f;

        System.out.println("Temperatura F: " + F );
        System.out.println("Temperatura K: " + K );
        System.out.println("Temperatura Re: " + Re );
        System.out.println("Temperatura Ra: " + Ra );


    }
} */ 


/* 2. Tem-se um conjunto de dados contendo a 
altura e o sexo (masculino, feminino) de 10 pessoas. 
Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres. */

/* import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sexo, qtMulheres=0, qtHomens=0;
        float altura, somaH=0, mediaHomens=0, maior=0, menor=0;

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("Escolhe o sexo (1 - Mulher, 2 - Homem):" );
            sexo = entrada.nextInt();
            System.out.println("Digite a altura: ");
            altura = entrada.nextFloat();
            if(sexo == 1) {
                qtMulheres++; 
                System.out.println("Mulher nº:" + qtMulheres);
            } else if (sexo == 2) {
                qtHomens++;
                System.out.println("Homem nº: " + qtHomens);
                somaH = somaH + altura;
            } else {
                System.out.println("Opção sexo inválido");
            } 
            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }


        } 
        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + qtMulheres);

        entrada.close();
    }
} */ 

// 3  

/* 3. Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

Vamos declarar as variáveis de quatro salários dos funcionários e da média como double e definir alguns valores para cada um dos salários. 
Em seguida, vamos calcular a média dos mesmos, para isso, basta somar todos os salários e dividir pela quantidade de funcionários (que serão 4). 
Para finalizar, é só exibir a média na tela! */ 

/* import java.util.Scanner;

public class App {
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
} */ 

/* 4. Uma parede em formato retangular, cuja altura é hp (altura da parede) e a largura lp (largura da parede) 
precisa ser coberta por azulejos também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo). 
Escreva um programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.

Começamos declarando as variáveis como double: hp, lp, ha, la e qtd. 
Vamos colocar alguns valores para a dimensão da parede e do azulejo (coloquei a parede como 2.6 x 1.6 e o azulejo como 0.35 x 0.3). 
Em seguida, vamos calcular a quantidade de azulejos necessários, basta multiplicar as duas dimensões da parede, para descobrir a área, 
e dividir pela multiplicação das duas dimensões do azulejo. Vai ficar assim: qtd = (hp * lp) / (ha * la). Por fim, 
é só exibir a quantidade de azulejos que será necessária para cobrir toda a parede. */

/* import java.util.Scanner;

public class App {
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

/* 5. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula: V = 3.14159 * R * R * A, 
em que as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e de raio. 
Agora vamos escrever a fórmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo o resultado do volume encontrado. */ 

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float V = 3.14159f , R, A, volume;

        System.out.println("Informe o Raio: ");
        R = input.nextFloat();
        System.out.println("Informe a Altura ");
        A = input.nextFloat();

        volume = (V * R * R * A);

        System.out.println("Volume: " + volume);
        
    }
}