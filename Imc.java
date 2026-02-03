import java.util.Scanner;


public class Imc {
    public static void main (String [] args) {
        float al, pe, imc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        pe = sc.nextFloat();
        System.out.println("Digite o valor da sua altura: ");
        al = sc.nextFloat();
        imc = pe / al;

        System.out.println("O seu IMC possui o valor de: " +imc);
        sc.close();
    }
}
