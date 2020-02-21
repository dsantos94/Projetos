package aula10;

public class Aves extends Animal{
    protected String corPena;

    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Andam e voam");
    }

    @Override
    public void alimentar() {
        System.out.println("Frutos e insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Assobia");
    }
    
    public void fazerNinho(){
        System.out.println("Aves fazem ninho");
    }
    
    public void tipoBico(){}
}
