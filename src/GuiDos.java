//COMO LO HACE LA PAGINA: CREANDO UNA SUB CLASE
/*
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiDos extends JFrame{

	private JLabel etiqueta;
	private JButton btn1;
	private JButton btn2;
	private JPanel panel;
	
	
	public GuiDos(){
		etiqueta = new JLabel("Esperando...");
		btn1 = new JButton("Boton 1");
		btn2 = new JButton("Boton 2");
		panel = new JPanel();
		panel.add(etiqueta);
		panel.add(btn1);
		panel.add(btn2);
		this.add(panel);
		OyenteAccion oyenteBoton = new OyenteAccion();
		
		btn1.addActionListener(oyenteBoton);
		btn2.addActionListener(oyenteBoton);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Ventana con interaccion");
		this.setVisible(true);
		this.setResizable(true);
		this.setPreferredSize(new Dimension(400, 80));
		pack();
	}
	
	
	class OyenteAccion implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		etiqueta.setText("Has pulsado: " + boton.getText());

		}
	}
	
	public static void main(String[] args) {
		GuiDos ventana = new GuiDos();
	}
}

*/

//COMO LO HARÍA PAPA SALINAS
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiDos extends JFrame implements ActionListener{
	
	private JLabel etiqueta;
	private JButton btn1;
	private JButton	btn2;
	private JPanel panel;
	
	
	public GuiDos(){
		super();
		etiqueta = new JLabel ("Ningun boton presionado");
		btn1 = new JButton ("Boton 1");
		btn2 = new JButton ("Boton 2");
		panel = new JPanel();
		
		panel.add(etiqueta);
		panel.add(btn1);
		panel.add(btn2);
		this.add(panel);
		panel.setVisible(true);
		
		
		btn1.addActionListener(null);
		btn2.addActionListener(null);
		
		this.setPreferredSize(new Dimension(400,80));
		this.setLayout(null);
		this.setTitle("Ventana Fresona");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		pack();
		

		}


	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == btn1){
			etiqueta.setText("Has pulsado el boton" + btn1.getText());
		} else {
			etiqueta.setText("Has pulsado el boton" + btn2.getText());
		}
		
	}
	
	
	public static void main(String[] args) {
		GuiDos ventana = new GuiDos();
	}
}
































