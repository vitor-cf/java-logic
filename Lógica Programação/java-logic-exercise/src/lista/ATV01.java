package lista;

public class ATV01 {
    public static void main(String[] args) {
        int N1 = 1, contador = 0, N2 = 0, fi;
        
        System.out.println(N1);
        while (contador <= 8) {
            if (N1 >= 1) {
                fi = N1 + N2;
                N2 = N1;
                N1 = fi;
                System.out.println(fi);
                
                contador++;
             }
             
         }
     }
 }
        
                
            
                
                
               

