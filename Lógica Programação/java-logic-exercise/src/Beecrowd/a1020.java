package Beecrowd;

import java.util.Scanner;

public class a1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int idade, anos, meses, dias;

        System.out.println("Informe sua idade em dias:");
        idade = sc.nextInt();

        anos = idade / 365;
        meses = (idade - (anos * 365)) / 30; 
        dias = (idade - (anos * 365) - (meses * 30));
        System.out.println(anos + " ano (s)" + "\n" + meses + " mes (es)" + "\n" + dias + " dia (s)");
    }
}
       

        
