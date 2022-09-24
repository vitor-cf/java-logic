package Beecrowd;

import java.util.Scanner;

import org.omg.PortableServer.CurrentPackage.NoContextHelper;

public class A1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       

       System.out.println("Informe vertebrado ou invertebrado");
       String tipo = sc.nextLine(), tipo2 = sc.nextLine(), tipo3 = sc.nextLine();
       
       
       if(tipo.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("carnivoro")) {
           System.out.println("aguia");

       } else if (tipo.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("onivoro")) {
            System.out.println("pomba");
       } else if (tipo.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")) {
            System.out.println("homem");
       } else if (tipo.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")) {
            System.out.println("vaca");
       } else if (tipo.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofago")) {
        System.out.println("pulga");
       } else if (tipo.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbivoro"))  {
        System.out.println("lagarta");
       } else if (tipo.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")) {
        System.out.println("sanguessuga");
       } else if (tipo.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")) {
        System.out.println("minhoca");
       }

    }   

} 