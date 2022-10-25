
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List; 
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ExemploList {

    public static void main(String[] args) {
        //  Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

   /*  List notas = new ArrayList(); // antes do java 5
    List<Double> notas1 = new ArrayList<>(); */ // Generics(jdk 5) - desta forma indica que o tipo de elemento na lista é Double
    // Diamond Operator (jdk 7) - quando criado a new array pra termos que repetir o tipo apenas inserios "<>".

    /* -------------------------------------------- */

    /* ArrayList<Double> notas2 = new ArrayList<>(); */ // Podemos por a implementação no início (ArrayList) não uma boa prática.
    // O recomendado é programar voltado para interface 

    /* -------------------------------------------- */
    
    /* List<Double> notas3 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    List<Double> notas4 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); */ 

    /* notas3.add(10d);
    System.out.println(notas3); */

    // Duas formas para inserir elementos na lista
    // A diferença que utilizando "new ArrayList" -> é possível add e remove elementos e usando como na linha de baixo pode add nem remover. 

    /* -------------------------------------------- */
    
   // List<Double> notas5 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // Torna a lista imutável
        
   System.out.println("Crie uma lista e adicione as 7 notas"); 
        Scanner sc = new Scanner(System.in);
        double valor;
        List<Double> notas = new ArrayList<>(); 

        for(int x = 0; x < 7; x++) {
            notas.add(valor = sc.nextDouble()); 
        }

        System.out.println(notas);
        System.out.println("Posição da nota 5 da lista:");
        System.out.println(notas.indexOf(5d));
        System.out.println("Adicionando nota 8  na posição 4:");
        notas.add(4, 8d); 
        System.out.println(notas); 
        System.out.println("Substituindo nota 5 pela nota 7:");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);
        System.out.println("Confira se a nota 5 está na lista:");
        System.out.println(notas.contains(5d));
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota); 
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores:" + soma );
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("Remova nota na posiçao 0");
        notas.remove(0);
        System.out.println(notas);
     }
    


}


