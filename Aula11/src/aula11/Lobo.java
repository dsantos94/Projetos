package aula11;

public class Lobo extends Mamifero{
    
    public Lobo(float p, int i, int m){
        super(p, i, m);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuu!");
    }
}
