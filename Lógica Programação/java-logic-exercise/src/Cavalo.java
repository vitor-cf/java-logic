import java.util.Scanner;

public class Cavalo {
   public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float m, h, t, qtdCavalos;

        System.out.println("Informe a massa: ");
        m = ent.nextFloat();
        System.out.println("Informe a altura: ");
        h = ent.nextFloat();
        System.out.println(("Informe o tempo(s): "));
        t = ent.nextFloat();

        qtdCavalos = (m * h / t) / 745.6999f; 
        
        System.out.println("Quantidade de cavalos: " + qtdCavalos);
   }
}

    



