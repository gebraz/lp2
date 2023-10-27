import java.util.Date;

public class Jogo {
    private String nome;
    private Date quandoComprado;
    private Date quandoConcluido;

    public Jogo (String nome, Date quandoComprado) {
        this.nome = nome;
        this.quandoComprado = quandoComprado;
        this.quandoConcluido = null;
    }

    public Jogo (String nome, Date quandoComprado, Date quandoConcluido) {
        this.nome = nome;
        this.quandoComprado = quandoComprado;
        this.quandoConcluido = quandoConcluido;
    }

    public Date getQuandoConcluido() {
        return quandoConcluido;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        //return "Nome: " + nome + "Concluído: " + ((quandoConcluido!=null) ? "Sim" : "Não");
        String resultado = "Nome: " + nome + " - Concluído: ";
        if (quandoConcluido!=null)
           resultado += "Sim";
        else
           resultado += "Não";
        return resultado;
    }
}
