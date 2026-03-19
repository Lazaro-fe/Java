public class Carro {
    
    private String nome_carro;
    private String modelo_carro;
    private int ano_de_fabricacao;

    public Carro(String nome_carro, String modelo_carro, int ano_de_fabricacao) {
        this.nome_carro = nome_carro;
        this.modelo_carro = modelo_carro;
        this.ano_de_fabricacao = ano_de_fabricacao;
    }

    // METÓDO ACESSADOR
    public String getNome_de_carro(){
        return nome_carro;
    }

    public String getModelo_do_carro(){
        return modelo_carro;
    }

    public int getAno_de_fabricacao(){
        return ano_de_fabricacao;
    }

    // METÓDO MODIFICADOR
    public void setNome_de_carro(String nome_carro){
        this.nome_carro = nome_carro;
    }

    public void setModelo_de_carro(String modelo_carro){
        this.modelo_carro = modelo_carro;
    }

    public void setAno_de_fabricacao(int ano_de_fabricacao){
        this.ano_de_fabricacao = ano_de_fabricacao;
    }
}
