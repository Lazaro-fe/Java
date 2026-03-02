import java.util.Scanner;

public class Operacoes {
    
    public static void main (String [] args) {
        float n1, n2, soma, subtracao, divisao, multiplicacao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextFloat();
        soma = n1 + n2;
        subtracao = n1 - n2;
        divisao = n1 / n2;
        multiplicacao = n1 * n2;

        System.out.println("A soma dos número é :" +soma);
        System.out.println("A subtracao dos número é :" +subtracao);
        System.out.println("A divisao dos número é :" +divisao);
        System.out.println("A multiplicacao dos número é :" +multiplicacao);

        sc.close();
    }
}
