package LPA;

public class P22 {
    public static void main(String[] args) {
        int valor = 99;

        while (valor >= 0) {
            if (valor % 2 != 0 && valor % 3 == 0) {
                System.out.println(valor);
            }
            valor -= 2;
        }
    }
}
               
