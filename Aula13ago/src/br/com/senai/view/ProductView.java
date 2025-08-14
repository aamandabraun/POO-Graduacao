package br.com.senai.view;

import br.com.senai.service.ProductService;

import java.util.Scanner;

public class ProductView {

    private Scanner tec;
    private boolean exec = true;
    private ProductService productService;

    public void menu(){
        tec = new Scanner(System.in);
        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produto");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Editar produto");
            System.out.println("9 - Encerrar o sistema");

            System.out.print("Informe a opção desejada: ");
            executarMetodo(tec.nextInt());

        }while(this.exec);
    }

    private void executarMetodo(int opcao){
        productService = new ProductService();
        switch (opcao){

            case 1:
                String nomeProduto;
                Double valorProduto;
                int quantidadeProduto;

                System.out.println("Informe o nome do produto: ");
                tec.nextLine();
                nomeProduto = tec.nextLine();
                System.out.println("Informe o valor do produto: ");
                valorProduto = tec.nextDouble();
                System.out.println("Informe a quantidade do produto: ");
                quantidadeProduto = tec.nextInt();

                productService.cadastrarProduto(nomeProduto, valorProduto, quantidadeProduto);
                break;

            case 2:
                productService.listarProduto();
                break;

            case 3:
                productService.buscarProduto();
                break;

            case 4:
                productService.removerProduto();
                break;

            case 5:
                //productService.editarProduto();
                break;

            case 9:
                this.exec = false;
                System.out.println("Sistema finalizado");
                break;

            default:
                System.out.println("Opção inválida!");
                break;

        }
    }
}
