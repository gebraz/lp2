import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Control {

    protected Scanner sc;
    protected ArrayList<Atividade> atividades;
    public Control(){
        this.sc = new Scanner(System.in);
        this.atividades = new ArrayList<Atividade>();
    }

    public Desenvolvimento createDesenvolvimento(){
        System.out.println("Informe a descrição:");
        String desc = this.sc.nextLine();
        System.out.println("Informe a data de entrega: (AAAA-MM-DD)");
        String dataStr = this.sc.nextLine();
        LocalDate dataent = LocalDate.parse(dataStr);
        System.out.println("Informe o responsavel:");
        String resp = this.sc.nextLine();
        System.out.println("Informe o status: (1 - Concluido | 0 - Nao Concluido)");
        int statusInt = this.sc.nextInt();
        boolean status = statusInt == 1;
        this.sc.nextLine();

        System.out.println("Informe o codigo:");
        String codigo = this.sc.nextLine();

        return new Desenvolvimento(desc, dataent, resp, status, codigo);
    }

    public Bug createBug(){
        System.out.println("Informe a descrição:");
        String desc = this.sc.nextLine();
        System.out.println("Informe a data de entrega: (AAAA-MM-DD)");
        String dataStr = this.sc.nextLine();
        LocalDate dataent = LocalDate.parse(dataStr);
        System.out.println("Informe o responsavel:");
        String resp = this.sc.nextLine();
        System.out.println("Informe o status: (1 - Concluido | 0 - Nao Concluido)");
        int statusInt = this.sc.nextInt();
        boolean status = statusInt == 1;
        this.sc.nextLine();

        System.out.println("Informe o local:");
        String local = this.sc.nextLine();

        return new Bug(desc, dataent, resp, status, local);
    }

    public Especificacao createEspecificacao(){
        System.out.println("Informe a descrição:");
        String desc = this.sc.nextLine();
        System.out.println("Informe a data de entrega: (AAAA-MM-DD)");
        String dataStr = this.sc.nextLine();
        LocalDate dataent = LocalDate.parse(dataStr);
        System.out.println("Informe o responsavel:");
        String resp = this.sc.nextLine();
        System.out.println("Informe o status: (1 - Concluido | 0 - Nao Concluido)");
        int statusInt = this.sc.nextInt();
        boolean status = statusInt == 1;
        this.sc.nextLine();

        System.out.println("Informe o detalhamento:");
        String detalhamento = this.sc.nextLine();

        return new Especificacao(desc, dataent, resp, status, detalhamento);
    }

    public Reuniao createReuniao(){
        System.out.println("Informe a descrição:");
        String desc = this.sc.nextLine();
        System.out.println("Informe a data de entrega: (AAAA-MM-DD)");
        String dataStr = this.sc.nextLine();
        LocalDate dataent = LocalDate.parse(dataStr);
        System.out.println("Informe o responsavel:");
        String resp = this.sc.nextLine();
        System.out.println("Informe o status: (1 - Concluido | 0 - Nao Concluido)");
        int statusInt = this.sc.nextInt();
        boolean status = statusInt == 1;
        this.sc.nextLine();

        ArrayList<String> part = new ArrayList<String>();
        int addNew = 1;
        while(addNew != 0){
            System.out.println("Informe o participante:");
            String p = this.sc.nextLine();
            part.add(p);
            System.out.println("Adicionar novo participante? (1 - Sim | 0 - Nao)");
            addNew = this.sc.nextInt();
            this.sc.nextLine();
        }


        return new Reuniao(desc, dataent, resp, status, part);
    }


    public Teste createTeste(){
        System.out.println("Informe a descrição:");
        String desc = this.sc.nextLine();
        System.out.println("Informe a data de entrega: (AAAA-MM-DD)");
        String dataStr = this.sc.nextLine();
        LocalDate dataent = LocalDate.parse(dataStr);
        System.out.println("Informe o responsavel:");
        String resp = this.sc.nextLine();
        System.out.println("Informe o status: (1 - Concluido | 0 - Nao Concluido)");
        int statusInt = this.sc.nextInt();
        boolean status = statusInt == 1;
        this.sc.nextLine();

        ArrayList<String> acoes = new ArrayList<String>();
        int addNew = 1;
        while(addNew != 0){
            System.out.println("Informe a descricao da acao:");
            String a = this.sc.nextLine();
            acoes.add(a);
            System.out.println("Adicionar nova acao? (1 - Sim | 0 - Nao)");
            addNew = this.sc.nextInt();
            this.sc.nextLine();
        }


        return new Teste(desc, dataent, resp, status, acoes);
    }
    public void menu(){
        int opt;
        do {
            System.out.println("Selecione uma opcao:");
            System.out.println("1 - Adicionar atividade ");
            System.out.println("2 - Listar todas as atividades");
            System.out.println("0 - Sair");
            opt = this.sc.nextInt();
            this.sc.nextLine();

            switch (opt){
                case 1:
                    this.addAtividade();
                    break;
                case 2:
                    this.listarAtividades();
                    break;
            }



        }while (opt != 0);
    }

    public void addAtividade(){
        int opt = 1;

        while (opt != 0){


            System.out.println("Selecione uma atividade para adicionar");
            System.out.println("1 - Desenvolvimento");
            System.out.println("2 - Reuniao");
            System.out.println("3 - Especificacao");
            System.out.println("4 - Teste");
            System.out.println("5 - Bug");


            int optAtv = this.sc.nextInt();
            this.sc.nextLine();
            Atividade at;

            switch (optAtv){
                case 1:
                    at = this.createDesenvolvimento();
                    this.atividades.add(at);
                    break;
                case 2:
                    at = this.createReuniao();
                    this.atividades.add(at);
                    break;
                case 3:
                    at = this.createEspecificacao();
                    this.atividades.add(at);
                    break;
                case 4:
                    at = this.createTeste();
                    this.atividades.add(at);
                    break;
                case 5:
                    at = this.createBug();
                    this.atividades.add(at);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

            System.out.println("Deseja adicionar nova atividade (1 - Sim | 0 - Nao)");

            opt = this.sc.nextInt();
            this.sc.nextLine();
        }
    }

    public void listarAtividades(){
        Collections.sort(this.atividades);
        for (Atividade a: this.atividades) {
            if (a.isStatus())
                continue;

            String type = a.getClass().getName();
            System.out.println("Atividade " + type +" Cadastrada:\n");
            System.out.println(a.toString());
        }
    }
}
