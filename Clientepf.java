public class Clientepf extends Cliente{
    
    private String cpf;

    public Clientepf(String nome_cliente, String endereco_cliente, String cpf){
        super(nome_cliente, endereco_cliente);
        this.cpf = cpf;
    }

    public String getCPF(){
        return cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    @Override
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("O núemro do cpf é:" +getCPF());
    }

}
