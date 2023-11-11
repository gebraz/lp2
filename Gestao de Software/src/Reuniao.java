import java.time.LocalDate;
import java.util.ArrayList;

public class Reuniao extends Atividade{

    protected ArrayList<String> participantes;


    public Reuniao(String descr, LocalDate dataEntre, String responsavel, boolean status, ArrayList<String> participantes){
        super(descr, dataEntre, responsavel, status);
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        String ret =  super.toString();
        ret += "\nParticipantes: \n";
        for (String p: this.participantes) {
            ret += p;
            ret += "\n";
        }
        return ret;
    }
}
