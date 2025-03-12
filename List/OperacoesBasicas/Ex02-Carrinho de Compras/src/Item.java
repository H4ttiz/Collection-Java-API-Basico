public class Item {

    private String nome;

    private Double preco;

    private int quantidade;

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override // reescreve o valor/traduz, trasfornando no formato abaixo
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + quantidade +
                '}';
    }
}
