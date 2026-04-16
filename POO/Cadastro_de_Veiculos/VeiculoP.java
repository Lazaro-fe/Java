// package POO;
public class VeiculoP {
    private String marca;
    private String modelo;

    public VeiculoP(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void exibirInfor(){
        System.out.println("Marca: " +getMarca());
        System.out.println("Modelo: " +getModelo());
    }
}