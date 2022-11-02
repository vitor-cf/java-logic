package Beecrowd;

public class A1095 {
    public static void main(String[] args) {
        int aux = 60;
        for (int i = 1; i <= 60 ; i += 3) {
            if (aux >= 0) {
                System.out.println("I=" + i + " J=" + aux);
                aux = aux - 5;
            }
            
            
        }
    }
}
