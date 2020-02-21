package aula08;

public class Funcionario extends Pessoa implements PesquisaFuncionario{
    private Pessoa nome;
    private Pessoa idade;
    private Pessoa sexo;
    private String setor;
    private boolean trabalhando;

    public Funcionario(int i) {
        super(i);
//        this.nome = nome;
//        this.idade = idade;
//        this.sexo = sexo;
//        this.setor = setor;
//        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }
    
    
   
}
