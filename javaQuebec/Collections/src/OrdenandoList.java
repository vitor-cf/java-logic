import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class OrdenandoList {


    /* Dadas as seguintes informações sobre meus gatos, crie uma lista
     * e ordene esta lista exibindo:
     * (nome - idade - cor);  
     * Gato 1 = nome: Jon, idade: 18, cor: preto
     * Gato 2 = nome: Simba, idade: 6, cor: tigrado
     * Gato 3 = nome: Malvado, idade: 12, cor: amarelo
     */
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Malvado", 12, "amarelo"));

        }};

        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusGatos);  

        System.out.println("---\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos); 
        
        System.out.println("---\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Idade\t---");
        Collections.sort(meusGatos,new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());

    } 


} 

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor; 

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }  

    public String getNome() {
        return nome;
    } 

    public Integer getIdade() {
        return idade;
    } 

    public String getCor() {
        return cor;
    } 

    public String toString() {
        return "{" + 
        "nome='" + nome + '\'' + 
        ", idade=" + idade +
        ", cor='" + cor + '\'' + '}';
    } 

    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}


class ComparatorIdade implements Comparator<Gato> {
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}