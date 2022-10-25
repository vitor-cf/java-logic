package Beecrowd;
import java.util.Scanner;

public class A1093 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), Quantia, totalC = 0, totalR = 0, totalS = 0, Cobaia = 0;
        float porC = 0, porR, porS = 0, auxCobaia;
        String Tipo;
        for(int i = 1; i <= N; i++ ) {
            Quantia = sc.nextInt();
            if(Quantia >= 1 && Quantia <= 15) {
                Tipo = sc.next();
                switch (Tipo) {
                    case "C":
                        totalC += Quantia;

                        break; 

                        case "R":
                        totalR += Quantia;
                        
                        break; 

                        case "S":
                        totalS += Quantia;
                        
                        break;
                
                    default:
                        break;
                } 
            }
        }  
        Cobaia = totalC + totalR + totalS;
        auxCobaia = Cobaia;
        porC = (totalC / auxCobaia) * 100;
        porR = (totalR / auxCobaia) * 100;
        porS = (totalS / auxCobaia) * 100;

        System.out.println("Total : " + Cobaia + " cobaias");
        System.out.println("Total coelho " + totalC);
        System.out.println("Total ratos " + totalR); 
        System.out.println("Total Sapos " + totalS);
        System.out.println("Percentual de coelhos: " + porC + "%");
        System.out.println("Percentual de ratos: " + porR + "%");
        System.out.println("Percentual de sapos: " + porS + "%");
    }
}
