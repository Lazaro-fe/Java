abstract class Veiculo_Transpotes {
 
    private String modelo_veiculo;
    private int ano_veiculo;

    public Veiculo_Transpotes(String modelo_veiculo, int ano_veiculo){
        
        if (modelo_veiculo == null || modelo_veiculo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo não pode ser vazio");
        }

        if (ano_veiculo < 2000) {
            throw new IllegalArgumentException("O ano não pode ser menor que 2000.");
        }
        
        this.modelo_veiculo = modelo_veiculo;
        this.ano_veiculo = ano_veiculo;
    }

    public String getmodelo_veiculo(){
        return modelo_veiculo;
    }

    public int getano_veiculo(){
        return ano_veiculo;
    }

    public abstract double calcular_valor();

    public void exibir_informacoes_veiculo(){
        System.out.println("\n==== INFORMAÇÕES DO VEÍCULO ====");
        System.out.println("Modelo do Veículo: " +modelo_veiculo);
        System.out.println("Ano do Veículo: " +ano_veiculo);
        System.out.println("Valor: " +calcular_valor());
    }
}