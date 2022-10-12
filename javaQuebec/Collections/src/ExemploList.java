import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = 0;
        List<Double> notas = new ArrayList<>();

        for (int x = 0; x < 7; x++) {
            i = sc.nextDouble();
            notas.add(i);
            
        }
        notas.add(3,8d);
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas.toString()); 
        System.out.println("Posição da nota 3 " + notas.indexOf(3d));
        System.out.println("Confira se a nota 5.0 está na lista:" + notas.contains(6d));
        for (Double nota : notas) System.out.println(nota);
            
        
    }
}
