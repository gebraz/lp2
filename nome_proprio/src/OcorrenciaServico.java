import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OcorrenciaServico {
    ArrayList<Ocorrencia> ocorrencias;

    public OcorrenciaServico() {
        ocorrencias = new ArrayList<>();
    }

    //método para inserir uma palavra qualquer
    public void inserirNovoNome(String nome, String ordem) {

        for (Ocorrencia o:ocorrencias) {
            //já existe? nome, e ordem já estão no vetor?
            if ((o.getNome().equals(nome)) && (o.getOrdem().equals(ordem))) {
                o.setContador();
                return ;
            }
        }
        Ocorrencia ocorrencia = new Ocorrencia(nome, ordem); //será usada?
        ocorrencias.add(ocorrencia);
    }

    //imprimir ocorrencia
    //filtro
    public void imprimir(String nomeFiltro, String ordemFiltro) {
        //ordenar
        Collections.sort(ocorrencias);

        //imprimir
        for (Ocorrencia o: ocorrencias) {
            //os dois
            if ((nomeFiltro != null) && (ordemFiltro != null)) {
                if ((o.getNome().contains(nomeFiltro)) && (o.getOrdem().equals(ordemFiltro))) {
                    System.out.println(o);
                }
            }
            //somente nome
            else if (ordemFiltro == null) {
                if (o.getNome().contains(nomeFiltro)) {
                    System.out.println(o);
                }
            }
            //somente ordem
            else {
                if (o.getOrdem().equals(ordemFiltro)) {
                    System.out.println(o);
                }
            }
        }
    }

    public void imprimir() {
        for (Ocorrencia o: ocorrencias)
            System.out.println(o);
    }


    //método que apresenta primeira nome em ordem
    public void ocorrenciaPrimeiroEmOrdem() {
        imprimir(null, "Primeiro");
    }

    //método que apresenta último nome em ordem
    public void ocorrenciaUltimoEmOrdem() {
        imprimir(null, "Último");
    }

    //método que busca qualquer palavra
    public void ocorrenciaBuscaEmOrdem(String palavra) {
        imprimir(palavra, null);
    }
}
