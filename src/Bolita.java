//Bolita es una clase no es necesario crear un panel, solo necesitamos pasarle elc ontexto grafuco
//MUy impoertatne llamar el metodo super en el graphics 

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Bolita {
	
	private int radio,
				px,
				py;
	private Color colorFondo;
	private Color colorLinea;
	
	public Bolita(int radio, Color colorFondo, Color colorLinea, int px, int py) {
		this.radio = radio;
		this.colorFondo = colorFondo;
		this.colorLinea = colorLinea;
		this.px = px;
		this.py = py;
		
	}
	
	public Bolita() {
		Random ran=new Random();
		this.radio = 50 + ran.nextInt(200);
		this.colorFondo = new Color(ran.nextInt(255), ran.nextInt(255), px);
		this.px = ran.nextInt(700);
		this.py = ran.nextInt(500);
	}
	
	public void paina(Graphics g) {
		g.setColor(this.colorFondo);
		g.fillOval(this.px, this.py, this.radio*2, this.radio*2);
		g.setColor(this.colorLinea);
		g.drawOval(this.px, this.py, this.radio*2, this.radio*2);
		
	}
	

}
