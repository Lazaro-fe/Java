import java.util.Scanner;

public class Peso_ideal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sexo;
        double altura;

        System.out.print("Digite seu sexo: ");
        sexo = sc.nextLine();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("Homem")){
            double calculo_de_peso_ideal = (72.7 * altura) - 44.7;

            System.out.println("\n=== PESO IDEAL ===");
            System.out.println("Seu sexo : " + sexo);
            System.out.println("Sua altura: " + altura);
            System.out.println("Seu peso ideal: " + calculo_de_peso_ideal);
        } else if (sexo.equalsIgnoreCase("Mulher")) {
            double calculo_de_peso_ideal = (62.1 * altura) - 44.7;

            System.out.println("\n=== PESO IDEAL ===");
            System.out.println("Seu sexo: " + sexo);
            System.out.println("Sua altura: " + altura);
            System.out.println("Seu peso ideal: " +calculo_de_peso_ideal);
        } else {
            System.out.println("Identificação de Sexo invalidada!\nTente digitar sua sexualidade como Homem ou Mulher!");
        }

        sc.close();
    }
}
