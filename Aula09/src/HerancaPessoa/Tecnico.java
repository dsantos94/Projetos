package HerancaPessoa;

public class Tecnico extends Aluno{
    private String registroProfissional;
    
    public String getRegistroProfisssional(){
        return this.registroProfissional;
    }
    
    public void setRegistroProfissional(String registroProfissional){
        this.registroProfissional = registroProfissional;
    }
    
    public final void praticar(){
        System.out.println("O aluno, " + this.nome + 
                ", até o momento está praticando todos os exercicios em sala de aula");
    }
}
