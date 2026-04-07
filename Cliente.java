public class Cliente {

    private String nome_cliente;
    private String endereco_cliente;

    // CONSTRUTOR
    public Cliente(String nome_cliente, String endereco_cliente){
        this.nome_cliente = nome_cliente;
        this.endereco_cliente = endereco_cliente;
    }

    // METÓDO ACESSOR
    public String getNome_cliente(){
        return nome_cliente;
    }

    public String getEndereco_cliente(){
        return endereco_cliente;
    }

    // METÓDO MODIFICARDOR

    public void setNome_cliente(String nome_cliente){
        this.nome_cliente = nome_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente){
        this.endereco_cliente = endereco_cliente;
    }

    public void exibirInfor(){
        System.out.println("Nome: " + getNome_cliente());
        System.out.println("Endereço: " + getEndereco_cliente());
    }

    public void exibirInfor(String mensagemPersonalizada){
        System.out.println("--- " + mensagemPersonalizada + " ---");
        System.out.println("Nome: " + getNome_cliente());
        System.out.println("Endereço: " + getEndereco_cliente());
    }
}