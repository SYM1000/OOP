import java.awt.BorderLayout;
import javax.swing.*;

public class MyVentana extends JFrame{

    public MyVentana(){
        super("Mi primer ventana en Java");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    //Dispose on close cierra una ventana cuando tienes muchas
        MYPanelDibujo pd = new MYPanelDibujo();
        this.add(pd);
        this.add(new MyPanelControles(pd),BorderLayout.WEST);
        this.pack();    //Sirve para definir el tamaño en base a los elementos que contien dentro de él
        this.setVisible(true);
    }

    //Los JFrames tienen un ciclo de vida por defautl
    //Metodo paint ya esta definido por default y el objeto graphics tambien
    
    public static void main(String[] args) {
        MyVentana ventana = new MyVentana();

        
    }
}
