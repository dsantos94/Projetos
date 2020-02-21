package projetoventilador;

public class Ventilador {
    public String marca;
    public String modelo;
    public int velocidade;
    private int paletas;
    protected boolean ligado;
    protected int codigo;
    protected int anoFabricacao;
    public boolean rotacao;
       
    public Ventilador(int paletas, boolean ligado, boolean rotacao){
        this.paletas = paletas;
        this.ligado = ligado;
        this.rotacao = rotacao;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m; 
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public void setVelocidade(int v){
        this.velocidade = v;      
    }
    
    public int getPaletas(){
        return this.paletas;
    }
    
    public void setPaletas(int p){
        this.paletas = p;
    }
    
    public boolean getLigado(){
        return this.ligado;
    }
    
    public void setLigado(boolean l){
        this.ligado = l;
    }
    
    public int getAnofabricacao(){
        return this.anoFabricacao;
    }
    
    public void setAnofabricacao(int a){
        this.anoFabricacao = a;
    }
    
    public boolean getRotacao(){
        return this.rotacao;
    }
    
    public void setRotacao(boolean r){
        this.rotacao = r;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int c){
        this.codigo = c;
    }
    void info(){
        System.out.println("Marca do ventilador: " + getMarca());
        System.out.println("Modelo do ventilador: " + getModelo());
        System.out.println("Nivel da velocidade: " + getVelocidade());
        System.out.println("Numero de paletas: " + getPaletas());
        System.out.println("Ligado ou desligado: " + getLigado());
        System.out.println("Codigo do ventilador: " + getCodigo());
        System.out.println("Ano da fabricação do ventilador: " + getAnofabricacao());
        System.out.println("Esta girando? " + getRotacao() + "\n");
    }
    
    void ligado(){
        this.ligado = true;
    }
    
    void desligado(){
        this.ligado = false;
    }
    
    void gira(){
        if (this.ligado == true){
            this.rotacao = true;
            System.out.println("Ventilador ligado.");
            System.out.println("Permitido girar o ventilador \n");
        } else if (this.ligado == false){
            this.rotacao = false;
            System.out.println("Não permitido girar: Ventilador desligado \n");
        }
    }
    
    void naogira(){
        if (this.ligado == true){
            System.out.println("Ligado o ventilador, mas não esta girando \n");
        }
        else if(this.ligado == false)
        {
            this.rotacao = false;    
            System.out.println("Aviso: não é permitido girar o ventilador, pois esta desligado \n");
        }
    }
}

