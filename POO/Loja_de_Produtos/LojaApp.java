package Loja_de_Produtos;

// package POO;

import java.util.Scanner;

public class LojaApp {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Loja loj = new Loja(null, 0, 0);

        System.out.println("Digite o nome do produto:");
        loj.setNome_do_produto(sc.nextLine());

        System.out.println("Digite o preço do produto");
        loj.setPreco_produto(sc.nextFloat());

        System.out.println("Digite a quantidade de produto em estoque:");
        loj.setQuantidade_de_produtos(sc.nextInt());

        System.out.println();
        System.out.println("O nome do produto é: " +loj.getNome_do_produto());
        System.out.println("O preço do produto é: " +loj.getPreco_produto());
        System.out.println("A quantidade desse produto em estoque é: " +loj.getQuantidade_de_produtos());

        sc.close();
    }

}
