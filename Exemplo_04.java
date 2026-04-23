import java.io.FileWriter;
import java.io.IOException;

public class Exemplo_04 {

    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("dados.txt");

            fw.write("Primeira Linha\n");
            fw.write("Segunda Linha\n");

            fw.close();

            System.out.println("Escrita Concluída!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}