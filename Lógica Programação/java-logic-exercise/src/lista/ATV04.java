package lista;

public class ATV04 {
    public static void main(String[] args) {
        int hora = 0,min = 0,seg = 0;
        
        while(hora <= 23) {
            if (seg <= 59) {
                System.out.println(hora + ":" + min + ":" + seg);
                seg++;
            } else if (min <= 58) {
                seg = 0;
                min++; 
            } else if (min > 58 && hora <= 23) {
                min = 0;
                seg = 0;
                hora++;
            }
                
            

        } 
                
    }
}
            
         
            
        
        
        
            
