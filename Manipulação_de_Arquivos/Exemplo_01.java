package Manipulação_de_Arquivos;
import java.io.File;
import java.io.IOException;

public class Exemplo_01{

    public static void main(String[] args) {
        try{
            
            File arquivo = new File("Exemplo.txt");
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo Criado! " +arquivo.getName());
            } else {
                System.out.println("Arquivo já existe!");
            }

            
        } catch(IOException e) {
            System.out.println("Ocorreu um erro!");
            e.printStackTrace();
        }
    }
}