package aula02;

public class Aula02 {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preta", 0.5f);
        
        System.out.println(c1.getMarca());
        System.out.println(c1.getCor());
        System.out.println(c1.getPonta());
        c1.setTampada(false);
        System.out.println(c1.getTampada());
        
        
    }
    
}
