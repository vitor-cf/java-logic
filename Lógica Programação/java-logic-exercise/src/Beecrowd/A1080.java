package Beecrowd;

 
import java.util.*;

/* 3) Faça um programa que receba os dados coletados numa pesquisa feita para saber o gosto dos
frequentadores de um cinema. Foi perguntado às pessoas:
- A idade
- O sexo
- A preferência entre os gêneros: Comédia, terror ou ação.
A entrada de dados termina quando for digitado -1 para a idade da pessoa. Ao final o
programa deve informar:
a) Qual a média de idade das pessoas que preferem filmes de terror.
b) Qual o percentual de homens que prefere filmes de ação.
c) Mais homens ou mais mulheres preferem os filmes de comédia.
d) Em que faixa etária estão os frequentadores do referido cinema. */

public class A1080 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade, genero, auxIdade = 0, qnt = 1, pessoa = 0, homemTotal = 0, homemComedia = 0, mulherComedia = 0, mediaTerror = 0, somaIdade = 0, mediaIdade;
        float percentual, resultado,homemAcao = 0f;
        String sexo;
        do {
            System.out.println("Informe a idade:");
            idade = sc.nextInt();
            if (idade > 0) {
                System.out.println("Informe o sexo:" + "\nHomem - h" + "\nMulher - m");
                sexo = sc.next();  
                if (sexo.equals("m")) {
                    
                    System.out.println("Informe o gênero" + "\nTerror - 1"+ "\nComédia - 2"+ "\nAção - 3");
                    genero = sc.nextInt();
                    if (genero == 1) {
                        
                        auxIdade += idade;
                        mediaTerror = auxIdade / qnt; 
                        System.out.println("media:" + mediaTerror);
                    } else if (genero == 2) {
                        mulherComedia++;
                        

                    } else if ( genero == 3) {
                        

                    } 

                } else if (sexo.equals("h")) {
                    homemTotal++;
                    System.out.println("Informe o gênero" + "\nTerror - 1"+ "\nComédia - 2"+ "\nAção - 3");
                    genero = sc.nextInt();
                    if (genero == 1) {
                        
                        auxIdade += idade;
                        mediaTerror = auxIdade / qnt; 
                        

                    } else if (genero == 2) {
                        homemComedia++;
                        
                    } else if ( genero == 3) {
                        homemAcao++;
                        
                        
                    }
                          
                } 
                
                somaIdade += idade;
                qnt++;
                pessoa++;
            } else {
                System.out.println("Entrada de dados terminou");
            } 
            
            
            
        } while (idade > 0); 

        System.out.println("Media idade filme de terror: " + mediaTerror); 

        resultado = homemAcao/homemTotal;
        percentual = resultado * 100f;
        System.out.println("Percentual de homens filme de ação: " + percentual + "%");

        mediaIdade = somaIdade / pessoa;
        
        if (mediaIdade >= 0 && mediaIdade < 14) {
            System.out.println("criança");
        } else if (mediaIdade >= 14 && mediaIdade <= 17) {
            System.out.println("Adolescente");
        } else if (mediaIdade >= 18){
            System.out.println("Adulto");
        }
        

      if(mulherComedia > homemComedia) {
        System.out.println("Mulher ver mais comedia");
      } else if (homemComedia > mulherComedia){
        System.out.println("Homem ver mais comedia");
    } else if (mulherComedia == homemComedia) {
        System.out.println(" ");
    }

        
    }
}
                        

                        



       

             



