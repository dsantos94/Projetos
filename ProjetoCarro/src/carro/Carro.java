package carro;

public class Carro {
    
    public static void main(String[] args) {
        CarroAME c1 = new CarroAME();
        c1.marca = "Renaut";
        c1.nome = "Clio";
        c1.ano = 2010;
        c1.cor = "Preto";
        c1.placa = "GKC1847";
        c1.regularizacao = false;
        
        
        c1.regularizado();
        c1.status();
        c1.testdrive();
    }
    
}
