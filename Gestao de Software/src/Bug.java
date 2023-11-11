import java.time.LocalDate;

public class Bug extends Atividade{

    protected String local;

    public Bug(String descr, LocalDate dataEntre, String responsavel, boolean status , String local){
        super(descr, dataEntre, responsavel, status);
        this.local = local;
    }

    @Override
    public String toString() {
        String ret = super.toString();
        ret += "\nLocal: ";
        ret += this.local;

        return ret;
    }
}
