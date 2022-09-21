package LPA;

public class P21 {
    public static void main(String[] args) {
        int valor = 0, contador = 1;

        while (contador <= 10) {
            if (valor % 2 != 0 && valor % 3 == 0) {
                System.out.println(valor);
                contador++;
                
            } 
            valor++;
        }
    }
}
