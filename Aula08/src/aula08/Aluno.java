package aula08;

public class Aluno extends Pessoa implements PesquisaAluno{
    private Pessoa nome;
    private Pessoa idade;
    private Pessoa sexo;
    private boolean matricula;
    private String curso;
    
    public Aluno(int i){
        super(i);
//        this.nome = no;
//        this.idade = id;
//        this.sexo = se;
//        this.matricula = m;
//        this.curso = c;
    }

    public boolean getMatricula() {
        return this.matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean cancelarMatricula(boolean m) {
        this.setMatricula(m);
        if (this.getMatricula() == false) {
            System.out.println("Sua matricula está cancelada.");
        } else {
            System.out.println("Sua matricula está ativa.");
        }
        return this.getMatricula();
    }
    
    
    
    
}
