//Satiago Yeomans
//A01251000

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;


public class Diana{
	
	//Atributos
	protected int xPos;
	protected int yPos;
	protected int ancho;
	protected Color colorCentro;
	
	//Constructor default
	public Diana() {
		this.ancho = 200;
		this.colorCentro = Color.RED;
		
	}
	
	//Constructor con parametros
	public Diana(int xPos, int yPos) {
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
	
	//Metodo para pintar
	public void pintaFigura(Graphics g) {

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
		
	}


}
