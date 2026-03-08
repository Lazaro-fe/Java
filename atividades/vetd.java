// package atividades;
import java.util.Scanner;

public class vetd{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nomes = new String[3];
        int [] notas = new int[3];

        for(int i=0; i<3; i++) {
            System.out.println("Informe o nome: ");
            nomes[i] = sc.nextLine();


            System.out.println("Informe a nota: ");
            notas[i] = sc.nextInt();

            // Limpa BUFFER = É usado para que o código pule a linha da próxima pergunta
            sc.nextLine();
        }

        System.out.println("=========== LISTA DE NOMES E NOTAS ==============");



        for(int i=0; i<3; i++){
            System.out.println("Nome: " + nomes[i] + " - Notas: " + notas[i]);
        }
        sc.close();
    }
}

// Durante a realização da tividade, o professor nos fez analisar o código, testa-ló para se houve alguma erro,
// pode-se perceber que as linhas 11 à 19, possuia um erro de pulo de linha, onde para que o código pudesse rodar o laço de
// forma correta, era necessário colocar o sc.nexline() para que houvesse o buffer do espaço entre as perguntas.