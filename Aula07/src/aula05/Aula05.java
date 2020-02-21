package aula05;
import java.*;

/**
 *
 * @author DSANTOS
 */
public class Aula05 {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Lutador c1 []= new Lutador[6];
            
        c1[0] = new Lutador("Preety Boy", "France", 31, 1.75f, 68.9f, 11, 2, 1);
        c1[1] = new Lutador("Putscript", "Brazil", 29, 1.68f, 57.8f, 14, 2, 3);
        c1[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        c1[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        c1[4] = new Lutador("Ufocobol", "Brazil", 37, 1.70f, 119.3f, 5, 4, 3);
        c1[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        //c1[0].apresentar();
        //c1[0].setPeso(10f);
        //c1[0].apresentar();
        
        
        
        /*for (int i = 0; i < 6; i++) {
            System.out.println(c1[i]);
        }*/
        
//        c1[1].vitoria();
//        c1[1].empate();
//        c1[1].derrota();
//        c1[1].setPeso(120);
//        c1[1].apresentar();
//        c1[0].status();
//        c1[1].status();
//        c1[2].status();
//        c1[3].status();
//        c1[4].status();
//        c1[5].status();
        Luta l = new Luta();
        l.marcarLuta(c1[0], c1[1]);
        l.luta();
    }
    
}
