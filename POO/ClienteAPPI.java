// package POO;

import java.util.Scanner;

public class ClienteAPPI {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Clientepf c1 = new Clientepf(null, null, null);
        Clientepf c2 = new Clientepf(null, null, null);
        Clientepf c3 = new Clientepf(null, null, null);

        Clientepj cpj1 = new Clientepj(null, null, null);
        Clientepj cpj2 = new Clientepj(null, null, null);
        Clientepj cpj3 = new Clientepj(null, null, null);

        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        c1.setNome_cliente(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        c1.setEndereco_cliente(sc.nextLine());
        System.out.println("Digite o cpf do cliente: ");
        c1.setCPF(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CPF 2
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        c2.setNome_cliente(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        c2.setEndereco_cliente(sc.nextLine());
        System.out.println("Digite o cpf do cliente: ");
        c2.setCPF(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CPF 3
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        c3.setNome_cliente(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        c3.setEndereco_cliente(sc.nextLine());
        System.out.println("Digite o cpf do cliente: ");
        c3.setCPF(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CNPJ 1
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        cpj1.setNome_cliente(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        cpj1.setEndereco_cliente(sc.nextLine());
        System.out.println("Digite o cnpj do cliente: ");
        cpj1.setCnpj(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CNPJ 2
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        cpj2.setNome_cliente(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        cpj2.setEndereco_cliente(sc.nextLine());
        System.out.println("Digite o cnpj do cliente: ");
        cpj1.setCnpj(sc.nextLine());

        // INFORMAÇÕES DO CLIENTE COM CNPJ 3
        System.out.println();
        System.out.println("Digite o nome do cliente: ");
        cpj3.setNome_cliente(sc.nextLine());
        System.out.println("Digite o endereço do cliente: ");
        cpj3.setEndereco_cliente(sc.nextLine());
        System.out.println("Digite o cnpj do cliente: ");
        cpj1.setCnpj(sc.nextLine());


        System.out.println("======== EXIBINDO REGISTRO DE CLIENTES ========");
        System.out.println();

        // CLIENTE COM CPF
        System.out.println("O NOME DO CLIENTE " +c1.getNome_cliente()+ "---- O CPF DO CLIENTE É :" +c1.getCPF()+ "---- O ENDEREÇO DO CLEINTE É: " +c1.getEndereco_cliente());
        System.out.println("O NOME DO CLIENTE " +c2.getNome_cliente()+ "---- O CPF DO CLIENTE É :" +c2.getCPF()+ "---- O ENDEREÇO DO CLEINTE É: " +c2.getEndereco_cliente());
        System.out.println("O NOME DO CLIENTE " +c3.getNome_cliente()+ "---- O CPF DO CLIENTE É :" +c3.getCPF()+ "---- O ENDEREÇO DO CLEINTE É: " +c3.getEndereco_cliente());

        // CLIENTE COM CNPJ
        System.out.println();
        System.out.println("O NOME DO CLIENTE " +cpj1.getNome_cliente()+ "---- O CPF DO CLIENTE É :" +cpj1.getCnpj()+ "---- O ENDEREÇO DO CLEINTE É: " +cpj1.getEndereco_cliente());
        System.out.println("O NOME DO CLIENTE " +cpj2.getNome_cliente()+ "---- O CPF DO CLIENTE É :" +cpj2.getCnpj()+ "---- O ENDEREÇO DO CLEINTE É: " +cpj2.getEndereco_cliente());
        System.out.println("O NOME DO CLIENTE " +cpj3.getNome_cliente()+ "---- O CPF DO CLIENTE É :" +cpj3.getCnpj()+ "---- O ENDEREÇO DO CLEINTE É: " +cpj3.getEndereco_cliente());

        sc.close();
    }
}
