import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        final int SENHA = 9999, CODIGO = 1234;
        int codigo, senha;
        Scanner ent = new Scanner(System.in); 

        System.out.println("Informe o codigo: ");
        codigo = ent.nextInt();
        System.out.println("Informe a senha: ");
        senha = ent.nextInt();

        if (codigo != SENHA && senha != SENHA) {
            for (int i = 0; i < 5; i++) { 
                System.out.println("Dados incorrentos! Tente novamente!");
                System.out.println("Informe o codigo: ");
                codigo = ent.nextInt(); 
                System.out.println("Informe a senha: ");
                senha = ent.nextInt();
            } 
        } else {
            System.out.println("Acesso permitido!");
        }

        
            
        }
    }

