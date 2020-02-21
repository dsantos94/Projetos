package aula02;

public class Caneta {
    String marca;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status (){
        System.out.println("Marca da caneta: " + this.marca);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta da canta: " + this.ponta);
        System.out.println("Nivel de carga: " + this.carga + "%");
        System.out.println("Tampada ou não? " + this.tampada + "\n");
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Impossivel rabiscar");
        }
            else
        {
            System.out.println("Permissao para rabiscar");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
