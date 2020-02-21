package aula02;

public class Caneta {
    public String marca;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public Caneta (String marca, String cor, float ponta){
        this.marca = marca;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = true;
    } 
    
    public void info(){
        
    }
    
    public String getMarca(){
        return this.marca;
    } 
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    public void setCarga(int carga){
        this.carga = carga;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
            
    public void status (){
        System.out.println("Marca da caneta: " + this.marca);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta da canta: " + this.ponta);
        System.out.println("Nivel de carga: " + this.carga + "%");
        System.out.println("Tampada ou não? " + this.tampada + "\n");
    }
    
    private void rabiscar(){
        if (this.tampada == true){
            System.out.println("Impossivel rabiscar");
        }
            else
        {
            System.out.println("Permissao para rabiscar");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
