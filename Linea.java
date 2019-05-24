//Graficos - Dibujar una linea roja: setColor, drawLine.

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;

class Linea extends Frame {

public Linea() {
this.setLayout(null);
this.setSize(200,150 );
this.setVisible( true );
this.setResizable(true);
}

public void paint(Graphics g) {
g.setColor(Color.RED);
//g.drawLine(1, 0, 4, 5);

for(int i = 0; i < 1000; i++){
    g.drawLine(1*3, 2*3, 3*3, 4*3);
}
}

public static void main( String[] args ) {
Linea p = new Linea();
}

}