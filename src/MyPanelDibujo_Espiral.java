import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanelDibujo_Espiral extends JPanel{ //Importo el JPanel, por que lo que estoy creando es un panel que despues inseraré en el JFame de la clase MyVetnana
	
	//Atributos
	private int vertices;
	private float radio;
	private int lados;
	//Constructor de la clase por default
	public MyPanelDibujo_Espiral() {

		//Inicializamos todos los atributos
		super();		 //SIEMPE EL SUPER AL INCIO DEL CONSTRUCOTR
		this.vertices = 8;
		this.radio = 250;
		this.lados = 25;
		
		//Ponemos toda la info del JPanel de esta clase
		this.setPreferredSize(new Dimension(800,800));
	}	
	
	//Setters
	public void setLados(int lados) {
		this.lados = lados;
		this.repaint();
	}
	
	public void setRadio(float radio) {
		this.radio = radio;
		this.repaint();
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
	
	
	

}
