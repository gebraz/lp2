import java.time.LocalDate;

public abstract class Atividade implements Comparable<Atividade> {

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public LocalDate getDataEntre() {
        return dataEntre;
    }

    public void setDataEntre(LocalDate dataEntre) {
        this.dataEntre = dataEntre;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Atividade(String descr, LocalDate dataEntre, String responsavel, boolean status) {
        this.descr = descr;
        this.dataEntre = dataEntre;
        this.responsavel = responsavel;
        this.status = status;
    }

    protected String descr;
    protected LocalDate dataEntre;
    protected String responsavel;
     protected boolean status;

     @Override
     public String toString(){
         String ret = "";
         ret += "Descrição: ";
         ret += this.descr;
         ret += "\nData de Entrega: ";
         ret += this.dataEntre.toString();
         ret += "\nResponsavel: ";
         ret += this.responsavel;
         ret += "\nStatus: ";
         ret += this.status ? "Concluido" : "Não Concluido";

         return ret;
     }

    @Override
    public int compareTo(Atividade at) {
//        return this.dataEntre.compareTo(at.dataEntre);

        if (this.dataEntre.isAfter(at.dataEntre)){
            return 1;
        } else if (this.dataEntre.isBefore(at.dataEntre)) {
            return -1;
        }else {
            return 0;
        }
    }
}
