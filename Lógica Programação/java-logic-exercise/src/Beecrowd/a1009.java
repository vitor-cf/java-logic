package Beecrowd;

import java.util.Scanner;

public class a1009 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String vendedor;
        float salFixo, totalVendas, total;
        final float COMISSAO = 0.15f;

        System.out.println("Nome do vendedor: ");
        vendedor = ent.nextLine(); 
        System.out.println("Salário Fixo: ");
        salFixo = ent.nextFloat();
        System.out.println("Total de vendas: ");
        totalVendas = ent.nextFloat();

        total = (totalVendas * COMISSAO) + salFixo;

        System.out.println("TOTAL = ");
        System.out.printf("%.2f", total);
    }
}
