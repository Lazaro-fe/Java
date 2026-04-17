class Carro_Transporte extends Veiculo_Transpotes{
    
    public Carro_Transporte(String modelo_veiculo, int ano_veiculo){
        super(modelo_veiculo, ano_veiculo);
    }

    @Override
    public double calcular_valor(){
        return 30000.00;
    }
}
