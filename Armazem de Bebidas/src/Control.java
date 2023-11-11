import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Control {

    protected ArrayList<Venda> vendas;
    protected ArrayList<Bebida> bebidas;
    protected ArrayList<Fornecedor> fornecedores;

    protected Scanner sc;
    public Control(){
        this.sc = new Scanner(System.in);
        this.vendas = new ArrayList<Venda>();
        this.bebidas = new ArrayList<Bebida>();
        this.fornecedores = new ArrayList<Fornecedor>();
    }




    public void cadastrarBebida(){

        System.out.println("Selecione o tipo da bebida");
        System.out.println("1 - Refrigerante");
        System.out.println("2 - Suco");
        System.out.println("3 - Alcoolico");
        System.out.println("4 - Agua");
        int type = this.sc.nextInt();
        this.sc.nextLine();

        System.out.println("Segue a lista de fornecedores ");
        this.listarFornecedores();
        System.out.println("Informe o fornecedor (nº):");
        int indexForn = this.sc.nextInt();
        this.sc.nextLine();

        System.out.println("Informe o nome da bebida");
        String nome = this.sc.nextLine();

        System.out.println("Informe a quantidade em estoque:");
        int quant = this.sc.nextInt();
        this.sc.nextLine();

        System.out.println("Informe o valor da bebida:");
        double val = this.sc.nextDouble();
        this.sc.nextLine();
        Bebida prod = null;

        switch (type) {
            case 1:
                prod = new Refrigerante(fornecedores.get(indexForn), nome, quant, val);
                this.bebidas.add(prod);
                break;
            case 2:
                prod = new Suco(fornecedores.get(indexForn), nome, quant, val);
                this.bebidas.add(prod);
                break;
            case 3:
                prod = new Alcoolicas(fornecedores.get(indexForn), nome, quant, val);
                this.bebidas.add(prod);
                break;
            case 4:
                prod = new Agua(fornecedores.get(indexForn), nome, quant, val);
                this.bebidas.add(prod);
                break;
        }
    }

    public void cadastroFornecedor(){
        System.out.println("Informe o nome do fornecedor");

        String nome = this.sc.nextLine();

        this.fornecedores.add(new Fornecedor(nome));

    }


    public void listarBebidas(){
        for (int i = 0; i < this.bebidas.size(); i++){
            System.out.println(i + " - " + this.bebidas.get(i).toString());
        }
    }

    public void listarFornecedores(){
        for (int i = 0; i < this.fornecedores.size(); i++){
            System.out.println(i + " - " + this.fornecedores.get(i).getNome());
        }
    }

    public void listaVendas(){
        for (int i = 0; i < this.vendas.size(); i++){
            System.out.println(i + " - " + this.vendas.get(i).getProduto().getNome() + " | " + this.vendas.get(i).getQuant());
        }
    }

    public void cadastrarVenda(){
        System.out.println("Segue a lista de bebidas disponiveis ");
        this.listarBebidas();
        System.out.println("Informe a bebida (nº):");
        int indexB = this.sc.nextInt();
        this.sc.nextLine();


        System.out.println("Informe a quantidade desejada:");
        int quant = this.sc.nextInt();
        this.sc.nextLine();

        if (this.bebidas.get(indexB).getEstoque() < quant){
            System.out.println("Estoque insuficiente");
            return;
        }

        Bebida b = this.bebidas.get(indexB);

        Venda v = new Venda(b, quant);
        b.setEstoque( b.getEstoque() - quant);

        this.vendas.add(v);

    }

    public void inclusaoEstoque(){
        System.out.println("Segue a lista de bebidas disponiveis ");
        this.listarBebidas();
        System.out.println("Informe a bebida (nº):");
        int indexB = this.sc.nextInt();
        this.sc.nextLine();


        System.out.println("Informe a quantidade a adicionar:");
        int quant = this.sc.nextInt();
        this.sc.nextLine();

        Bebida b = this.bebidas.get(indexB);
        b.setEstoque( b.getEstoque() + quant);
    }




    public void menu(){
        int opt;
        do {
            System.out.println("Selecione uma opcao:");
            System.out.println("1 - Cadastrar bebida ");
            System.out.println("2 - Listar todas as bebidas");
            System.out.println("3 - Cadastrar Fornnecedor");
            System.out.println("4 - Listar Fornecedores");
            System.out.println("5 - Realizar venda");
            System.out.println("6 - Lista Vendas");
            System.out.println("0 - Sair");
            opt = this.sc.nextInt();
            this.sc.nextLine();

            switch (opt){
                case 1:
                    this.cadastrarBebida();
                    break;
                case 2:
                    this.listarBebidas();
                    break;
                case 3:
                    this.cadastroFornecedor();
                    break;
                case 4:
                    this.listarFornecedores();
                    break;
                case 5:
                    this.cadastrarVenda();
                    break;
                case 6:
                    this.listaVendas();
                    break;

            }



        }while (opt != 0);
    }
}
