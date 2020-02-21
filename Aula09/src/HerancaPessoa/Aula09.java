package HerancaPessoa;

public class Aula09 {
    
    public static void main(String[] args) {
       Visitante p1 = new Visitante();
       Bolsista p2 = new Bolsista();
       Aluno p3 = new Aluno();
       Professor p4 = new Professor();
       Tecnico p5 = new Tecnico();
       
//       p1.setIdade(50);
//       p1.setNome("Armando");
//       p1.setSexo("M");
//       System.out.println(p1);
       
//       p3.setNome("Jubileu");
//       p3.setIdade(30);
//       p3.setSexo("M");
//       p3.setCurso("POO");
//       p3.setMatricula(5647);
//       System.out.println(p3.toString());
       
//       p2.setNome("Abreu");
//       p2.setIdade(35);
//       p2.setSexo("M");
//       p2.setCurso("POO");
//       p2.setBolsa(427f);
//       p2.setMatricula(3426);
//       p2.fazerAniver();
//        System.out.println(p2.toString());
//        p2.pagarMensalidade();
//        p2.renovarBolsa();
        
        p5.setNome("Abreu");
       p5.setIdade(35);
       p5.setSexo("M");
       p5.setCurso("POO");
       p5.setMatricula(3426);
       p5.fazerAniver();
        System.out.println(p5.toString()+"\n");
       p5.praticar();
        
        
    }
    
}
