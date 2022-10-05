package LPA;

public class P26 {
    public static void main(String[] args) {
        int ano = 1900;

        System.out.println("Usando o for: " + "\n");
        for (; ano <= 2032; ano++) {
            if ((ano % 4 == 0 && ano % 100 !=0) || ano % 400 == 0) {
                System.out.println(ano);
            }
        } 
        System.out.println("Usando o do/while: " + "\n");
        do {
            ano--;
            if ((ano % 4 == 0 && ano % 100 !=0) || ano % 400 == 0) {
                System.out.println(ano);
            }
        } while (ano >= 1900); 

        System.out.println("Usando o while: " + "\n");
        
        while (ano <= 2032) {
            ano++;
            if ((ano % 4 == 0 && ano % 100 !=0) || ano % 400 == 0) {
                System.out.println(ano);
            }
        }
    }
}
