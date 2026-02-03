import java.util.Scanner;

public class Media2 {
    
    public static void main (String [] args) {
        float n1, n2, media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextFloat();
        media = (n1+n2)/2;
        System.out.println("A média dos números informados é" +media);
        sc.close();
    }
}