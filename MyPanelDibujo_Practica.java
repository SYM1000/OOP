import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyPanelDibujo_Practica extends JPanel implements MouseListener, Runnable, MouseMotionListener{
	
	private Image pendejo;
	private int x;
	private int y;
	private Thread hilo;
	private int xCI;
	private int yCI;
	private int xCF;
	private int yCF;
	
	private int[] xs;
	private int[] ys;
	private int cX;
	private int cY;
	private int radio;
	
	//private JSlider slider;
	
	
	public MyPanelDibujo_Practica() {
		this.setPreferredSize(new Dimension(800,800));
		this.setBackground(Color.WHITE);
		this.pendejo = new ImageIcon("pocoyoSolo.png").getImage();
		this.x = 0;
		this.y = 0;
		this.xCI = 0;
		this.yCI = 0;
		this.xCF = 0;
		this.yCF = 0;
		this.hilo = new Thread(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.repaint();
		
		/*
		this.slider = new JSlider(JSlider.VERTICAL,0,100,50);
		this.slider.setMajorTickSpacing(25);
		this.slider.setMinorTickSpacing(5);
		this.slider.setPaintLabels(true);
		this.slider.setPaintTicks(true);
		this.slider.addChangeListener(this);
		this.add(this.slider);
		*/
		
		
		this.xs = new int[9];
		this.ys = new int[9];
		this.cX = 300;
		this.cY = 300;
		this.radio = 200;
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillOval(x+30, y+600, 240, 80);
		
		g.setColor(Color.RED);
		g.fillOval(x+50, y+430, 100, 100);
		
		g.setColor(Color.BLACK);
		g.drawLine(x+100, y+600, x+100, y+520);
		
		g.setColor(Color.CYAN);
		g.fillArc(x+30, y+600, 240, 80, 0, 110);
		
		g.drawImage(pendejo, x + 150, y + 600, 40, 40, this);
		
		
		
		
		//Ciruclo para poder modifcar el ancho
		g.fillOval(xCI, yCI, (xCF - xCI), (yCF - yCI));
		
		
		/*
		//Dibujar linea
		g.drawLine(xCI, yCI, xCF, yCF);
		*/
		
		
		for(int i=0; i<9; i++) {
			xs[i] = cX + (int) (radio*(1-((double)(i%2)/2))*Math.sin(Math.toRadians(i*45))); //Calculo de las coordenadas en "x"
			ys[i] = cY + (int) (radio*(1-((double)(i%2)/2))*Math.cos(Math.toRadians(i*45))); //Calculo de las coordenadas en "y"
			}	
		g.drawPolyline(xs, ys, 9); //Dibuja el espiral
		g.drawPolyline(xs, ys, 9); //Dibuja el espiral
		
		
	}

	ButtonGroup bg = new ButtonGroup();

	@Override
	public void run() {
		try {
			while(this.x <= 800){
			Thread.sleep(10);;
			this.x+=2;
			this.y--;
			this.repaint();
			}
		}catch(InterruptedException error){
			System.out.println(error);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.hilo.start();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.xCI = e.getX();
		this.yCI = e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		/*
		this.x = e.getX() - 200;
		this.y = e.getY() - 500;
		this.repaint();
		*/
		
		this.xCF = e.getX();
		this.yCF = e.getY();
		this.repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * FORMULA PARA DIBUJAR UNA ESTRELLA
	 
	xs[i] = cx + (int)(radio * (1 -((double)(i%2)/2)) * Math.sin(Math.toRadians(i*45)));
	yx[i] = cy + (int)(radio * (1-((double)(i%2)/2)) * Math.cos(Math.toRadians(i*45)));
	
	g.drawPolyline(xs,ys,9);
*/
	
}
