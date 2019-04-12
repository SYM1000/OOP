import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanelControles_Espiral extends JPanel implements ActionListener{

	//Atributos
	private JLabel etiqueta,
					jlradio,
					jllados;
	private JTextField tfradio,
	   				   tflados;
	private JButton btnCrear,
					btnBasica;
	private MyPanelDibujo_Espiral pd;
	
	
	public MyPanelControles_Espiral(MyPanelDibujo_Espiral dibujo){ // Punto 2
		super();
		this.pd = dibujo; //Punto 3
		this.etiqueta = new JLabel("Controles de la Espiral");
		this.tfradio = new JTextField(20);
		this.tflados =  new JTextField(20);
		this.jlradio = new JLabel("Radio: ");
		this.jllados = new JLabel("Lados: ");
		this.btnCrear = new JButton("Crear Espiral");
		this.btnBasica = new JButton("Espiral Basica");
		
		this.setPreferredSize(new Dimension(250,800));
		this.setBackground(Color.WHITE);
		
		this.etiqueta.setFont(new Font("Serif", Font.PLAIN, 26));
		this.add(etiqueta);
		this.add(jlradio).setFont(new Font("Serif", Font.PLAIN, 18));
		this.add(tfradio);
		this.add(jllados).setFont(new Font("Serif", Font.PLAIN, 18));
		this.add(tflados);
		this.btnCrear.addActionListener(this);
		this.add(btnCrear);
		this.btnBasica.addActionListener(this);
		this.add(btnBasica);
		
	}


	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == btnCrear) {
			this.pd.setLados(Integer.parseInt(tflados.getText()));
			this.pd.setRadio(Integer.parseInt(tflados.getText()));
			
			} else {
				this.pd.setLados(25);
				this.pd.setRadio(250);
				 
			}
		
	}
	
	
}
