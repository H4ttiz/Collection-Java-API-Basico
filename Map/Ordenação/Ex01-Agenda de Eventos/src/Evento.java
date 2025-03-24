public class Evento {

    private String nomeDoEvento;

    private String atracao;

    public Evento(String nomeDoEvento, String atracao) {
        this.nomeDoEvento = nomeDoEvento;
        this.atracao = atracao;
    }

    public String getAtracao() {
        return atracao;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }


}
