//Santiago Yeomans
//A01251000
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Espiral extends JFrame{
	private JPanel panel;
	
	public Espiral(){
		super();
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(600,800));
		add(panel);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Tarea Espiral");
		this.setVisible(true);
		this.setResizable(true);
		pack();
		
		
		
		
	}
	

}
