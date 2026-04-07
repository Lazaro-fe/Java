import java.util.Scanner;

public class Principal_animal {
    
    public static void main(String[] args) {
        
        //Animal an = new Animal(); //

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o animal (1- Cachorro, 2- Gato)");
        int escolha = sc.nextInt();

        Animal animal_selecionado;

        if (escolha == 1) {
            animal_selecionado = new Cachorro();
        } else if (escolha == 2){
            animal_selecionado = new Gato();
        } else {
            System.out.println("Opção inválida!!");
            return;
        }

        animal_selecionado.fazersom();

        sc.close();
    }
}
