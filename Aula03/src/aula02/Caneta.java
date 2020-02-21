package aula02;

public class Caneta {
    public String marca;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada = true;
    
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
