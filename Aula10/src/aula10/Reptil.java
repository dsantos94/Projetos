package aula10;

public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rasteja com membros ou sem membros...");
    }

    @Override
    public void alimentar() {
        System.out.println("No geral são onivoros");
    }

    @Override
    public void emitirSom() {
        System.out.println("Alguns emitem sons, outros não...");
    }
    
    
}
