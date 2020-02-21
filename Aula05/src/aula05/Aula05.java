package aula05;

public class Aula05 {
    
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        
        cb1.setAgencia(3759);
        cb1.setStatus(true);
        cb1.setDono("Maria Aparecida dos Santos");
        cb1.setNumConta(894460359);
        cb1.abrirConta("CC");
        //        cb1.depositar();
        cb1.extrato();
    }
    
}
