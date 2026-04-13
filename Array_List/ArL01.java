// package Array_List;
import java.util.ArrayList;

public class ArL01 {

    
    public static void main(String[] args){

        // CRIANDO ARRAYLIST
        ArrayList<String> nomes = new ArrayList<>();
        // ADICIONANDO
        nomes.add("Anderson");
        nomes.add("Carlos");
        nomes.add("Ana Luiza");

        // LISTANDO
        for(int i=0; i<nomes.size();i++){
            System.out.println(nomes.get(i));


            // ALTERAR
            nomes.set(1, "Lion");
            nomes.remove("Anderson");

            for(String nome : nomes){
                System.out.println(nome);
            }

            System.out.println("Os nomes cadastrados são: "+nomes);
        }
    }
}