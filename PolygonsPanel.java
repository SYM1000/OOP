import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

class PolygonsPanel extends JPanel {
	
    public void paint(Graphics g) {
        super.paintComponent(g);
        
        int vertice=5;
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);

        Polygon polygon = new Polygon();

        g.setColor(Color.RED);
        polygon.addPoint(xCenter + radius, yCenter);

        //aqui vamos agregar 2 puntos mas por lo tanto agregamos otros 2 metodos matematicos
        for(int i=0; i<vertice; i++){
            polygon.addPoint((int)(xCenter + radius * Math.cos(i * 2 * Math.PI / vertice)), (int)(yCenter - radius * Math.sin(i * 2 * Math.PI / vertice)));
        }

        g.drawPolygon(polygon);
    }
    
    public static void main(String[] args) {
		PolygonsPanel ven = new PolygonsPanel();
	}
    
}
