package LPA;

public class P20 {
    public static void main(String[] args) {
        int valor = 0;

        while (valor <= 100) {
            valor++;
            if (valor % 3 == 0 && valor % 5 == 0) {
                System.out.println(valor);
            }
        }
    }
}
