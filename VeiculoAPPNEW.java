import java.util.Scanner;

public class VeiculoAPPNEW {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        VeiculoCarro car1 = new VeiculoCarro(null, null, 0);
        VeiculoCarro car2 = new VeiculoCarro(null, null, 0);
        VeiculoCarro car3 = new VeiculoCarro(null, null, 0);

        VeiculoMoto moto1 = new VeiculoMoto(null, null, 0);
        VeiculoMoto moto2 = new VeiculoMoto(null, null, 0);
        VeiculoMoto moto3 = new VeiculoMoto(null, null, 0);

        // CARRO 1
        System.out.println();
        System.out.println("Digite a marca do carro: ");
        car1.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do carro: ");
        car1.setModelo(sc.nextLine());
        System.out.println("Digite a quantidade_de_portas: ");
        car1.setQuantidade_de_Portas(sc.nextInt());
        sc.nextLine();

        // Carro 2
        System.out.println();
        System.out.println("Digite a marca do carro: ");
        car2.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do carro: ");
        car2.setModelo(sc.nextLine());
        System.out.println("Digite a quantidade de portas do carro: ");
        car2.setQuantidade_de_Portas(sc.nextInt());
        sc.nextLine();

        // Carro 3
        System.out.println();
        System.out.println("Digite a marca do carro: ");
        car3.setMarca(sc.nextLine());
        System.out.println("Digite o modelo do carro: ");
        car3.setModelo(sc.nextLine());
        System.out.println("Digite a quantidade de portas do carro: ");
        car3.setQuantidade_de_Portas(sc.nextInt());
        sc.nextLine();

        // MOTO 1
        System.out.println();
        System.out.println("Digite a marca da moto: ");
        moto1.setMarca(sc.nextLine());
        System.out.println("Digite a marca da moto: ");
        moto1.setModelo(sc.nextLine());
        System.out.println("Digite a quanttidade de cilindradas da moto: ");
        moto1.setCilindrada(sc.nextInt());
        sc.nextLine();

        // MOTO 2 
        System.out.println();
        System.out.println("Digite a marca da moto: ");
        moto2.setMarca(sc.nextLine());
        System.out.println("Digite a marca da moto: ");
        moto2.setModelo(sc.nextLine());
        System.out.println("Digite a quanttidade de cilindradas da moto: ");
        moto2.setCilindrada(sc.nextInt());
        sc.nextLine();

        // MOTO 3
        System.out.println();
        System.out.println("Digite a marca da moto: ");
        moto3.setMarca(sc.nextLine());
        System.out.println("Digite a marca da moto: ");
        moto3.setModelo(sc.nextLine());
        System.out.println("Digite a quanttidade de cilindradas da moto: ");
        moto3.setCilindrada(sc.nextInt());
        sc.nextLine();

        // TABELA DE VEICULOS REGISTRADOS

        System.out.println("======= VEÍCULOS CADASTRADOS =======");

        // CARROS
        System.out.println();
        System.out.println("A MARCA DO CARRO É: " +car1.getMarca() + "---- O MODELO DO CARRO: " +car1.getModelo() + "--- QUANIDADE DE PORTAS: " +car1.getQuantidade_de_Portas());
        System.out.println("A MARCA DO CARRO É: " +car2.getMarca() + "---- O MODELO DO CARRO: " +car2.getModelo() + "--- QUANIDADE DE PORTAS: " +car2.getQuantidade_de_Portas());
        System.out.println("A MARCA DO CARRO É: " +car3.getMarca() + "---- O MODELO DO CARRO: " +car3.getModelo() + "--- QUANIDADE DE PORTAS: " +car3.getQuantidade_de_Portas());

        // MOTOS
        System.out.println();
        System.out.println("A MARCA DA MOTO É: " +moto1.getMarca() + "---- O MODELO DA MOTO É: " +moto1.getModelo() + "---- A QUANTIDADE DE CILINDRADAS É DE: " +moto1.getCilindrada());
        System.out.println("A MARCA DA MOTO É: " +moto2.getMarca() + "---- O MODELO DA MOTO É: " +moto2.getModelo() + "---- A QUANTIDADE DE CILINDRADAS É DE: " +moto2.getCilindrada());
        System.out.println("A MARCA DA MOTO É: " +moto3.getMarca() + "---- O MODELO DA MOTO É: " +moto3.getModelo() + "---- A QUANTIDADE DE CILINDRADAS É DE: " +moto3.getCilindrada());

        sc.close();
    }
}
