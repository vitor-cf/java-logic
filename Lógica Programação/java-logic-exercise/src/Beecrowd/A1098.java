package Beecrowd;

public class A1098 {
    public static void main(String[] args) {
        double auxI = 0, auxJ = 1, aux = 2, aux2 = 0;
        while (auxI <= 2) {
            System.out.println("I=" + auxI + " J=" + auxJ + aux2);
            System.out.println("I=" + auxI + " J=" + (auxJ + (1 + aux2)));
            System.out.println("I=" + auxI + " J=" + (auxJ + (2 + aux2)));
            auxI+= 0.2;
            auxJ = 1;
            aux += 2;
            aux2 += 0.2;
        }
    }
}
