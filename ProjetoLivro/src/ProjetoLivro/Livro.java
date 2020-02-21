package ProjetoLivro;

public class Livro implements ConsultaLivro{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String a, String ti, Pessoa l, int to){
        this.setAutor(a);
        this.setTitulo(ti);
        this.setLeitor(l);
        this.setTotPaginas(to); 
        this.setAberto(false);
    }

    
    public String detalhes() {
            return "Livro {\n" + "titulo: " + this.titulo + ",\n autor: " + this.autor + ",\n totPaginas: " 
                + this.getTotPaginas() + ",\n pagAtual: " + this.pagAtual + ",\n aberto: " + this.aberto 
                + ",\n leitor: " + leitor.getNome() + "\n" + '}';
    }
    
    
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String a){
        this.autor = a;
    }
    
    public int getTotPaginas(){
        return this.totPaginas;
    }
    
    public void setTotPaginas(int t){
        this.totPaginas = t;
    }
    
    public int getPagAtual(){
        return this.pagAtual;
    }
    
    public void setPagAtual(int p){
        this.pagAtual = p;
    }
    
    public boolean getAberto(){
        return this.aberto;
    }
    
    public void setAberto(boolean a){
        this.aberto = a;
    }
    
    public Pessoa getLeitor(){
        return this.leitor;
    }
    
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (this.getTotPaginas() < p) {
                this.setPagAtual(0);   
        } else {    
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPagina() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        this.setPagAtual(this.getPagAtual() - 1);
    }    
}
