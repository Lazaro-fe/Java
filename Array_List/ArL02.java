// package Array_List;
import java.util.ArrayList;

public class ArL02 {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(30);
        numeros.add(100);
        numeros.add(300);

        for(int i=0; i<numeros.size();i++){
            System.out.println(numeros.get(i));
            System.out.println();
        }

        numeros.set(0, 267);
        numeros.remove(Integer.valueOf(30));

        System.out.println("====== TABELA DE NÚMEROS ATUALIZADOS =====");
        for(Integer n : numeros){
            System.out.println(n);
        }
    }
}