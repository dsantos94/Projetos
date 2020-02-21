package aula05;

public class Aula05 {
    
    public static void main(String[] args) {
        Controlador c1 = new ControleRemoto(); 
        
        c1.ligar();
        c1.play();
        c1.fecharMenu();
        c1.pause();
        c1.abrirMenu();
    }
    
}
