import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaTarefas {

    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionaTarefa(String descricao) {
        if (!listaTarefas.contains(descricao)) {
            listaTarefas.add(new Tarefa(descricao));
            System.out.println("Tarefa adicionada com sucesso!");
        } else {
            System.out.println("Tarefa ja foi adicionada anteriormente!");
        }

    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = t;
                    break;
                }
            }
            listaTarefas.remove(tarefaRemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public int contarTarefas(){
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!listaTarefas.isEmpty()){
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluida(true);
                    System.out.println("Tarefa concluida com sucesso!");
                }else {
                    System.out.println("Tarefa não encontrada na lista!");
                }
            }
        }else{
            System.out.println("A lista esta vazia!");
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
                System.out.println("Tarefa esta pendente!");
            }else {
                System.out.println("Essa tarefa ja esta pendente!");
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if(listaTarefas.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            listaTarefas.clear();
        }
    }
}
