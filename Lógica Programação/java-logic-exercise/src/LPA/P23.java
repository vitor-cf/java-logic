package LPA;

public class P23 {
    public static void main(String[] args) {
        int N1 = 0, contador = 1, N2 = 1, fi;
        
        while (contador <= 20) {
            
            System.out.println(N1);
            if (N1 >= 0) {
                fi = N1 + N2;
                N2 = N1;
                N1 = fi;
                
                contador++;
            }
             
         }
                
    }
}
       


            
            
