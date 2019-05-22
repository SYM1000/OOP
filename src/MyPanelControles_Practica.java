import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyPanelControles_Practica extends JPanel implements ChangeListener{
	
	//Atributos
	private JSlider slider;
	
	public MyPanelControles_Practica() {
		super();
		this.setPreferredSize(new Dimension(200,800));
		this.setBackground(Color.WHITE);
		
		this.slider = new JSlider (JSlider.VERTICAL,0,200,100);
		this.slider.setMajorTickSpacing(25);
		this.slider.setMinorTickSpacing(5);
		this.slider.setPaintLabels(true);
		this.slider.setPaintTicks(true);
		this.slider.addChangeListener(this);
		this.add(this.slider);
		
			
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println(this.slider.getValue());
		
	}

}
