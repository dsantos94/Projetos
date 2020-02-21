package aula05;

import java.util.Random;

/**
 *
 * @author DSANTOS
 */
public class Luta implements NovaLuta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean confirmaLuta;

    public Luta(){

    }
    /**
     *
     * @return
     */
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    /**
     *
     * @param desafiado
     */
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    /**
     *
     * @return
     */
    public Lutador getDesafiante() {
        return this.desafiante;
    }

    /**
     *
     * @param desafiante
     */
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    /**
     *
     * @return
     */
    public int getRounds() {
        return this.rounds;
    }

    /**
     *
     * @param rounds
     */
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    /**
     *
     * @return
     */
    public boolean getConfirmaLuta() {
        return this.confirmaLuta;
    }

    /**
     *
     * @param confirmaLuta
     */
    public void setConfirmaLuta(boolean confirmaLuta) {
        this.confirmaLuta = confirmaLuta;
    }
           
    /**
     *
     * @param dsdo
     * @param dste
     * @param r
     * @param c
     */
    public Luta(Lutador dsdo, Lutador dste, int r, boolean c){
        this.setConfirmaLuta(c);
        this.setDesafiado(dsdo);
        this.setDesafiante(dste);
        this.setRounds(r);
    }    

    /**
     *
     * @param l1
     * @param l2
     */
    //@Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setConfirmaLuta(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setConfirmaLuta(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    /**
     *
     */
    @Override
    public void luta() {
        if (this.getConfirmaLuta() == true) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0:
                    System.out.println("Empate");
                    this.desafiante.empate();
                    this.desafiado.empate();
                    break;
                case 1:
                    System.out.println("Vitoria do desafiante e derrota do desafiado");
                    this.desafiante.vitoria();
                    this.desafiado.derrota();
                    break;
                case 2:
                    System.out.println("Vitoria do desafiado e derrota do desafiante");
                    this.desafiante.derrota();
                    this.desafiado.vitoria();
                    break;
            }
        } else {
            System.out.println("Não haverá luta até o momento.");
        }
    }
}
