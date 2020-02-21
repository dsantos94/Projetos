package aula10;

public class Aula10 {
    
    public static void main(String[] args) {
        Arara a = new Arara();
        
        a.setPeso(5.2f);
        a.setIdade(4);
        a.setMembros(2);
        System.out.println(a.toString() + "\n");
        a.alimentar();
        a.emitirSom();
        a.locomover();
        a.tipoBico();
    }
    
}
