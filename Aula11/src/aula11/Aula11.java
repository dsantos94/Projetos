package aula11;

public class Aula11 {
    
    public static void main(String[] args) {
        Cachorro []c = new Cachorro[3];
        Lobo l = new Lobo(3.5f, 4, 4);
        
        c[0] = new Cachorro(3.50f, 4, 4);
        System.out.println(c[0].toString() + "\n");
        c[0].reagir("Bob");
        c[0].reagir(true);
        c[0].reagir(5);
        c[0].emitirSom();
        c[0].reagir(3, 5.5f);
        System.out.println("\n");
        
//        l.setIdade(99);
//        l.setMembros(8);
//        l.setPeso(50.55f);
//        System.out.print(l.toString() + "\n");
//        l.emitirSom();
    }
    
}
