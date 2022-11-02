package Beecrowd;

public class A1097 {
    public static void main(String[] args) {
        int auxI = 1, auxJ = 7, aux = 2;
        while (auxI <= 9) {
            System.out.println("I=" + auxI + " J=" + auxJ);
            System.out.println("I=" + auxI + " J=" + (auxJ - 1));
            System.out.println("I=" + auxI + " J=" + (auxJ - 2));
            auxI+= 2;
            auxJ = 7 + aux;
            aux += 2;
        }
    }
}
