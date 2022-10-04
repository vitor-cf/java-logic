package LPA;

public class P24 {
    public static void main(String[] args) {
        int N1 = 0, N2 = 1, fi;
        
        do {
            
            System.out.println(N1);
            fi = N1 + N2;
            N2 = N1;
            N1 = fi;
        
    } while (N1 <= 5000);
}
}
       

            
