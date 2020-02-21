package aula10;

public abstract class Animal {
    private float peso;
    private int idade;
    private int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
   
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal {" + "peso= " + peso + " kg, idade= " 
                + idade + " anos, membros= " + membros + '}';
    }
    
    
    
}
