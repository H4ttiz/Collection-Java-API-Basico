import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
            produtos.add(new Produto(nome, cod, preco, quantidade));
            System.out.println("Produto adicionado com sucesso!");

    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        if (produtos.isEmpty()){
            System.out.println("lista vazia!");
        }

        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ProdutoComparator());
        produtosPorPreco.addAll(produtos);
        if (produtos.isEmpty()){
            System.out.println("lista vazia!");
        }
        return produtosPorPreco;
    }
}
