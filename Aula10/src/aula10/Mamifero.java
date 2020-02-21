package aula10;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Se locomove a 4 patas");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimenta de forma carnivora ou onivora");
    }

    @Override
    public void emitirSom() {
        System.out.println("Late, grita, rechincha, etc...");
    }
    
    
}
