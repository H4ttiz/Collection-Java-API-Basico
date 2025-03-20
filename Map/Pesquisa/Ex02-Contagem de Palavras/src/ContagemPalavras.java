import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavras.isEmpty()){
            contagemPalavras.remove(palavra);
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    public int exibirContagemPalavras(){
        int contagemtotal = 0;
        if(!contagemPalavras.isEmpty()){
            for(int contagem : contagemPalavras.values()){
                contagemtotal += contagem;
            }
        }
        return contagemtotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

}



