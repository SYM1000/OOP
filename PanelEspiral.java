import javax.swing.JPanel;

/**
 * PanelEspiral
 */
public class PanelEspiral extends JPanel{

    //Atributos
	private int vertices;
	private float radio;
	private int lados;
	
	public Espiral() {
        super();
        this.setPreferredSize(new Dimension(800,800));
		this.vertices = 8;
		this.radio = 250;
		this.lados = 26;	
	}
	
	public void paint(Graphics g) { 
				
		super.paintComponents(g);
		int[] xs = new int[lados];
		int[] ys = new int[lados];
		
		
		for (int i = 0; i < lados; i++) {
			xs[i] = (int) ((int) ((Math.cos((i * 2 * Math.PI) / vertices) * (radio - (i * 10))))) + 370;
			ys[i] = (int) ((int) ((Math.sin((i * 2 * Math.PI) / vertices) * (radio - (i * 10))))) + 370;
			}
		
		g.setColor(Color.BLACK);
		g.drawPolyline(xs, ys, lados);
	}
    
}