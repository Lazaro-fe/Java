public abstract class Animal {

    private String tipo;


    public Animal(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public abstract void fazersomanimal();
}