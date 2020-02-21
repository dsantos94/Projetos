package ProjetoLivro;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(String n, int i, String s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
                
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    private int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    private String getSexo(){
        if (this.sexo.equals("Masculino") || this.sexo.equals("Feminino")) {
            return this.sexo;
        } else {
            return "Invalido";
        }
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public void imprimirInformacoesPessoa(){
        System.out.println("---------------- Informações do Aluno ---------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("-----------------------------------------------------");
    }
}
