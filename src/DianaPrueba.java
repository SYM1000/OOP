import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DianaPrueba extends JFrame{
	
	//Atributos
	protected int xPos;
	protected int yPos;
	protected int ancho;
	protected Color colorCentro;
	
	//Constructor default
	public DianaPrueba() {
		this.ancho = 200;
		this.colorCentro = Color.RED;
		
		//this.setPreferredSize(new Dimension(800,800));
		this.setSize(new Dimension(800,800));
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	//Constructor con parametros
	public DianaPrueba(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		  
	}
	
	//Setters
	public void setAncho(int a) {
		this.ancho = a;
	}
	
	public void setColor(Color a) {
		this.colorCentro = a;
	}
	
	//Getters
	public int getAncho() {
		return this.ancho;
	}
	
	public Color getColorCentro() {
		return this.colorCentro;
	}
	
	//Setter de Posicion Inicial
	public void setPosicionIniciall(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	
	/*
	//Metodo para pintar 
	//public void pintaFigura(Graphics g) {
	public void paint(Graphics g) {
		super.paintComponents(g);
		

		int radio = this.ancho/4;
		
		
		Color color;
		
		for(int i = 6; i > 0; i--) {
			
			int numero= -i+10;
			String strDiana= Integer.toString(numero);
			String numero_10 =  "10";
			
			
			if (i%2 == 0) {
				color = Color.BLACK;
			}else if(i == 1){
				color = this.colorCentro;
				
			}else {
				color = Color.WHITE;
			}
			g.setColor(color);
			g.fillOval(400 -(i*(radio/2)) ,400-(i*(radio/2)), ((i*(radio))) , ((i*(radio)) )) ;
		
		
		g.drawString(numero_10, 490 - (this.ancho/2 -(this.ancho/2/18)-(i*(this.ancho/2)/6)-((this.ancho/2)/6)/2), 200 + ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5)));
			
		g.drawString(strDiana, 490 - (this.ancho/2 -(this.ancho/2/18)-(i*(this.ancho/2)/6)-((this.ancho/2)/6)/2), 200 + ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5)));
		g.drawString(strDiana, 490 - ( this.ancho/2 -(this.ancho/2/18)+(i*(this.ancho/2)/6)+((this.ancho/2)/6)/2 ), 200 + ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5)));
		g.drawString(strDiana, 490 -( this.ancho/2 -(this.ancho/2/18) ), 200 + ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5) -(i*(this.ancho/2)/6)-((this.ancho/2)/6)/2) );
		g.drawString(strDiana, 490 -(this.ancho/2 -(this.ancho/2/18) ), 200 + ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5)+(i*(this.ancho/2)/6)+((this.ancho/2)/6)/2) );	
		//g.drawString(str, x, y);
		numero = numero - 1;
		
		}
		
		
	}
	
	*/
	
	public void paint(Graphics g) {
		super.paintComponents(g);
		
		int radio = this.ancho/6;
		Color color;
		
		
		
for(int i = 6; i > 0; i--) {
			
			if (i%2 == 0) {
				color = Color.BLACK;
			}else if(i == 1){
				color = this.colorCentro;
				
			}else {
				color = Color.WHITE;
			}
			g.setColor(color);
			g.fillOval(98 -(i*(radio/2)) ,120 -(i*(radio/2)), ((i*(radio))) , ((i*(radio)) )) ;
}
		
		
		String numero_10 = "10";
		
		g.setColor(Color.BLACK);
		g.drawString(numero_10, -5 + ( (this.ancho/2) - ((this.ancho/2)/18) ), 38 + ( (this.ancho/2) - ( 1 * (this.ancho)/6) + ((this.ancho/2 ) /5) ));

		for(int i=5; i>0;i--) {
			int numero = -i + 10;
			String numero_diana= Integer.toString(numero);
			
			if(i%2 != 0) {
				g.setColor(Color.WHITE);

			}else {
				g.setColor(Color.BLACK);
			}
			
			g.drawString(numero_diana, ( this.ancho/2 -(this.ancho/2/18)-(i*(this.ancho/2)/6)-((this.ancho/2)/6)/2 ) ,22 + ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5)));
			g.drawString(numero_diana,  ( this.ancho/2 -(this.ancho/2/18)+(i*(this.ancho/2)/6)+((this.ancho/2)/6)/2 ), 22 +( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5) ) );
			
			g.drawString(numero_diana, ( this.ancho/2 -(this.ancho/2/18)), 22 + ( ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5)-(i*(this.ancho/2)/6)-((this.ancho/2)/6)/2)) );
			g.drawString(numero_diana, this.ancho/2 -(this.ancho/2/18), 22 + ( this.ancho/2 -(this.ancho/2/6)+(this.ancho/2/5)+(i*(this.ancho/2)/6)+((this.ancho/2)/6)/2));		
			
		}
	}
		
		
	
	public static void main(String[] args) {
		Diana a = new Diana();
	}

}



