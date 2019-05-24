import javax.swing.JFrame;
import javax.swing.*;

/**
 * TareaEspiral
 */
public class TareaEspiral extends JFrame{

    public TareaEspiral(){
        super("Tarea Espiral");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        PanelEspiral pe = new PanelEspiral();
        this.add(pe);
        this.add(new EspiralControles(pe),BorderLayout.WEST);
        this.pack();
        this.setVisible(true);
        }

    public static void main(String[] args) {
        TareaEspiral espiral = new TareaEspiral();
    }
}