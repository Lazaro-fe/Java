// package POO;

public class ClienteP { // SUPER CLASSE

    private String nome;
    private String endereco;

    public ClienteP(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void exibirInfor(){
        System.out.println("Nome: " +getNome());
        System.out.println("Endereço: " +getEndereco());
    }
}