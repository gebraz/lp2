import java.util.ArrayList;

public class Plataforma {
    private String nome;
    private ArrayList<Jogo> jogos;

    public Plataforma(String nome) {
        this.nome = nome.toUpperCase();
        jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    //filtrar jogo por nome
    public ArrayList<Jogo> buscarJogo(String nome) {
        ArrayList<Jogo> resultados = new ArrayList<>();
        for (Jogo j:jogos) {
            if (j.getNome().contains(nome))
                resultados.add(j);
        }
        return resultados;
    }

    public String getNome(){
        return nome;
    }


    //contagem de jogos
    public int getContagemJogos() {
        return jogos.size();
    }

    //contagem de jogos incompletos
    public int qtdIncompletos() {
        int contador = 0;
        for (Jogo j:jogos)
            if (j.getQuandoConcluido() == null)
                contador++;

        return contador;
    }

}
