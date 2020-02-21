package aula05;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.setLigado(false);
        this.setVolume(50);
        this.setTocando(false);
    }
    
    @Override
    public void ligar(){
        this.setLigado(true);
        System.out.print("Ligando a TV: " + this.getLigado());
        System.out.println("");
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){
        System.out.println("------------- MENU -------------");
        System.out.println("A TV está " + this.getLigado());
        System.out.print("O Volume está em " + this.getVolume() + "% ");
                for (int i = 0 ; i <= this.getVolume(); i+=10) {
                    System.out.print("|");
                }
            System.out.println("");
            System.out.println("A TV está " + this.getTocando());
        System.out.println("---------------------------------");    
    }
    
    @Override
    public void fecharMenu(){
            System.out.println("Saindo...");
        
    }
    
    @Override
    public void maisVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }
    
    @Override
    public void menosVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }
    
    @Override
    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() != 0) {
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0)
            this.setVolume(50);
    }
    
    @Override
    public void play(){
        if (this.getLigado() && this.getTocando() == false) {
            this.setTocando(true);
        }
        System.out.println("Está executando: " + this.getTocando());
    }
    
    @Override
    public void pause(){
         if (this.getLigado() && this.getTocando() == true) {
            this.setTocando(false);
        }
        System.out.print("Está pausado: ");
        System.out.println(this.getTocando());
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }
    
}
