package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    protected String dono;
    private float saldo;
    private boolean status;
    protected int agencia;
    
    public ContaBanco(){
        setSaldo(0);
        setStatus(false);
    }
    
    /*public float getSaldoInicial(){
        return this.salIn;
    }
    
    public void setSaldoInicial(float s){
        this.salIn = s;
    }*/
    
    public void extrato(){
        System.out.println("-------------- Extrato --------------------");
        System.out.println("Dono da nova conta: " + this.getDono());
        System.out.println("Tipo de conta optada: " + this.getTipoConta());
        System.out.println("Agencia da nova conta: " + this.getAgencia());
        System.out.println("Numero da conta obtida: " + this.getNumConta());
        System.out.println("Saldo atual: " + this.getSaldo());
        System.out.println("------------------------------------------- \n");
    }
    
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);
        if ("CC" == t) {
            this.setSaldo(50);
        } 
        else if ("CP" == t) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Permitido fechar conta");
        }
    }
    
    public void depositar(float d){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + d); 
            System.out.println("Deposito realizado para " + this.getDono());
        }else{ 
            System.out.println("Erro ao depositar");
        }
    }
    
    public void sacar(float s){
        if (this.getStatus()) {
            if (this.getSaldo() >= s) {
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado bem agora");
            } else {
                System.out.println("Não foi possível realizar o saque");
            }
        } 
            else 
        {
            System.out.println("Impossível realizar esta operação");
        }
    }
    
    public void pagarMensal(){
        int p = 0;
        if (this.getTipoConta() == "CC"){
            p = 12;
        } else if (this.getTipoConta() == "CP"){
            p = 20;
        }    
        
        if (this.getStatus()){
            if (this.getSaldo() > p){
                this.setSaldo(this.getSaldo() - p);
                System.out.println("Foi possivel o " + this.getDono() + " pagar a mensalidade");
            }else{
                System.out.println("Saldo insuficiente para pagamento"); 
            }    
        } else {
            System.out.println("Impossivel");
        }
            
    }
   
    public int getAgencia(){
        return this.agencia;
    }
    
    public void setAgencia(int a){
        this.agencia = a;
    }
   
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int n){
        this.numConta = n;
    }
    
    public String getTipoConta(){
        return this.tipo;
    }
    
    public void setTipoConta(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
            
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean s){
        this.status = s;
    }
    
    
}
