package br.com.senai.service;

    import br.com.senai.entity.Product;

    import java.util.ArrayList;
    import java.util.List;

public class ProductService {

    private Product produto;

    public Product cadastrarProduto(String nomeProduto, double valorProduto, int quantidadeProduto){
        produto = new Product();
        produto.nomeProduto = nomeProduto;
        produto.valor = valorProduto;
        produto.quantidade = quantidadeProduto;

        System.out.println("Nome do produto: " + produto.nomeProduto);
        System.out.println("Valor do produto: " + produto.valor);
        System.out.println("Quantidade do produto: " + produto.quantidade);

        return produto;
    }

    public List<Product> listarProduto(){
        List<Product> produtos = new ArrayList<>();
        return produtos;
    }

    public void buscarProduto(){

    }

    public void removerProduto(){

    }

}
