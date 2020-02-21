package aula10;

public class Peixes extends Animal{
    protected String corEscama;

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Locomocao do peixe é nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimenta de algas marinhas ou frutos do mar");
    }

    @Override
    public void emitirSom() {
        System.out.println("No geral tem ausencia de emissão de sons");
    }
    
    public void fazemBolha(){
        System.out.println("No geral fazem bolha na agua");
    }
    
    public void tipoAgua(){}
}
