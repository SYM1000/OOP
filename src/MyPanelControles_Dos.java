import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyPanelControles_Dos extends JPanel implements ActionListener, ChangeListener{
	
	//Atributos
	private MyVentana_Dos pv;

	private JRadioButton rbcuadrado,
						 rbcirculo,
						 rblinea;
	private boolean bcuadrado,
					bcirculo,
					blinea;
	private JButton btnforma,
					btnnombre,
					btnguardar,
					btnabrir;
	
	private JTextField tfnombre;
	
	private JSlider slider;
	
	
	

	
	//Constructor
	public MyPanelControles_Dos(MyVentana_Dos ventana) {
		//Basico del panel
		super();
		this.pv = ventana;
		this.setPreferredSize(new Dimension(250,800));
		this.setBackground(Color.WHITE);
		
		this.bcuadrado = false;
		this.bcirculo = false;
		this.blinea = false;
		
		//Para los RadioButtons
		this.rbcuadrado = new JRadioButton("Cuadrado", true);
		this.rbcirculo = new JRadioButton("Circulo");
		this.rblinea = new JRadioButton("Linea");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.rbcuadrado);
		bg.add(this.rbcirculo);
		bg.add(this.rblinea);
		
		this.add(rbcuadrado);
		this.add(rbcirculo);
		this.add(rblinea);
		
		this.btnforma = new JButton("         Seleccionar        ");
		this.btnforma.addActionListener(this);
		this.add(btnforma);
		
		this.tfnombre = new JTextField("Nombre:     ");
		this.add(tfnombre);
		
		this.btnnombre = new JButton("                   Nombrar                  ");
		this.btnnombre.addActionListener(this);
		this.add(btnnombre);
		
		this.btnguardar = new JButton("    GUARDAR    ");
		this.btnguardar.addActionListener(this);
		this.add(btnguardar);
		
		this.btnabrir =  new JButton("    ABRIR    ");
		this.btnabrir.addActionListener(this);
		this.add(btnabrir);
		
		
		//Slider
		this.slider = new JSlider(JSlider.VERTICAL,0,200,0);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		this.slider.addChangeListener(this);
		this.add(slider);
			
		
	}
	
	//Getters 
	public boolean getbCuadrado() {
		return this.bcuadrado;
	}
	
	public boolean getbCirculo() {
		return this.bcirculo;
	}
	
	public boolean getbLinea() {
		return this.blinea;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnforma) {
			if(rbcuadrado.isSelected() == true) {
				this.bcuadrado = true;
				this.bcirculo = false;
				this.blinea = false;
				System.out.println(bcuadrado);
				System.out.println(blinea);
				System.out.println(bcirculo);
				
			}else if(rbcirculo.isSelected() == true){
				this.bcirculo = true;
				this.bcuadrado = false;
				this.blinea = false;
				System.out.println(bcirculo);
				System.out.println(bcuadrado);
				System.out.println(blinea);
				
			} else if(rblinea.isSelected() == true) {
				this.blinea = true;
				this.bcirculo = false;
				this.bcuadrado = false;
				System.out.println(blinea);
				System.out.println(bcirculo);
				System.out.println(bcirculo);
			}
			
		} else if (e.getSource() == btnnombre) {
			pv.setNombre(tfnombre.getText());
			System.out.println("todo bien con " + tfnombre.getText());
			
		}else if(e.getSource() == btnguardar) {
			try {
				
				PrintWriter pw = new PrintWriter(new FileWriter("archivo_dos.txt"));
				pw.println("Segunda interface para practicar GUI");
				pw.println("El nombre es:");
				pw.print(pv.getNombre()); 
				pw.close();
				
			}catch(FileNotFoundException error) {
				System.out.println("El archivo no se encontó");
			}catch(IOException error) {
				System.out.println("El error es " + error);
			}
		} else {
			
		}
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		//this.pd.setExtra(-this.slider.getValue());
		 
		
		
		
	}
}
