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
            text = "Pontuação: 1 ";
            break;
            case "c": case "d":
            text = "Pontuação: 0" ;
            break;
            default:
            text = "alternativa nao existe";
            break;
        }
        System.out.println(text);
    }
}
        

           
            
