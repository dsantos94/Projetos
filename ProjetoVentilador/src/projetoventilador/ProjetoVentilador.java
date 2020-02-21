package projetoventilador;

public class ProjetoVentilador {
    
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador(5, false, false);
        
        v1.setModelo("M520");
        v1.setMarca("Wind");
        //v1.setRotacao(true);
        v1.info();
    }
    
}
