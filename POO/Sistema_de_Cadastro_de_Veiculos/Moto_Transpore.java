class Moto_Transporte extends Veiculo_Transpotes{
    
    public Moto_Transporte(String modelo_veiculo, int ano_veiculo){
        super(modelo_veiculo, ano_veiculo);
    }

    @Override
    public double calcular_valor(){
        return 15000.00;
    }
}