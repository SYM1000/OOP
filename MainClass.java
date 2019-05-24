//Ejemplo de como se usa drawPolyline 
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass extends JPanel {
	
	public void paint(Graphics g) {
		int[] xs = {25, 75, 125, 85, 125, 75, 25,65,25};
		int[] ys = {50, 90, 50, 100, 150, 110, 150,100,50};
		g.drawPolyline(xs, ys, 9);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new MainClass());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}