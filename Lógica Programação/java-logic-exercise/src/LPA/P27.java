package LPA;

public class P27 {
    public static void main(String[] args) {
        int valorI = 10,res, contador = 1;

        System.out.println("USANDO FOR:" + "\n");
        for (int i = 1; i <= 10; i++) {
            res = valorI * 3;
            valorI = res;
            System.out.println(valorI); 
        }
        System.out.println("USANDO DO/WHILE:" + "\n");

        do {
            res = valorI / 3;
            if(res >= 10){
            valorI = res;
            System.out.println(valorI); 
            contador++;
            }
            
        } while (contador <= 10);

        System.out.println("USANDO WHILE:" + "\n");
        contador = 1;
        while (contador <= 10) {

            res = valorI * 3; 
            valorI = res;
            System.out.println(valorI); 
            contador++;
        }
            
            
            
    } 
    
}
