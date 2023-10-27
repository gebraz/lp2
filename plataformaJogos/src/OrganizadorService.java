import javax.swing.*;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class OrganizadorService {

    private ArrayList<Plataforma> plataformas;

    public OrganizadorService() {
        plataformas = new ArrayList<>();
    }

    //adiciona plataforma
    public void adicionarPlataforma(String nome) {
        plataformas.add(new Plataforma(nome.toUpperCase()));
    }

    //jogo na plataforma
    public void adicionarJogo(String nomePlaforma, String nomeJogo,
                              Date dataCompra, Date dataConclusao) {
        for (Plataforma p : plataformas)
            if (p.getNome().equals(nomePlaforma.toUpperCase())) {
                p.adicionarJogo(new Jogo(nomeJogo, dataCompra, dataConclusao));
                return;
            }
        System.out.println("Plataforma " + nomePlaforma + " não existe!");
    }

    //quantidade total de jogos por plataforma
    public void qtdJogosPorPlataforma() {
        for (Plataforma p : plataformas)
            System.out.println("Plataforma: " + p.getNome() + " - Qtd Jogos: " + p.getContagemJogos());
    }

    // quais jogos estão incompletos por plataforma
    public void qtdJogosIncompletos() {
        for (Plataforma p : plataformas)
            System.out.println("Plataforma: " + p.getNome() + " - Qtd Jogos Incompletos: " + p.qtdIncompletos());
    }

    //filtra jogos nas plataformas
    public void filtrarJogosPlataforma(String palavra) {
        for (Plataforma p:plataformas) {
            System.out.println("Plataforma: " + p.getNome());
            //Suave
            ArrayList<Jogo> resultados = p.buscarJogo(palavra);
            if (resultados.size() > 0)
                for (Jogo j : p.buscarJogo(palavra))
                    System.out.println(j);
            else
                System.out.println("Não existem jogos com a palavra na plataforma");

            /* Bruto
            for (Jogo j: p.buscarJogo(palavra))
                System.out.println(j);
            */
        }
    }
}
