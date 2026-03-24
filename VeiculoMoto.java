public class VeiculoMoto extends Veiculo{
    private int cilindrada;

    public VeiculoMoto(String Marca, String Modelo, int cilindrada){
        super(Marca, Modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("A quantidade de portas são: " +getCilindrada());
    }
}
