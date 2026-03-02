import java.util.Scanner;

public class questaotres {
    
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        double idade = sc.nextDouble();

        if (idade <= 12) {
            System.out.println("Você é considerado uma criança!!");
        } else if (idade <= 17) {
            System.out.println("Você é considerado um Adolescente");
        } else if (idade <=59) {
            System.out.println("Você é considerado Adulto!!");
        } else {
            System.out.println("Você é considerado Idoso!!");
        }

        sc.close();
    }
    
}
