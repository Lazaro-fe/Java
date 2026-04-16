package Cadastro_Clientes_Online;
// package POO;

public class Clientepj  extends ClienteP{
    
    private String cnpj;

    public Clientepj(String nome_cliente, String endereco_cliente, String cnpj){
        super(nome_cliente, endereco_cliente);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("O número do CNPJ é: " + getCnpj());
    }
}
