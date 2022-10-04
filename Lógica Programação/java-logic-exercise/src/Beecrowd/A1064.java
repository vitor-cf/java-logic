 package Beecrowd;

 import java.util.*;
 public class A1064 {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		double x,y,conta;
		String operator;
		String Saida;
        
		System.out.println("Informe os dois valores desejados");
		x= sc.nextDouble();
		y= sc.nextDouble();

		System.out.println("Escolha a operação que deseja realizar:\n" + "a)Soma\n"+ "b)Subtração\n" + "c)Multiplicação\n"+ "d)Divisão");
		
		operator=sc.next();
		
		while(operator.equals("a") == false &&  operator.equals("b") == false && operator.equals("c") == false  && operator.equals("d") == false) {
		
			System.out.println("Escolha a operação que deseja realizar:\n" + "a)Soma\n"+ "b)Subtração\n" + "c)Multiplicação\n"+ "d)Divisão");
			
			operator=sc.next();
			}
			
			switch (operator) {
		case "a":
			System.out.println("Operação solicitada Soma\n");
			 conta= x+y;
			System.out.println("Resultado da sua operação foi " + conta);
			break;
		case "b":
			System.out.println("Operação selecionada Subtração\n");
			conta= x-y;
			System.out.println("Resultado da sua operação foi " + conta);
			break;

		case "c":
			System.out.println("Operação selecionada foi Multiplicação\n");
			conta= x*y;
			System.out.println("Resultado da sua operação foi "+ conta);
	break;

		case "d":
			System.out.println("Operação selecionada foi a Divisão\n");
			conta= x/y;
			System.out.println("Resultado da sua operação foi "+ conta);
	
	break;
		

		default: System.out.println("Alternativa inserida não existe/n");
		
			break;
		}
        }
            
    }
                 

 
     
 
