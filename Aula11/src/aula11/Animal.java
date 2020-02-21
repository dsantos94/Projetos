package aula11;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    public abstract void emitirSom();
    
    public Animal(float p, int i, int m){
        this.peso = p;
        this.idade = i;
        this.membros = m;
    }
    
    private float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    private int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    private int getMembros(){
        return this.membros;
    }
    
    public void setMembros(int membros){
        this.membros = membros;
    }

    @Override
    public String toString() {
        return  "Animal {" + "peso= " + this.peso + ", idade= " + this.idade + ", membros= " + this.membros + '}';
    }
    
    
}
