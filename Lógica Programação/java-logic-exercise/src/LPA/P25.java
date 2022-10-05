package LPA;

public class P25 {
    public static void main(String[] args) {
        
        int n1 = 0, n2 = 1,fi;

        for (int i = 1; i <= 20; i++) {
            fi = n1 + n2;
            n2 = n1;
            n1 = fi;
            System.out.println(n1);
        }
    }
}
