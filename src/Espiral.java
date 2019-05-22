//Santiago Yeomans
//A01251000

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Espiral extends JPanel implements ActionListener { 
	
	//Atributos
	private int vertices;
	private float radio;
	private int lados;
	private JPanel controles;
	private JLabel etiqueta,
					jlradio,
					jllados;
	private JTextField tfradio;
	private JTextField tflados;
	private JButton btnCrear,
					btnBasica;
	
	public Espiral() {
		super();
		this.vertices = 8;
		this.radio = 250;
		this.lados = 25;
		this.controles = new JPanel();
		this.etiqueta = new JLabel("Controles de la Espiral");
		this.tfradio = new JTextField(20);
		this.tflados =  new JTextField(20);
		this.jlradio = new JLabel("Radio: ");
		this.jllados = new JLabel("Lados: ");
		this.btnCrear = new JButton("Crear Espiral");
		this.btnBasica = new JButton("Espiral Basica");
		
		
		JFrame frame = new JFrame();
		this.setPreferredSize(new Dimension(800,800));
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.controles.setPreferredSize(new Dimension(250,800));
		frame.getContentPane().add(controles,BorderLayout.WEST);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Tarea Espiral");
		
		
		this.controles.setBackground(Color.white);
		this.etiqueta.setFont(new Font("Serif", Font.PLAIN, 26));
		this.controles.add(etiqueta);
		this.controles.add(jlradio).setFont(new Font("Serif", Font.PLAIN, 18));
		this.controles.add(tfradio);
		this.controles.add(jllados).setFont(new Font("Serif", Font.PLAIN, 18));
		this.controles.add(tflados);
		this.btnCrear.addActionListener(this);
		this.controles.add(btnCrear);
		this.btnBasica.addActionListener(this);
		this.controles.add(btnBasica);
		
		
	}
	
	public Espiral(int lados, float radio) {
		super();
		this.vertices = 8;
		this.lados = lados;
		this.radio = radio;
		this.controles = new JPanel();
		this.etiqueta = new JLabel("Controles de la Espiral");
		this.tfradio = new JTextField(20);
		this.tflados =  new JTextField(20);
		this.jlradio = new JLabel("Radio: ");
		this.jllados = new JLabel("Lados: ");
		this.btnCrear = new JButton("Crear Espiral");
		this.btnBasica = new JButton("Espiral Basica");
		
		
		JFrame frame = new JFrame();
		this.setPreferredSize(new Dimension(800,800));
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.controles.setPreferredSize(new Dimension(250,800));
		frame.getContentPane().add(controles,BorderLayout.WEST);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Tarea Espiral");
		
		
		this.controles.setBackground(Color.white);
		this.etiqueta.setFont(new Font("Serif", Font.PLAIN, 26));
		this.controles.add(etiqueta);
		this.controles.add(jlradio).setFont(new Font("Serif", Font.PLAIN, 18));
		this.controles.add(tfradio);
		this.controles.add(jllados).setFont(new Font("Serif", Font.PLAIN, 18));
		this.controles.add(tflados);
		this.btnCrear.addActionListener(this);
		this.controles.add(btnCrear);
		this.btnBasica.addActionListener(this);
		this.controles.add(btnBasica);
		
		
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	
	public void paint(Graphics g) { 
				
		super.paintComponents(g);
		int[] xs = new int[this.lados];
		int[] ys = new int[this.lados];
		
		
		for (int i = 0; i < this.lados; i++) {
			xs[i] = (int) ((int) ((Math.cos((i * 2 * Math.PI) / this.vertices) * (this.radio - (i * 10))))) + 370;
			ys[i] = (int) ((int) ((Math.sin((i * 2 * Math.PI) / this.vertices) * (this.radio - (i * 10))))) + 370;
			}
		
		g.setColor(Color.BLACK);
		g.drawPolyline(xs, ys, this.lados);
	}
	
	
	public static void main(String[] args) { 
		
		Espiral espiral = new Espiral();
		
		
		}

	@Override
	public void actionPerformed(ActionEvent evt) {
			if(evt.getSource() == btnCrear) {
			setLados(Integer.parseInt(tflados.getText()));
			setRadio(Integer.parseInt(tflados.getText()));
			this.repaint();
			} else {
				setLados(25);
				setRadio(250);
				this.repaint();
			}
		
	}
}
