import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelDiana extends JFrame{
	
	private JPanel panel;


	public PanelDiana() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Diana d = new Diana();

		//d.pintaFigura(g);
		
		
		
		this.pack();
		this.setVisible(true);
		
		
		
	}
		
	
	public static void main(String[] args) {
		PanelDiana pd = new PanelDiana();
	}
	}

	

