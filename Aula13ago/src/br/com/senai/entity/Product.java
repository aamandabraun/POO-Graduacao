package br.com.senai.entity;

public class Product {

    //ATRIBUTOS
    public String nomeProduto;
    public Integer quantidade;
    public Double valor;

    //METODOS
    public String getNomeProduto (){
        return this.nomeProduto;
    }

    public void setNomeProduto(String nome){
        this.nomeProduto = nome;
    }

    public Integer getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(Integer qtd){
        //this.nomeProduto = nome;
    }

}
