public class PessoaApp {
    
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa( "Lázaro", 17);
        Pessoa p2 = new Pessoa( "Juliana", 34);
        Pessoa p3 = new Pessoa( "Junior", 67);

        System.out.println();
        System.out.println("Os dados são" +p1.getNome()+ "---" +p1.getIdade()+ "anos");
        System.out.println("Os dados são" +p2.getNome()+ "---" +p2.getIdade()+ "anos");
        System.out.println("Os dados são" +p3.getNome()+ "---" +p3.getIdade()+ "anos");

        p1.setNome("Helder");
        p1.setIdade(30);
        p2.setNome("Carla");
        p2.setIdade(34);

        System.out.println();
        System.out.println("Os dados são: " +p1.getNome()+ "----" +p1.getIdade()+ "anos");
        System.out.println("Os dados são: " +p2.getNome()+ "----" +p2.getIdade()+ "anos");
    }
}
