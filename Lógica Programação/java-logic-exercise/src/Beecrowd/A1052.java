package Beecrowd;

import java.util.Scanner;

public class A1052 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        String[] meses = {"January", "February", "March", "April","March", "June",
    "July","August", "September", "October", "November", "December"}; 

    System.out.println("Informe o numero do mes:");
    int numeroMes = sc.nextInt();

    switch (numeroMes) {
        case 1:
            System.out.println(meses[0]);
            break; 

        case 2: 
        System.out.println(meses[1]);
            break; 

            case 3: 
        System.out.println(meses[2]);
            break; 

            case 4: 
        System.out.println(meses[3]);
            break; 

            case 5: 
        System.out.println(meses[4]);
            break; 

            case 6: 
        System.out.println(meses[5]);
            break; 

            case 7: 
        System.out.println(meses[6]);
            break; 

            case 8: 
        System.out.println(meses[7]);
            break; 

            case 9: 
        System.out.println(meses[8]);
            break; 

            case 10: 
        System.out.println(meses[9]);
            break; 

            case 11: 
        System.out.println(meses[10]);
            break;
            
            case 12: 
        System.out.println(meses[11]);
            break;
    
        default:
        System.out.println("VALOR INVÁLIDO");
            break;
    }
    }
}
