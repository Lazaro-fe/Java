package Manipulação_de_Arquivos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo_06 {
    
    public static void main(String[] args) {
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("dados.txt", true));
            bw.write("Terceira Linha");
            bw.newLine();
            bw.write("Quarta Linha");

            bw.close();
            System.out.println("Escrita Concluída");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
