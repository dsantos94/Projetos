package ProjetoLivro;

public class ProjetoLivro {
    
    public static void main(String[] args) {
        Pessoa []a1 = new Pessoa[3];
        Livro []l1 = new Livro[5];
        
        a1[0] = new Pessoa("Armandinho", 22, "Masculino");
        a1[1] = new Pessoa("Erileuza", 20, "Feminino");
        a1[2] = new Pessoa("Deco", 34, "Masculino");
        
        l1[0] = new Livro("Tommy", "O legado", a1[0], 120);
        l1[1] = new Livro("Nietsze", "Common", a1[1], 200);
        l1[2] = new Livro("Folk", "World Wars", a1[2], 280);
        
        l1[0].abrir();
        l1[0].folhear(121);
        a1[0].imprimirInformacoesPessoa();
        a1[1].imprimirInformacoesPessoa();
        a1[2].imprimirInformacoesPessoa();
        System.out.println("\n\n" + l1[0].detalhes());
        
        
    }    
}
