import javax.swing.JFrame;
import javax.swing.JPanel;

public class DianaVentana extends JFrame {
	
	private DianaNumerada a;
	private DianaPanel panel;
	
	public DianaVentana(DianaPanel panel) {
		super("Diana");
		this.panel = panel;
		this.setSize(1100, 800);
		//this.a = numerada;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		DianaPanel pd = new DianaPanel(a);	
		this.add(pd);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		DianaNumerada n = new DianaNumerada();
		DianaPanel p = new DianaPanel(n);
		DianaVentana v = new DianaVentana(p);
	}

}
