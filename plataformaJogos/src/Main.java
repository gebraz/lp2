import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrganizadorService organizador = new OrganizadorService();
        //pré-cadastro das plataformas
        organizador.adicionarPlataforma("PS");
        organizador.adicionarPlataforma("PC");
        organizador.adicionarPlataforma("XBOX");
        organizador.adicionarPlataforma("NINTENDO");

        int opcaoMenu = 10;
        Scanner entrada = new Scanner(System.in);
        while (opcaoMenu != 0) {
            System.out.println("1: Cadastrar novo jogo\n" +
                                "2: Consulta jogo\n" +
                                "3: Imprimir estatísticas\n" +
                                "0: Sair");
            opcaoMenu = entrada.nextInt(); //verificar flush
            entrada.nextLine(); //para remover o enter (\n) que ficou no fim da linha

            switch (opcaoMenu) {
                //cadastrar jogo
                case 1:
                    System.out.println("Informar nome do Jogo:");
                    String nome = entrada.nextLine();

                    System.out.println("Informar plataforma do Jogo:");
                    String plataforma = entrada.nextLine();

                    System.out.println("Informar data compra (dd/MM/yyyy):");
                    String dataCompra = entrada.nextLine(); //string formato de data dd/MM/yyyy
                    Date dtCompra = new Date(dataCompra);

                    Date dtConclusao=null;
                    System.out.println("Informar data conclusão (dd/MM/yyyy):");
                    String dataConclusao = entrada.nextLine(); //string formato de data dd/MM/yyyy
                    if (!dataConclusao.trim().equals(""))
                        dtConclusao = new Date(dataConclusao);

                    organizador.adicionarJogo(plataforma, nome, dtCompra, dtConclusao);
                    break;

               //consultar jogo
                case 2:
                    System.out.println("Informe uma busca: ");
                    String palavra = entrada.nextLine();
                    organizador.filtrarJogosPlataforma(palavra);
                    break;

                //imprimir estatísticas
                case 3:
                    System.out.println("Quantidade de jogos por plataforma:");
                    organizador.qtdJogosPorPlataforma();
                    System.out.println("Quantidade de jogos incompletos:");
                    organizador.qtdJogosIncompletos();
                    break;
            }
        }


    }
}
