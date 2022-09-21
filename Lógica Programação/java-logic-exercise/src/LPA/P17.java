package LPA;

import java.util.Scanner;

public class P17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alternativa, text;

        System.out.println("Questão 01: Indique, entre as opções abaixo, o animal invertebrado:"
        + "\n (a) lesmas" + "\n (b) ostras" + "\n (c) cachorro" + "\n (d) gato"); 

        alternativa = sc.nextLine();

        switch (alternativa) {
            case "a":  case "b":
            int pontuacao = 1;
            text = "Resposta correta " + "\nPontuação: " + pontuacao;
            break;
            case "c": case "d":
            pontuacao = 0;
            text = "Resposta errada " + "\nPontuação: " + pontuacao ;
            break;
            default:
            text = "alternativa nao existe";
            break;
        }

        System.out.println(text);
    }
}
        

           
            
