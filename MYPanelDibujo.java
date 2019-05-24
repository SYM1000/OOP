//My panel dbujo
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MYPanelDibujo extends JPanel implements Runnable, MouseListener, MouseMotionListener {
	private Image fondo,
					pocoyo;
	private int xV,
				yV,
				xS,
				yS;
	private String nombre="Pocoyo";
	private boolean mover;
	private Color colorGlobo;

	public MYPanelDibujo() {
		super();
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setPreferredSize(new Dimension(800,600));
		this.fondo=new ImageIcon("pocoyo.jpg").getImage();
		this.pocoyo=new ImageIcon("pocoyoSolo.png").getImage();
		this.xV=this.yV=0;
		this.xS=70;
		this.yS=515;
		this.mover=false;
		this.colorGlobo=Color.RED;
		Thread hilo = new Thread(this);
		hilo.start();
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(this.fondo, 0, 0, this.getWidth(), this.getHeight(), this);
		g.setColor(Color.ORANGE);
		g.fillOval(this.xV+50,this.yV+450,200,100);
		g.setColor(Color.CYAN);
		g.fillArc(this.xV+50,this.yV+450,200,100, 0, 110);
		g.drawImage(this.pocoyo, this.xV+160, this.yV+ 460, 30, 30, this);
		g.setColor(Color.BLACK);
		g.drawLine(this.xV+100, this.yV+457, this.xV+100, this.yV+400);
		g.setColor(this.colorGlobo);
		g.fillOval(this.xV+50, this.yV+300, 100, 100);
		g.setColor(Color.WHITE);
		g.drawString("Vamos "+ this.nombre, this.xS, this.yS);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
		this.repaint();
	}
	
	public void setColorGlobo(Color colorGlobo) {
		this.colorGlobo=colorGlobo;
		this.repaint();
	}
	
	public void run() {
		while(this.xV<=550) {
			try{
				Thread.sleep(10);
					if(this.mover) {
						this.xV+=2;
						this.yV--;
						this.repaint();
					}
			} catch (InterruptedException ex ){
				System.out.println("No puede despegar!!");
			}
		}
	}
	
	public void setyV(int yV) {
		this.yV=yV;
		this.repaint();
	}

	public void mouseClicked(MouseEvent e) {
		if (this.mover==false) {
			this.mover=true;
		}else {
			this.mover=false;
		}
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.xS=e.getX();
		this.yS=e.getY();
		System.out.println(this.xS);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
