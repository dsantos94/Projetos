package HerancaPessoa;

public final class Bolsista extends Aluno{
    private float bolsa;
    
    public float getBolsa(){
        return this.bolsa;
    }
    
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    
    public final void renovarBolsa(){
        this.setBolsa(this.getBolsa() + (12.5f / 100));
        System.out.println("Com desconto de 12,5%, sua mensalidade irá custar " + 
                this.getBolsa() + ".");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("\n" + this.nome + " ja pagou sua mensalidade."); 
    }
}
