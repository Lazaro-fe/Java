// package Array_List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArLi03 {
    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        // 1. INSERIR DADOS
        for(int x=0; x<3; x++){
            System.out.println("Informe o nome: " +(x+1));
            nomes.add(sc.nextLine());
        }
        System.out.println("\nOs nomes cadastrados: ");
        for(int x = 0; x<nomes.size(); x++){
            System.out.println(x+ "---" +nomes.get(x));
        }

        // 2. ALTERAR DADOS
        int indiceAlterar;
        do{ System.out.println("\n Informe o indice para alterar: ");
            indiceAlterar= sc.nextInt();
            sc.nextLine();

            if (indiceAlterar<0 || indiceAlterar>= nomes.size()) {
                System.out.println("Indice inválido!! \nTente Novamente");
            }
        }while(indiceAlterar < 0 || indiceAlterar >= nomes.size());

        System.out.println("Digite um nome: ");
        String novo_nome = sc.nextLine();

        nomes.set(indiceAlterar, novo_nome);
        System.out.println("Nome alterado com Sucesso!!!"); //FIM ALTERAR

        System.out.println("=== LISTA APÓS ALTERAÇÃO ===");

        // 3. REMOVER DADOS

        int indice;
        do{
            System.out.println("Informe o indIce para remover: ");
            indice = sc.nextInt();

            if (indice < 0 || indice >= nomes.size()) {
                System.out.println("Indice inválido!!\n Tente novamente!!");
            }
        }while(indice < 0 || indice >= nomes.size());
        nomes.remove(indice);
        System.out.println("Nome removido com Sucesso!!");
        sc.close();
    }
}