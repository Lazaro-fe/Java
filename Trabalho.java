import java.util.Scanner;


public class Trabalho {
    public static void main (String [] args) {
        float t, f, d;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da forca:");
        f = sc.nextFloat();
        System.out.println("Digite o valor da distancia: ");
        d = sc.nextFloat();
        t = f * d;
        System.out.println("O trabalho possui o valor de :" +t);
        sc.close();
    }
}
