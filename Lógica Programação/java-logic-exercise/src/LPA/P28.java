package LPA;

import java.util.*;

public class P28 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int valorI = 10, valorLimite, auxValorI, seqAritmetica,mediaAritmetica, qtdElementos = 0,
        pares = 0, impares = 0, valorDivTres = 0, somaElementos = 0, valorAux4 = 0, valorAux10 = 0;

        float mediaPonderada = 0;

        String text = "";

        final int RAZAO = 6, PESO1 = 4, PESO2 = 6;

        do {
            System.out.println("Informe o valor do intervalo:");
            valorLimite = sc.nextInt();
        } while (valorLimite < 50 || valorLimite > 100);
       
       auxValorI = valorI; 

        for(int i = 0; i < valorLimite; i++) {
            seqAritmetica = valorI + RAZAO;
            valorI = seqAritmetica;
            somaElementos += valorI;
            System.out.println(valorI);
            if(valorI % 2 == 0) {
                pares++;
            } else if (valorI % 2 != 0) {
                impares++;
             
            } else if (valorI % 2 != 0 && valorI % 3 == 0) {
                valorDivTres++;
            } 
            
            if (valorLimite >= 10) {
                if ( qtdElementos == 3 ) {
                    valorAux4 = valorI; 
                } 
                
                else if ( qtdElementos == 9) {
                    valorAux10 = valorI;
                    mediaPonderada = ((valorAux4 * PESO1) + (valorAux10 * PESO2)) / 10;
                } 
            } else {
                text = "NÃO FOI POSSIVEL CALCULAR MÉDIA PONDERADA, A QUANTIDADE DA SEQUENCIA É INSUFICIENTE!";
            }

            qtdElementos++;
                
                
        } 
        
        
        
        
        
        System.out.println("Quantidade de elementos da sequencia:");
        System.out.println(qtdElementos); 

        System.out.println("Media aritmetica:");
        mediaAritmetica = (auxValorI + valorI) / 2;
        System.out.println(mediaAritmetica);

        System.out.println("Quantidade de elementos pares:");
        System.out.println(pares);

        System.out.println("Quantidade de elementos impares:");
        System.out.println(impares); 

        System.out.println("Quantidade de elementos impares e divisivel por 3:");
        System.out.println(valorDivTres);

        System.out.println("Somando elementos: ");
        System.out.println(somaElementos); 

        
        System.out.println("Media Ponderada:");
        System.out.println(mediaPonderada); 
        System.out.println(text);
        
        

    } 

}
