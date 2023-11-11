import java.time.LocalDate;
import java.util.ArrayList;

public class Teste extends Atividade{
    protected ArrayList<String> descAtiv;


    public Teste(String descr, LocalDate dataEntre, String responsavel, boolean status, ArrayList<String> descAtiv){
        super(descr, dataEntre, responsavel, status);
        this.descAtiv = descAtiv;
    }

    public String toString() {
        String ret =  super.toString();
        ret += "\nDescricao de Atividades: \n";
        for (String a: this.descAtiv) {
            ret += a;
            ret += "\n";
        }
        return ret;
    }
}
