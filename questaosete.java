import java.util.Scanner;

public class questaosete {
    public static void main(String [] args) {
        double c_vermelho = 35;
        double c_azul = 70;
        double c_verde = 40;
        double c_rosa = 25;

        Scanner sc = new Scanner(System.in);

        System.out.println("vr = Vernelho | az = Azul | ve = Verde | ro = Rosa");

        System.out.println("Digite a cor do disco escolhido: ");
        String cor = sc.next();

        if (cor.equals("vr")) {
            System.out.println("Disco Vermelho: R$" +c_vermelho+ "Reais");
        } else if (cor.equals("az")) {
            System.out.println("Disco Azul: R$" +c_azul+ "Reais");
        } else if (cor.equals("ve")) {
            System.out.println("Disco Verde: R$" +c_verde+ "Reais");
        } else if (cor.equals("ro")) {
            System.out.println("Disco Rosa: R$" +c_rosa+ "Reais");
        } else {
            System.out.println("Cor Inválida");
        }

        sc.close();
    }
}
