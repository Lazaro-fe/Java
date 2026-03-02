import java.util.Scanner;


public class questaoseis {
    
    public static void main(String [] args) {
        float soma, subtracao, divisao, multiplicacao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Primeira nota: ");
        float n1 = sc.nextInt();
        System.out.println("Digite a Segunda nota: ");
        float n2 = sc.nextInt();
        System.out.println("Digite o tipo de Operação escolhida: ");
        String op = sc.next();

        if (op.equals("+")) {
            soma = (n1 + n2);
            System.out.println("A soma desses números é:" +soma);
        } else if (op.equals("-")) {
            subtracao = (n1 - n2);
            System.out.println("A subtração desses números é:" +subtracao);
        }else if (op.equals("/")) {
            divisao = (n1 / n2);
            System.out.println("A divisão desses números é: " +divisao);
        } else if (op.equals("*")) {
            multiplicacao = (n1 * n2);
            System.out.println("A multiplicação desses números é igual a:" +multiplicacao);
        } else {
            System.out.println("Operação Inválida!!");
        }

        sc.close();
    }
}