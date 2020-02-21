package aula05;

/**
 *
 * @author DSANTOS
 */
public class Lutador implements Cadastro{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, empates, derrotas;
    
    

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Invalido";            
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }        
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    

//    private void setCategoria() {
//        if (this.getPeso() < 65.7) {
//            this.categoria = "Invalido. Abaixo do escopo.";
//            
//        } else if (this.getPeso() >= 65.7 && this.getPeso() < 77.1) {
//            this.categoria = "Leve";
//            
//        } else if (this.getPeso() >= 77.1 && this.getPeso() < 92.9){
//            this.categoria = "Medio";
//            
//        } else if(this.getPeso() >= 92.9 && this.getPeso() < 120){
//            this.categoria = "Pesado";
//            
//        } else {
//            this.categoria = "Invalido. Acima do escopo.";
//        }
//    }

    public Lutador(String nome, String nac, int i, float a, float p, int v, int d, int e){
        this.setNome(nome);
        this.setNacionalidade(nac);
        this.setIdade(i);
        this.setAltura(a);
        this.setPeso(p);
        this.setVitorias(v);
        this.setDerrotas(d); 
        this.setEmpates(e);   
    }

    /**
     *
     */
    //@Override
    public void apresentar() {
        System.out.println("------------------- Lutador da Noite ------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("-------------------------------------------------------\n\n");
    }

    /**
     *
     */
    //@Override
    public void status() {
//        if (this.getPeso() < 65.7 && this.getPeso() > 120) {
//            System.out.println("---------------------------- AVISO -----------------------------------");
//            System.out.println("O lutador " + this.getNome() + " não está habilitado a lutar no ringue");
//            System.out.println("----------------------------------------------------------------------\n\n");
//        } 
//            else 
//        {
        System.out.println("------------------- Informações resumidas do lutador ------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("----------------------------------------------------------------------\n\n");

        //}
    }
    
    @Override
    public void vitoria() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    @Override
    public void empate() {
        this.setEmpates(this.getEmpates() + 1);
    } 
    
    @Override
    public void derrota(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
}
