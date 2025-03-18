import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        } else {
            System.out.println("Dicionario esta vazio!");
        }
    }

    public void exibirPalavras(){
        if(!dicionario.isEmpty()){
            System.out.println(dicionario);
        } else {
            System.out.println("Dicionario esta vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String descricao = null;
        if(!dicionario.isEmpty()){
            descricao = dicionario.get(palavra);
            if (descricao == null) {
                System.out.println("Descrição não encontrada!");
            }
        } else {
            System.out.println("Dicionario esta vazio!");
        }
        return descricao;
    }

}
