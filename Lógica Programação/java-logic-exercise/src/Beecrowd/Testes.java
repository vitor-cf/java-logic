package Beecrowd; 

public class Testes {
    public static void main(String[] args) {
        int[] arrayNum = {87, 68, 52, 5, 49};
        int total = 0; 

        for(int i : arrayNum) {
            total+= i;
        }
            
        System.out.println(total);
    }
}
