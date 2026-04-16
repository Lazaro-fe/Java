package Loja_de_Produtos;

// package POO;

public class Loja {
    

    private String nome_produto;
    private float preco_produto;
    private int quantidade_de_produtos;

    // CONSTRUTOR
    public Loja(String nome_produto, float preco_produto, int quantidade_de_produtos) {
        this.nome_produto = nome_produto;
        this.preco_produto = preco_produto;
        this.quantidade_de_produtos = quantidade_de_produtos;
    }

    // METÓDO ACESSADOR
    public String getNome_do_produto(){
        return nome_produto;
    }

    public float getPreco_produto(){
        return preco_produto;
    }

    public int getQuantidade_de_produtos(){
        return quantidade_de_produtos;
    }

    // METÓDO MODIFICADOR
    public void setNome_do_produto(String nome_produto){
        this.nome_produto = nome_produto;
    }

    public void setPreco_produto(float preco_produto){
        this.preco_produto = preco_produto;
    }

    public void setQuantidade_de_produtos(int quantidade_de_produtos){
        this.quantidade_de_produtos = quantidade_de_produtos;
    }

}
