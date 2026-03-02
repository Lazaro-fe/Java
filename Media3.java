import java.util.Scanner;

public class Media3 {
    
    public static void main (String [] args) {
        float n1, n2, n3, media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextFloat();
        System.out.println("Digite o terceiro número: ");
        n3 = sc.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.println("A média dos números informados é" +media);
        sc.close();
    }
}
