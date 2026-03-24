public class VeiculoCarro extends Veiculo {
    private String quantidade_de_portas;

    public VeiculoCarro(String Marca, String Modelo, String quantidade_de_portas){
        super(Marca, Modelo);
        this.quantidade_de_portas = quantidade_de_portas;
    }

    public String getQuantidade_de_Portas(){
        return quantidade_de_portas;
    }

    public void setQuantidade_de_Portas(String quantidade_de_portas){
        this.quantidade_de_portas = quantidade_de_portas;
    }

    @Override
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("A quantidade de portas são: " +getQuantidade_de_Portas());
    }
}