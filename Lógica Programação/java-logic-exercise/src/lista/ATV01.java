package lista;

public class ATV01 {
    public static void main(String[] args) {
        int N1 = 0, contador = 0, N2 = 1, fi;
        
        while (contador <= 8) {
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
        
                
            
                
                
               

