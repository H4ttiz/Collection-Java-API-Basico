import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        if (contatos.add(contato)) {
            System.out.println("Contato adicionado com sucesso!");
        } else {
            System.out.println("Contato já existe.");
        }
    }

    public void exibirContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (Contato c : contatos) {
                System.out.println(c);
            }
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> encontrados = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().toLowerCase().contains(nome.toLowerCase())) {
                encontrados.add(c);
            }
        }
        return encontrados.isEmpty() ? Set.of() : encontrados;
    }

    public String atualizarNumeroContato(String nome, String novoNumero) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                return "Número atualizado com sucesso!";
            }
        }
        return "Contato não encontrado.";
    }
}
