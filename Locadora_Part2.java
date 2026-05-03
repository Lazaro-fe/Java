import java.util.Scanner;

public class Locadora_Part2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acervo_de_fitas;
        int locadora_de_itapua;
        int locadora_da_Pituba;

        // Informa a quantidade de fitas existente no acervo de fitas
        System.out.print("Digite a quantidade de fitas existentes no acervo: ");
        acervo_de_fitas = sc.nextInt();

        // Dividir a quantidade de fitas no acervo pelas duas locadoras
        int total_de_nas_lojas = acervo_de_fitas / 2;

        // Pega a divisão do total de fitas no acervo e divide entre as locadoras
        System.out.println("Quantidade de fitas divididas entre as locadoras: " + total_de_nas_lojas);

        // Informa quantas fitas estão na Locadora de Itapuã
        System.out.println("Digite quantas fitas estão no estoque da Locadora de Itapuã: ");
        locadora_de_itapua = sc.nextInt();
        // Calcula a quantidade de fitas nas mãos do cliente
        int Total_de_fitas_no_clientes_de_Itapua = total_de_nas_lojas - locadora_de_itapua;

        // Informa quantas fitas estão na Locadora da Pituba
        System.out.println("Digite quantas fitas estão no estoque da Locadora da Pituba: ");
        locadora_da_Pituba = sc.nextInt();
        // Calcula a quantidade de fitas nas mãos do cliente
        int Total_de_fitas_no_cleintes_da_Pituba = total_de_nas_lojas - locadora_da_Pituba;

        // Calcula o total de clientes das duas locadoras com fitas compradas
        int Total_de_cliente_das_duas_locadoras = Total_de_fitas_no_clientes_de_Itapua + Total_de_fitas_no_cleintes_da_Pituba;

        // Calcula o percentual de fitas com os clientes
        double percentual_de_fitas_com_os_clientes = ((double) Total_de_cliente_das_duas_locadoras  + acervo_de_fitas) * 100;

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Quantidade de fitas no acervo : " + acervo_de_fitas);
        System.out.println("Quantidade de fitas divididas entre as locadoras: " + total_de_nas_lojas);
        System.out.println("Quantidade de fitas nas lojas de Itapuã: " + locadora_de_itapua);
        System.out.println("Total de fitas com clientes na locadora de Itapuã: " + Total_de_fitas_no_clientes_de_Itapua);
        System.out.println("Quantidade de fitas nas lojas da Pituba: " + locadora_da_Pituba);
        System.out.println("Total de fitas com os clientes na Locadora da Pituba: " + Total_de_fitas_no_cleintes_da_Pituba);
        System.out.println("Total de Clientes entre as duas Lojas: " + Total_de_cliente_das_duas_locadoras);
        System.out.println("Percentual de fitas com os clientes: " + percentual_de_fitas_com_os_clientes);
        sc.close();
    }
}