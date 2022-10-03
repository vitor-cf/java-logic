package Beecrowd;

import java.util.*;
public class A1061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaI, diaF, hhI, hhF, minI, minF, segI, segF;

        System.out.println("Informe dia inicio e fim:");
        

        diaI = sc.nextInt();
        diaF = sc.nextInt(); 

        System.out.println("Informe hora inicial e final:");

        hhI = sc.nextInt();
        hhF = sc.nextInt();

        System.out.println("Informe minuto inicial e final:");

        minI = sc.nextInt();
        minF = sc.nextInt(); 



        System.out.println("Informe segundo inicial e final:");

        segI = sc.nextInt();
        segF = sc.nextInt();

        System.out.println("DIA INICIAL: " + "\nDia " + diaI + "\n" + hhI + " : " + minI + " : " + segI + 
        "\nDIA FINAL: " + "\nDia " + diaF + "\n" + hhF + " : " + minF + " : " + segF); 

        int diaRes = diaF - diaI; 
        int horaRes = hhF - hhI;
        int minRes = minF - minI;
        int segRes = segF - segI;

        if (minRes != 0 ) {
            int newDiaRes = diaRes - 1;
            
            if (horaRes != 0) {
                int newHoraRes = 24 + horaRes;
                System.out.println("SAÍDA: " + "\n");
                System.out.println(newDiaRes + " dias (s)" + 
                "\n" + newHoraRes + " hora (s)" + 
                "\n" + minRes + " minuto (s)" + 
                "\n" + segRes + " segundo(s)");
            } 
        } else if (minRes == 0 && segRes == 0) {
            System.out.println("SAÍDA: " + "\n");
            System.out.println(diaRes + " dias (s)" + 
            "\n" + horaRes + " hora (s)" + 
            "\n" + minRes + " minuto (s)" + 
            "\n" + segRes + " segundo(s)");
        }
        
    }
}
        
