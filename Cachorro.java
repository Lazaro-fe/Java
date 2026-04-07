public class Cachorro extends Animal {
    
    public Cachorro(){
        super("Cachorro");
    }

    @Override
    public void fazersomanimal(){
        System.out.println("O cachorro faz: Au, Au!");
    }
}
