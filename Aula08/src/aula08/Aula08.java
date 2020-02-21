package aula08;

public class Aula08 {
    
    public static void main(String[] args) {
        //Pessoa a1 = new Pessoa(0);
        Aluno a2 = new Aluno(0);        
        Professor a3 = new Professor(0);
        Funcionario a4 = new Funcionario(0);
        
        //a1.setNome("Petros");
        a2.setNome("Armando");
        a3.setNome("Vigario");
        a4.setNome("Poly");
        
        //a1.setIdade(25);
        a2.setIdade(30);
        a3.setIdade(45);
        a4.setIdade(60);
        
        //a1.setSexo("M");
        a2.setSexo("M");
        a3.setSexo("M");
        a4.setSexo("F");
        
        //a1.fazerAniv(0);
        a2.fazerAniv(0);
        a3.fazerAniv(0);
        a4.fazerAniv(0);
        
        a2.cancelarMatricula(true);
        a3.setSalario(998.30f);
        a3.receberAumento();
        a4.mudarTrabalho();
        //a2.setMatricula(false);
        
        //System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        System.out.println("\nSalario atual do professor: " + a3.getSalario());
        a2.cancelarMatricula(false);
    }
    
}
