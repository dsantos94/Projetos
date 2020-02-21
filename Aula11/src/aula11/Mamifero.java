package aula11;

public class Mamifero extends Animal{
    protected String corPelo;
    
    public Mamifero(float p, int i, int m){
        super(p, i, m);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }
}
