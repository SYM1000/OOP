
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DianaPanel extends JFrame {
	
	private static DianaNumerada dn = new DianaNumerada();
	
	
	public DianaPanel(Diana Numerada) {
		DianaNumerada a =  new DianaNumerada();
		this.dn = (DianaNumerada) Numerada;
		//this.setPreferredSize(new Dimension(800,800));
		this.setSize(new Dimension(400,400));
		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		DianaPanel a = new DianaPanel(dn);
	}

}
