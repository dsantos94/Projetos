package HerancaPessoa;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public final float receberAum(){
         this.setSalario(this.getSalario() + (0.15f * this.getSalario()));
         return this.getSalario();
    }
}
