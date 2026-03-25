public class VeiculoCarro extends Veiculo{
    private int quantidade_de_portas;

    public VeiculoCarro(String Marca, String Modelo, int quantidade_de_portas){
        super(Marca, Modelo);
        this.quantidade_de_portas = quantidade_de_portas;
    }

    public int getQuantidade_de_Portas(){
        return quantidade_de_portas;
    }

    public void setQuantidade_de_Portas(int quantidade_de_portas){
        this.quantidade_de_portas = quantidade_de_portas;
    }

    @Override
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("A quantidade de portas são: " +getQuantidade_de_Portas());
    }
}
