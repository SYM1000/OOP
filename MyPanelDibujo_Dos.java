import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanelDibujo_Dos extends JPanel implements MouseMotionListener, MouseListener{
	
	//Atributos
	private Image fondo;
	private MyVentana_Dos pv;
	private MyPanelControles_Dos pc;
	private int xInicial,
				yInicial,
				xFinal,
				yFinal;
	private int extra;
	//private boolean signo;
	
	
	
	//Constucotor
	public MyPanelDibujo_Dos(MyVentana_Dos ventana, MyPanelControles_Dos a) {
		super();
		this.pv = ventana;
		this.pc = a;
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setPreferredSize(new Dimension(1000,800));
		this.fondo = new ImageIcon("wallpaper2.jpg").getImage();
		this.xInicial = 0;
		this.yInicial = 0;
		this.xFinal = 0;
		this.yFinal = 0;
		this.extra = 0;
		
	}
	
	
	/*
	 *creo que hice esto extra
	 *
	public int getxIncicial() {
		return this.xInicial;
	}
	
	public int getyIncicial() {
		return this.yInicial;
	}
	
	public int getxFinal() {
		return this.xFinal;
	}
	
	public int getyFinal() {
		return this.yFinal;
	}
	*/
	
	
	public void setExtra(int a) {
		this.extra = a;
	}
	
	
	
	
	//Metodo para pintar
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawImage(this.fondo, 0, 0, this.getWidth(), this.getHeight(), this);
		
		
		if(pc.getbCuadrado() == true) {
			g.drawRect(this.xInicial, this.yInicial + this.extra, (this.xFinal - this.xInicial), (this.yFinal - this.yInicial));
			
			
			
		} else if (pc.getbCirculo() == true) {
			g.drawOval(this.xInicial, this.yInicial + this.extra, (this.xFinal - this.xInicial), (this.yFinal - this.yInicial));
			
			
		} else if(pc.getbLinea() == true) {
			g.drawLine(this.xInicial, this.yInicial + this.extra, this.xFinal, this.yFinal);
		}
	}



	@Override
	public void mouseDragged(MouseEvent e) {
		this.xFinal = e.getX();
		this.yFinal = e.getY();
		this.repaint();
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		this.xInicial = e.getX();
		this.yInicial = e.getX();
		this.repaint();
		
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
