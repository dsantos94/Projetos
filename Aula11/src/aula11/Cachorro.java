package aula11;

public class Cachorro extends Lobo implements InterCachorro{
    
    public Cachorro(float p, int i, int m){
        super(p, i, m);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som do cachorro: Au! Au! Au!");
    }
    
    @Override
    public void reagir(int i){
        if (i > 0 && i <= 3 ) {
            System.out.println("Esta dentro do limite. Foram " + i + " ameaças\n");
        } else {
            System.out.println("Limite extrapolado. Mais do que 3 ameaças, totalizando " + i + ".\n");
        }
    }
    
    @Override
    public void reagir(String f){
        System.out.println("Cachorro " + f + " reagiu latindo");
    }
    
    @Override
    public void reagir(boolean mordeu){
        if (mordeu == true) {
            System.out.println("Vai para o canil");
        } else {
            System.out.println("Tudo normalizado");
        }
    }
    
    @Override
    public void reagir(int i, float p){
        if (i < 5) {
            if (p < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (p < 10) {
                System.out.println("Latir");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
