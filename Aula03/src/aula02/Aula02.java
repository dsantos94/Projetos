package aula02;

public class Aula02 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.carga = 100;
        c1.cor = "Azul";
        c1.marca = "BIC";
        
        c1.destampar();
        c1.status();
        c1.tampar();
        c1.status();
    }
    
}
