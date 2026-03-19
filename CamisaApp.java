public class CamisaApp {
    

    public static void main(String[] args) {
        Camisa ca1 = new Camisa("Verde", "G", "Camisa Polo");
        Camisa ca2 = new Camisa("Vermelho", "GG", "Camisa Jeans");
        Camisa ca3 = new Camisa("Cinza", "XG", "Camisa de Algodão");

        System.out.println();
        System.out.println("A cor da camisa é :" +ca1.getCor_da_camisa()+", o tamanho da camisa é : " +ca1.getTamanho_da_camisa()+".\nO tipo de camisa é:" +ca1.getTipo_da_Camisa());
        System.out.println();
        System.out.println("A cor da camisa é " +ca2.getCor_da_camisa()+", o tamanho da camisa é: " +ca2.getTamanho_da_camisa()+".\nO tipo de camisa é" +ca2.getTipo_da_Camisa());
        System.out.println();
        System.out.println("A cor da camisa é " +ca3.getCor_da_camisa()+ ", o tamanho da camisa é: " +ca3.getTamanho_da_camisa()+". \nO tipo de camisa é:" +ca3.getTipo_da_Camisa());
    }
}