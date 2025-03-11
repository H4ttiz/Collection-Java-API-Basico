import java.util.ArrayList;

import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade); // cria um novo objeto com os atributos nescesario

        this.itemList.add(item); // adiciona o objeto a list
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>(); // cria uma nova arrayList chamada itensParaRemover
        if (!itemList.isEmpty()) {    // Pega o valor da list itemList caso estaja vazia retorna verdadeiro se não retorna falso (Porem como estamos usando o
                                      // sinal de negação vazia retorna falso e se tem algum item retorna verdadeiro entrando na condicional)
            for (Item i : itemList) { // um for que percorre por toda a list
                if (i.getNome().equalsIgnoreCase(nome)) { // compara o nome digitado com o nome presente na list
                    itensParaRemover.add(i); // adiciona o item a list para remover
                }
            }
            itemList.removeAll(itensParaRemover); //remove tudo oque tem de igual na list itemList
        } else {
            System.out.println("A lista está vazia!"); // caso seje falso significa que a lista esta vazia
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {         // Pega o valor da list itemList caso estaja vazia retorna verdadeiro se não retorna falso (Porem como estamos usando o
                                           // sinal de negação vazia retorna falso e se tem algum item retorna verdadeiro entrando na condicional)
            for (Item item : itemList) {   // um for que percorre por toda a list
                double valorItem = item.getPreco() * item.getQuantidade(); // multiplica o preço do item com a quantidade dele e depois adiciona ao preço total
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal; // retorna o preço total
        } else {
            throw new RuntimeException("A lista está vazia!");// caso seje falso significa que a lista esta vazia
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {   // Pega o valor da list itemList caso estaja vazia retorna verdadeiro se não retorna falso (Porem como estamos usando o
                                     // sinal de negação vazia retorna falso e se tem algum item retorna verdadeiro entrando na condicional)
            System.out.println(this.itemList); // printa os itens
        } else {
            System.out.println("A lista está vazia!"); // caso seje falso significa que a lista esta vazia
        }
    }

    @Override // reescreve o valor/traduz da list, trasfornando no formato abaixo
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itemList +
                '}';
    }

    public static void main(String[] args) { // testa o codigo
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
