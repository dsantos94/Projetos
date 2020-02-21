/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author DSANTOS
 */
public class CarroAME {
    String marca;
    String nome;
    String cor;
    String placa;
    int ano;
    boolean ligado = false;
    boolean regularizacao;
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
        System.out.println("Carro ligado ou desligado: " + this.ligado);
        System.out.println("Regularização do carro: " + this.regularizacao + "\n");
    }
    
    void ligado(){
        this.ligado = true;
    }
    
    void desligado(){
        this.ligado = false;
    }
    
    void testdrive(){
        if (this.regularizacao == true){
            System.out.println("O carro " + this.nome + " de marca " + this.marca + " esta com permissão para ser testado.");
            
            if (this.ligado == true){
                    System.out.println("Ligado. O carro terá movimento.");
                }
                else
                {
                    System.out.println("Desligado. O carro estará imovel.");
                }
        }
        else
        {
            System.out.println("O carro " + this.nome + ", de marca " + this.marca + ", nao tem permissão para ser utilizado.");
        }
    }
    
    void regularizado(){
        this.regularizacao = true;
    }
    
    void desregularizado(){
        this.regularizacao = false;
    }
    
}
