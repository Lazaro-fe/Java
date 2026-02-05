import java.util.Scanner;

public class cond2 {
    public static void main (String[] args) {
        int nota = 7;
        Scanner sc = new Scanner(System.in);
        // Condicional composta
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
