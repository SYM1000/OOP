//Satiago Yeomans
//A01251000

import java.awt.Color;


import java.awt.Graphics;

import javax.swing.JFrame;

public class DianaNumerada extends Diana {
	
	
	public DianaNumerada() {
		super();
	}

	public DianaNumerada(int xPos, int yPos) {
		super(xPos,yPos);
	}
	
	
	public void paint(Graphics g) {
		super.pintaFigura(g);
		
		
		String numero_10 = "10";
		
		g.setColor(Color.BLACK);
		g.drawString(numero_10, -5 + ( (this.ancho/2) - ((this.ancho/2)/18) ), 38 + ( (this.ancho/2) - ( 1 * (this.ancho)/6) + ((this.ancho/2 ) /5) ));

		for(int i = 5; i > 0;i--) {
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
	
	

}

