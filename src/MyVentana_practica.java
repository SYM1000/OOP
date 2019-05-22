import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyVentana_practica extends JFrame{
	
	public MyVentana_practica() {
		super("Ventana para practicar");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyPanelDibujo_Practica pd = new MyPanelDibujo_Practica();
		this.add(pd);		
		MyPanelControles_Practica pc =  new MyPanelControles_Practica();
		this.add(pc, BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String args[]) {
		MyVentana_practica ventana = new MyVentana_practica();
		
	}

}
