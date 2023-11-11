import java.time.LocalDate;

public class Especificacao extends Atividade{

    protected String detalhamento;

    public Especificacao(String descr, LocalDate dataEntre, String responsavel, boolean status , String detalhamento){
        super(descr, dataEntre, responsavel, status);
        this.detalhamento = detalhamento;
    }

    @Override
    public String toString() {
        String ret = super.toString();
        ret += "\ndetalhamento: \n";
        ret += this.detalhamento;

        return ret;
    }
}
