import java.util.Scanner;

public class cond4 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o seu nome:");
        String nome = sc.next();
        
        System.out.println("Informe sua primeira nota: ");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe a sua segunda nota:");
        double n2 = sc.nextDouble();

        double media= (n1+n2) / 2;

        if (media >= 7) {
            System.out.println("Olá " +nome+ ", sua média é"+media);
            System.out.println("Aluno Aprovado!!");
        } else if (media >= 5) {
            System.out.println("Aluno está de Recuperação");
            System.out.println("O aluno alcançou a média" +media);
        }else {
            System.out.println("Aluno esta Reprovado!!");
            System.out.println("O aluno alcançou a média" +media);
        }

        sc.close();
    }
}
