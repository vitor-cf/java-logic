package Exceções;

public class FormatadorCedExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócios");   
        }
           
        
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
        // simulando um cep formatado
        return "23.765-064";
    }
}
