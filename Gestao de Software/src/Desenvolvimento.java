import java.time.LocalDate;

public class Desenvolvimento  extends  Atividade{

    protected String codigo;

    public Desenvolvimento(String descr, LocalDate dataEntre, String responsavel, boolean status , String codigo){
        super(descr, dataEntre, responsavel, status);
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        String ret = super.toString();
        ret += "\nCodigo: \n";
        ret += this.codigo;

        return ret;
    }
}
