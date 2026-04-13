// package Laco_de_Repeticao;
public class quatro {
    

    public static void main(String[] args) {

        for(int i=1; i<=10; i++){ // Tabuada dos números de 1 a 10
            System.out.println("Tabuada do: " +i);
            for (int num=1; num<=10; num++) {
                System.out.println(i+ "x" +num+ "=" +(i*num));
            }
        }
    }
}
