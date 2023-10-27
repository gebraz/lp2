public class Ocorrencia implements Comparable<Ocorrencia> {
    private String nome;
    private int contador;
    private String ordem; //primeiro, meio, último

    public Ocorrencia(String nome, String ordem) {
        this.nome = nome;
        this.ordem = ordem;
        this.contador = 1;  //aconteceu 1 vez
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Ordem: " + ordem + " - Qtd:" + contador;
    }

    public void setContador () {
        contador++;
    }

    @Override
    public int compareTo(Ocorrencia o) {
        return nome.compareTo(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getContador() {
        return contador;
    }

    public String getOrdem() {
        return ordem;
    }


}
