package aula02;

public class Aula02 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.cor = "Verde";
        c1.marca = "BIC";
        c1.carga = 70;
        c1.tampada = true;
        c1.ponta = 0.5f;
        
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
