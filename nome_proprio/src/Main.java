import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String nomeCompleto = "";
        Scanner entrada = new Scanner(System.in);
        OcorrenciaServico servico = new OcorrenciaServico();

        System.out.println("Informar os nomes: ");

        while (!nomeCompleto.equals("sair")) {
            nomeCompleto = entrada.nextLine();

            if (nomeCompleto.equals("sair")) continue;

            //dividir
            String nomes[] = nomeCompleto.split(" ");  //lembre-se que a string pode estar vazia
            String ordem;
            if (nomes!=null) {
                for (int i=0; i<nomes.length; i++) {
                    if (i==0)
                        ordem="Primeiro";
                    else if (i==nomes.length-1)
                            ordem="Último";
                         else
                             ordem = "meio";

                    servico.inserirNovoNome(nomes[i], ordem);
                }
            }
            /*
            StringTokenizer tokenizer = new StringTokenizer(nomeCompleto, " ,;|");
            System.out.println("Nomes digitados:");
            while (tokenizer.hasMoreTokens()) {
                System.out.println(tokenizer.nextToken());
            }
            */
        }
        System.out.println("letra (a)");
        servico.ocorrenciaPrimeiroEmOrdem();
        System.out.println("letra (b)");
        servico.ocorrenciaUltimoEmOrdem();
        System.out.println("letra (c)");
        System.out.println("Informe a palavra: ");
        String palavra = entrada.nextLine();
        servico.ocorrenciaBuscaEmOrdem(palavra);
    }
}
