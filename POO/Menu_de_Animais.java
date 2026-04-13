// package POO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu_de_Animais {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar novo animal");
            System.out.println("2 - Fazer um animal emitir som");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpar o buffer do teclado
            } else {
                System.out.println("Entrada inválida. Digite um número correspondente ao menu.");
                sc.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nQual tipo de animal deseja adicionar?");
                    System.out.println("1 - Cachorro");
                    System.out.println("2 - Gato");
                    System.out.println("3 - Vaca");
                    System.out.println("4 - Macaco");
                    System.out.print("Escolha: ");
                    
                    int tipoAnimal = sc.nextInt();
                    sc.nextLine(); // Limpar o buffer

                    if (tipoAnimal == 1) {
                        animais.add(new Cachorro());
                        System.out.println("-> Cachorro foi cadastrado com sucesso!");
                    } else if (tipoAnimal == 2) {
                        animais.add(new Gato());
                        System.out.println("-> Gato foi cadastrado com sucesso!");
                    } else if (tipoAnimal == 3) {
                        animais.add(new Vaca());
                        System.out.println("-> Vaca foi cadastrada com sucesso!");
                    } else if (tipoAnimal == 4) {
                        animais.add(new Macaco());
                        System.out.println("-> Macaco foi cadastrado com sucesso");
                    }
                    break;

                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("\n-> Nenhum animal cadastrado ainda. Adicione um animal primeiro.");
                    } else {
                        System.out.println("\n=== Animais Cadastrados ===");
                        for (int i = 0; i < animais.size(); i++) {
                            System.out.println((i + 1) + " - " + animais.get(i).getTipo());
                        }
                        System.out.print("Escolha o número do animal para ouvir o som: ");
                        
                        int indiceAnimal = sc.nextInt() - 1;
                        sc.nextLine(); // Limpar o buffer

                        // Verifica se o índice escolhido existe na lista
                        if (indiceAnimal >= 0 && indiceAnimal < animais.size()) {
                            System.out.println();
                            animais.get(indiceAnimal).fazersomanimal();
                        } else {
                            System.out.println("-> Animal não encontrado na lista.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nEncerrando o programa... Até logo!");
                    break;

                default:
                    System.out.println("\n-> Opção inválida. Tente novamente escolhendo 1, 2 ou 3.");
            }
        }
        
        sc.close();
    }
}
