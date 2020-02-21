package aula08;

public class Professor extends Pessoa implements PesquisaProfessor{
    private Pessoa nome;
    private Pessoa idade;
    private Pessoa sexo;
    private String especialidade;
    private float salario;
    
    public Professor(int i){
          super(i);
//        this.nome = no;
//        this.idade = id;
//        this.sexo = se;
//        this.especialidade = e;
//        this.salario = sa;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void receberAumento(){
        this.setSalario(this.getSalario() + (0.5f * this.getSalario()));
    }
    
    @Override
    public void descontaSalario(){
        this.setSalario(this.getSalario() + (5 / this.getSalario()));
    }
    
}
