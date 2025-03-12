import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        if(!palavrasUnicas.contains(palavra)){
            this.palavrasUnicas.add(palavra);
            System.out.println("Palavra adicionada com sucesso!");
        }else {
            System.out.println("Palavra ja presente no Conjunto!");
        }

    }

    public void removerPalavra(String palavra){
        if(!palavrasUnicas.isEmpty()){
            if(palavrasUnicas.contains(palavra)){
                palavrasUnicas.remove(palavra);
                System.out.println("Palavra removida com sucesso!");
            }else{
                System.out.println("Palavra náo encontrada");
            }
        }else {
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicas.isEmpty()){
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("O conjunto esta vazio ");
        }
    }
}
