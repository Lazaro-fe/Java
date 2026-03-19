public class CarroApp {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Lamborghini Urus", "SUV", 2018);
        Carro c2 = new Carro("Ferrari Enzo", "Esportivo", 2002);
        Carro c3 = new Carro("Nissan Skyline GT-R R34", "Cupê Esportivo", 1999);

        System.out.println();
        System.out.println("O carro é um " +c1.getNome_de_carro()+", é considerado um: " +c1.getModelo_do_carro()+".\nSeu ano de fabricação é:" +c1.getAno_de_fabricacao());
        System.out.println();
        System.out.println("O carro é um " +c2.getNome_de_carro()+", é considerado um: " +c2.getModelo_do_carro()+".\nSeu ano de fabricação é:" +c2.getAno_de_fabricacao());
        System.out.println();
        System.out.println("O carro é um " +c3.getNome_de_carro()+ ", é considerado um: " +c3.getModelo_do_carro()+". \nSeu ano de fabricação é:" +c3.getAno_de_fabricacao());
    }
}
