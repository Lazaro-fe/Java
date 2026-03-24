public class ClientePJ extends Cliente {
    private String cnpj;

    public ClientePJ(String nome, String endereco, String cnpj){
        super(nome, endereco);
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
        System.out.println("O número do CNPJ é : " +getCnpj());
    }
}
