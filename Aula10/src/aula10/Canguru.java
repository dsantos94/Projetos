package aula10;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Cangurus adultos usam bolsas");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Cangurus se alimentam de folha");
    }
    
    @Override
    public void locomover(){
        System.out.println("Cangurus se locomovem pulando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Cangurus rosnam");
    }
}
