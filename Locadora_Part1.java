import java.util.Scanner;

public class Locadora_Part1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acervo_total_de_fitas = 4000;
        int total_de_fitas_distribuidas_entre_lojas = acervo_total_de_fitas / 2;

        // Defino um valor para a locadora da Pituba
        int locadora_itapua = 1620;
        // Calculo o total de fitas com os  clientes de itapua
        int Fitas_com_os_clientes_itapua = total_de_fitas_distribuidas_entre_lojas / locadora_itapua;

        // Defino um valor para a locadora Pituba
        int locadora_pituba = 1710;
        // Calculo o total de fitas com os clientes da pituba
        int Fitas_com_os_clientes_pituba = total_de_fitas_distribuidas_entre_lojas / locadora_pituba;

        int total_de_clientes = Fitas_com_os_clientes_itapua + Fitas_com_os_clientes_pituba;

        double Percentual = ((double) total_de_clientes / acervo_total_de_fitas) * 100;

        System.out.println("\n=== RESULTADO DO PERCENTUAL DA LOCADORA ===");
        System.out.println("Número de fitas na Locadora geral: " + acervo_total_de_fitas);
        System.out.println("Quantidade de fitas divididas entre as locadoras: " + total_de_fitas_distribuidas_entre_lojas);
        System.out.println("Quantidade de fitas disponíveis na Locadora de Itapuã: " + locadora_itapua);
        System.out.println("Quantidade de fitas nas mãos dos clientes da Locadora de Itapuã: " + Fitas_com_os_clientes_itapua);
        System.out.println("Quantidade de fitas disponíveis na Locadora da Pituba: " + locadora_pituba);
        System.out.println("Quantidade de fitas nas mão dos clientes da Locadora da Pituba: " + Fitas_com_os_clientes_pituba);
        System.out.println("Total de clientes das duas lojas: " + total_de_clientes);
        System.out.println("Percentual total de fitas com Clientes: " + Percentual);
        sc.close();
    }
}
