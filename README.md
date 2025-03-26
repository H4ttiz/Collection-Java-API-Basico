# Coleções em Java: List, Map e Set

As coleções em Java fazem parte do pacote `java.util` e são utilizadas para armazenar e manipular dados de forma eficiente. Elas são fundamentais para o desenvolvimento em Java, pois oferecem diversas maneiras de trabalhar com grupos de objetos. Neste README, abordamos as coleções mais comuns: `List`, `Map` e `Set`.

## Índice

- List
- Map
- Set
- Conclusão

## List

A interface `List` representa uma coleção ordenada de elementos que pode conter elementos duplicados. Os elementos em uma `List` podem ser acessados por um índice, o que torna essa coleção útil quando a ordem dos elementos é importante.

### Principais implementações:
- `ArrayList`: Lista baseada em array que oferece acesso rápido aos elementos, mas pode ser lenta para inserções e remoções em posições aleatórias.
- `LinkedList`: Lista baseada em uma estrutura de dados de lista duplamente encadeada, oferecendo melhor desempenho para inserções e remoções em posições aleatórias.
- `Vector`: Uma versão mais antiga de `ArrayList`, com capacidade de crescer dinamicamente quando necessário.

## Map

A interface `Map` representa uma coleção de pares chave-valor, onde cada chave é única e mapeia para um valor. Ao contrário das coleções `List` e `Set`, o `Map` não é uma subinterface de `Collection`.

### Principais implementações:
- `HashMap`: Implementação baseada em tabela hash que oferece acesso rápido à chave e ao valor. Não garante a ordem de inserção.
- `TreeMap`: Implementação baseada em árvore que mantém as chaves ordenadas de acordo com a ordem natural ou um `Comparator` fornecido.
- `LinkedHashMap`: Uma implementação de `HashMap` que mantém a ordem de inserção dos elementos.

## Set

A interface `Set` representa uma coleção de elementos que não permitem duplicatas. Embora não garanta a ordem dos elementos, algumas implementações, como `LinkedHashSet`, mantêm a ordem de inserção.

### Principais implementações:
- `HashSet`: Implementação baseada em tabela hash que não garante a ordem dos elementos.
- `LinkedHashSet`: Similar ao `HashSet`, mas mantém a ordem de inserção.
- `TreeSet`: Implementação de `Set` baseada em árvore que mantém os elementos ordenados.

## Conclusão

As coleções em Java são essenciais para trabalhar com dados de maneira eficiente. A escolha entre `List`, `Map` e `Set` depende das necessidades específicas do seu projeto:

- **List** é útil quando a ordem dos elementos e a possibilidade de duplicados são importantes.
- **Map** é ideal quando você precisa associar chaves a valores.
- **Set** é a escolha certa quando você precisa garantir que os elementos não se repitam.

Compreender como usar corretamente essas coleções é fundamental para escrever código eficiente e flexível.

## Autor 
<table>
  <tr>
    <td>
      <img width="80px" align="center" src="https://avatars.githubusercontent.com/H4ttiz"/>
    </td>
    <td align="left">
      <a href="https://github.com/H4ttiz">
        <span><b>Leonardo Bezerra da Silva</b></span>
      </a>
      <br>
      <span>Desenvolvedor Back-end</span>
    </td>
  </tr>
</table>
