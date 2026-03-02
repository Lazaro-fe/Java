import java.util.Scanner;


public class questaoum {
    public static void main(String [] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num == 0) {
            System.out.println("Nulo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
