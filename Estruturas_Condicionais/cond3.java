import java.util.Scanner;

public class cond3 {
    public static void main(String[] args) {
        int nota = 3;
        Scanner sc = new Scanner(System.in);
        // Condicional encadeada
            if (nota >= 7) {
                System.out.println("Aprovado");
            }else if (nota == 5) {
                System.out.println("Recuperação");
            }else{
                System.out.println("Reprovado");
            }
    
            sc.close();
    }
        
}
