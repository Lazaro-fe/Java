// package atividades;
import java.util.Scanner;

public class ClienteAPPNEW {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ClientePF c1 = new ClientePF(null, null, null);
        ClientePF c2 = new ClientePF(null, null, null);
        ClientePF c3 = new ClientePF(null, null, null);

        ClientePJ cpj1 = new ClientePJ(null, null, null);
        ClientePJ cpj2 = new ClientePJ(null, null, null);
        ClientePJ cpj3 = new ClientePJ(null, null, null);


        // INFORMAÇÕES DO CLIENTE COM CPF 1
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        c1.setNome(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        c1.setEndereco(sc.nextLine());
        System.out.println("Digite o cpf do cliente: ");
        c1.setCpf(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CPF 2
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        c2.setNome(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        c2.setEndereco(sc.nextLine());
        System.out.println("Digite o cpf do cliente: ");
        c2.setCpf(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CPF 3
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        c3.setNome(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        c3.setEndereco(sc.nextLine());
        System.out.println("Digite o cpf do cliente: ");
        c3.setCpf(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CNPJ 1
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        cpj1.setNome(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        cpj1.setEndereco(sc.nextLine());
        System.out.println("Digite o cnpj do cliente: ");
        cpj1.setCnpj(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CNPJ 2
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        cpj2.setNome(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        cpj2.setEndereco(sc.nextLine());
        System.out.println("Digite o cnpj do cliente: ");
        cpj1.setCnpj(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CNPJ 3
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        cpj3.setNome(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        cpj3.setEndereco(sc.nextLine());
        System.out.println("Digite o cnpj do cliente: ");
        cpj1.setCnpj(sc.nextLine());


        System.out.println("======== EXIBINDO REGISTRO DE CLIENTES ========");
        System.out.println();

        // CLIENTE COM CPF
        System.out.println("O NOME DO CLIENTE " +c1.getNome()+ "---- O CPF DO CLIENTE É :" +c1.getCpf()+ "---- O ENDEREÇO DO CLEINTE É: " +c1.getEndereco());
        System.out.println("O NOME DO CLIENTE " +c2.getNome()+ "---- O CPF DO CLIENTE É :" +c2.getCpf()+ "---- O ENDEREÇO DO CLEINTE É: " +c2.getEndereco());
        System.out.println("O NOME DO CLIENTE " +c3.getNome()+ "---- O CPF DO CLIENTE É :" +c3.getCpf()+ "---- O ENDEREÇO DO CLEINTE É: " +c3.getEndereco());

        // CLIENTE COM CNPJ
        System.out.println();
        System.out.println("O NOME DO CLIENTE " +cpj1.getNome()+ "---- O CPF DO CLIENTE É :" +cpj1.getCnpj()+ "---- O ENDEREÇO DO CLEINTE É: " +cpj1.getEndereco());
        System.out.println("O NOME DO CLIENTE " +cpj2.getNome()+ "---- O CPF DO CLIENTE É :" +cpj2.getCnpj()+ "---- O ENDEREÇO DO CLEINTE É: " +cpj2.getEndereco());
        System.out.println("O NOME DO CLIENTE " +cpj3.getNome()+ "---- O CPF DO CLIENTE É :" +cpj3.getCnpj()+ "---- O ENDEREÇO DO CLEINTE É: " +cpj3.getEndereco());

        sc.close();
    } 
}