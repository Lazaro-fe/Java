public class VeiculoMoto extends Veiculo{
    private String cilindrada;

    public VeiculoMoto(String Marca, String Modelo, String cilindrada){
        super(Marca, Modelo);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("A quantidade de portas são: " +getCilindrada());
    }
}
