// package POO;

public class CarroApp {
    
    public static void main(String[] args) {
        
        CarroP c1 = new CarroP(null, null, 0);
        CarroP c2 = new CarroP(null, null, 0);
        CarroP c3 = new CarroP(null, null, 0);

        System.out.println();
        System.out.println("O carro é um " +c1.getNome_de_carro()+", é considerado um: " +c1.getModelo_do_carro()+".\nSeu ano de fabricação é:" +c1.getAno_de_fabricacao());
        System.out.println();
        System.out.println("O carro é um " +c2.getNome_de_carro()+", é considerado um: " +c2.getModelo_do_carro()+".\nSeu ano de fabricação é:" +c2.getAno_de_fabricacao());
        System.out.println();
        System.out.println("O carro é um " +c3.getNome_de_carro()+ ", é considerado um: " +c3.getModelo_do_carro()+". \nSeu ano de fabricação é:" +c3.getAno_de_fabricacao());
    }
}
