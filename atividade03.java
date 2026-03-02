import java.util.Scanner;

public class atividade03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String professor;

        while (true) {
            System.out.println("Digite o nome do seu professor preferido");
            professor = sc.nextLine();

            if (professor.equalsIgnoreCase("Anderson")) {
                System.out.println("Anderson é professor mais fofo!");
                break;
            }
            System.out.println("Tente novamente!");
            sc.close();
        }
    }
}