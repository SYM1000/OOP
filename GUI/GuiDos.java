import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiDos extends JFrame implements ActionListener{
    
    public GuiDos(){
        super("Ventana para la solucion del GuiDos");
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        
        JLabel etiqueta = new JLabel("Esperando..");
        etqueta.setBounds();
    }


}