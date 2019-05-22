import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class MyPanelDibujo_linea extends JPanel implements MouseMotionListener, Runnable, MouseListener{
	
	
	private Image fondo;
	private int unoX = 200,
				unoY = 200,
				dosX = 600,
				dosY = 600;
	private int xCuadrado,
				yCuadrado;
	private boolean dibujar = false;
	private boolean mover;
	private Thread hilo;

	
	public MyPanelDibujo_linea(){
		super();
		this.setPreferredSize(new Dimension(800,800) );
		this.fondo = new ImageIcon("wallpaper.png").getImage();
		this.xCuadrado = 400;
		this.yCuadrado = 300;
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.hilo = new Thread(this);
		this.mover = false;
		//hilo.start();
		
		
		
	}
	
	//Settters
	public void setUnoX(int a) {
		this.unoX = a; 
	}
	
	public void setUnoY(int a) {
		this.unoY = a; 
	}
	
	public void setDosX(int a) {
		this.dosX = a; 
	}
	
	public void setDosY(int a) {
		this.dosY = a; 
	}
	
	public void setDibujar(boolean a) {
		this.dibujar = a;
	}
	
	
	//Metodo pintar
	public void paint(Graphics g) {
		super.paintComponents(g);

		g.drawImage(this.fondo, 0,0, this.getWidth(), this.getHeight(), this);
			
		if(dibujar == true) {
			g.setColor(Color.WHITE);
			//g.drawOval(85, 85, 100, 100);
			g.fillRect(this.xCuadrado, this.yCuadrado, 100, 100);
			this.repaint();
		}else {
			//Dibujar la linea
			g.setColor(Color.WHITE);
			g.drawLine(unoX,unoY, dosX, dosY);
			this.repaint();
		}
		}
	
	//Setters y Getters del Cuadrado
	
	public void setxCuadrado(int a) {
		this.xCuadrado = a;
	}
	
	public void setyCuadrado(int a) {
		this.yCuadrado = a;
	}
	
	public int getxCuadrado(){
		return this.xCuadrado;
	}
	
	public int getyCuadrado(){
		return this.yCuadrado;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.xCuadrado = e.getX() -45;
		this.yCuadrado = e.getY() -45;
		System.out.println("Este pedo si jaló");
		System.out.println(this.xCuadrado);
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void run() {
		//System.out.println("EL metodo run si funciona");
		while(this.xCuadrado <= 800) {
			
		if (this.mover == true) {
			try {
			Thread.sleep(10);
			this.xCuadrado+=1;
			this.yCuadrado--;
			this.repaint();
			this.repaint();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}}}
		
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		this.mover = true;
		System.out.println("Se hizo Click");
		this.hilo.start();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

		
		
		
	}


