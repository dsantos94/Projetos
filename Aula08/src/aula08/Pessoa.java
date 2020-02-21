package aula08;

public class Pessoa implements InformacoesExtraPessoa{
    private String nome;
    private int idade = 0;
    private String sexo;
    
    public Pessoa(int i){
//        setNome(n);
//        setIdade(i);
//        setSexo(s);
        fazerAniv(i);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void fazerAniv(int a) {
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + this.nome + ", idade=" + this.idade + ", sexo=" + this.sexo + '}';
    }
    
    
}
