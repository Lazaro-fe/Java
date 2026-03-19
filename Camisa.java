public class Camisa {
    
    private String cor;
    private String tamanho;
    private String tipo;

    // CONSTRUTOR
    public Camisa(String cor, String tamanho, String tipo) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    // METÓDO ACESSADOR
    public String getCor_da_camisa(){
        return cor;
    }

    public String getTamanho_da_camisa(){
        return tamanho;
    }

    public String getTipo_da_Camisa(){
        return tipo;
    }

    // METÓDO MODIFICADOR
    public void setCor_da_camisa(String cor){
        this.cor = cor;
    }

    public void setTamanho_da_Camisa(String tamanho){
        this.tamanho = tamanho;
    }

    public void setTipo_da_camisa(String tipo){
        this.tipo = tipo;
    }
}
