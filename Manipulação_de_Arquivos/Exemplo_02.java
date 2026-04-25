package Manipulação_de_Arquivos;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo_02 {
    
    public static void main(String[] args) {
        
        try{
            FileWriter escritor = new FileWriter("Exemplo.txt",
                true);
            
            escritor.write("Primeira Linha\n");
            escritor.write("Segunda Linha\n");
            escritor.close();
            System.out.println("Escrita concluída!!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo!!");
            e.printStackTrace();
        } 
    }
}
