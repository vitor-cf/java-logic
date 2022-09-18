/* 1 - Escreva um programa que, com base em uma 
temperatura em graus celsius, a converta e 
exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
 Ra = C * 1.8 + 32 + 459.67 */

 public class Temperatura {
    public static void main(String[] args) throws Exception {
        float C = 2.43f;

        float F = C * 1.8f + 32;
        float K = C + 273.15f;
        float Re = C * 0.8f;
        float Ra = C * 1.8f + 32 + 459.67f;

        System.out.println("Temperatura F: " + F );
        System.out.println("Temperatura K: " + K );
        System.out.println("Temperatura Re: " + Re );
        System.out.println("Temperatura Ra: " + Ra );


    }
}  




 





