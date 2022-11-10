package LPA;

public class ArrayBi {
    public static void main(String[] args) {
        int[][] matriz = new int[9][9];
        int t = 2;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random() * 9);
                System.out.print("\t"+matriz[i][j]) ;
            }
            System.out.println();
        }

    }

}
        
        
