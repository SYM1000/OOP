//My panel controles 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyPanelControles extends JPanel implements ActionListener, ChangeListener, MouseListener{
	
	private JTextField tfNombre;
	private JButton btnNombre,
					btnColor,
					btnGuardar,
					btnAbrir;
	private JRadioButton rbRojo,
						rbVerde,
						rbAzul;
	private MYPanelDibujo pd;
	private JPanel panelColor;
	private JSlider slider;
	
	public MyPanelControles(MYPanelDibujo pd) {
		super();
		this.setPreferredSize(new Dimension(150,600));
		this.pd=pd;
		this.tfNombre=new JTextField(10);
		this.btnNombre=new JButton("Saluda");
		this.btnNombre.addActionListener(this);
		
		this.rbRojo=new JRadioButton("Color Rojo", true);
		this.rbVerde=new JRadioButton("Color Verde");
		this.rbAzul=new JRadioButton("Color Azul");
		ButtonGroup bg = new ButtonGroup();
		bg.add(this.rbRojo);
		bg.add(this.rbVerde);
		bg.add(this.rbAzul);
		
		this.btnColor=new JButton("Cambia el color");
		this.btnColor.addActionListener(this);
		
		this.add(this.tfNombre);
		this.add(this.btnNombre);
		this.add(this.rbRojo);
		this.add(this.rbVerde);
		this.add(this.rbAzul);
		this.add(this.btnColor);
		
		this.panelColor=new JPanel();
		this.panelColor.setPreferredSize(new Dimension(100,100));
		this.panelColor.setBackground(Color.RED);
		this.add(panelColor);
		
		this.slider=new JSlider(JSlider.VERTICAL, 0, 200, 0);
		this.slider.setMajorTickSpacing(50);
		this.slider.setMinorTickSpacing(10);
		this.slider.setPaintTicks(true);
		this.slider.setPaintLabels(true);
		this.slider.addChangeListener(this);
		this.panelColor.addMouseListener(this);
		this.add(this.slider);
		
		this.btnAbrir=new JButton("Abrir documento");
		this.add(this.btnAbrir);
		this.btnAbrir.addActionListener(this);
		
		this.btnGuardar=new JButton("Guardar");
		this.add(this.btnGuardar);
		this.btnGuardar.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent evt) {
		Color tmpColor;
		if(evt.getSource()==btnNombre) {
			this.pd.setNombre(this.tfNombre.getText());
		}else if (evt.getSource()==btnColor) {
			if(this.rbRojo.isSelected()) {
				tmpColor=Color.RED;
			} else if (this.rbVerde.isSelected()) {
				tmpColor=Color.GREEN;
			} else {
				tmpColor=Color.BLUE;
			}
		this.setBackground(tmpColor);
		rbVerde.setBackground(tmpColor);
		rbRojo.setBackground(tmpColor);
		rbAzul.setBackground(tmpColor);
		slider.setBackground(tmpColor);
		
		} else if (evt.getSource()==btnGuardar) {
			JFileChooser fc=new JFileChooser();
			int respArchivo=fc.showSaveDialog(this.pd);
			if (respArchivo==JFileChooser.APPROVE_OPTION) {
				File archivo=fc.getSelectedFile();
				try {
					PrintWriter pw = new PrintWriter(archivo.getAbsolutePath());
					pw.println(this.tfNombre.getText());
					pw.println(this.getBackground().getRGB());
					pw.close();
				}catch(IOException ex) {
					System.out.println("Error: "+ex);	
				}
			
			}
		} else {
			JFileChooser fc=new JFileChooser();
			int respArchivo=fc.showOpenDialog(this.pd);
			if (respArchivo==JFileChooser.APPROVE_OPTION) {
				File archivo=fc.getSelectedFile();
				try {
					BufferedReader br = new BufferedReader(new FileReader(archivo.getAbsolutePath()));
					this.tfNombre.setText(br.readLine());
					int colorNum = Integer.parseInt(br.readLine());
					this.setBackground(new Color(colorNum));
					rbVerde.setBackground(new Color(colorNum));
					rbRojo.setBackground(new Color(colorNum));
					rbAzul.setBackground(new Color(colorNum));
					slider.setBackground(new Color(colorNum));
				}catch(IOException ex) {
					System.out.println("Error: "+ex);	
				}
			}
		}
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		this.pd.setyV(-this.slider.getValue());
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Color colorTmp=JColorChooser.showDialog(this.pd, "Escoge el color del globo del Vamoosh", this.panelColor.getBackground());
		if(colorTmp!=null) {
			this.pd.setColorGlobo(colorTmp);
			this.panelColor.setBackground(colorTmp);
		}
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
	/*
	//Para practicar lo de archivos
	
	//Atributos
	private JFileChooser fc;
	
	//Constructor
	this.fc =  new JFileChooser();
	
	//en el boton de guardar
	int archivo = this.fc.showSaveDialog(this.pd);
	if (archivo == JFileChooser.APPROVE_OPTION) {
		try {
			PrintWriter pw = new PrintWriter(this.fc.getSelectedFile());
			pw.pritln("prueba");
			pw.close();
		}catch(FileNotFoundException error){
			System.out.println("No se encontró el archivo");
		}
	}
	
	//En el boton de abrir
	int archivo = this.fc.showOpenDialog(this.pd);
	if(archivo == JFileChooser.APPROVE_OPTION) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(this.fc.getSelectedFile()));
			br.readLine();
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				
			}
			br.close();
		}catch(FileNotFoundException error) {
			System.out.println("El error es" + error);
		}
	}
	
	
	//Atributos
	 * private JFileChooser fc;
	 * 
	 //Constructor
	  * this.fc = new JFileChooser();
	  * 
	 //En el boton guardar
	  * 
	  * int archivo = this.fc.showSaveDialog(this.pd);
	  * if (archivo == JFileChooser.APPROVEOPTION){
	  * 	try{
	  *
	  * 	PrintWriter pw = new PrintWriter(this.fc.getSelectedFile());
	  * 	pw.println("AL 100");
	  * 	pw.close()
	  * 	} catch(FileNotFoundException e){
	  * 		syso("El error es " + e);
	  * 	}
	  * }
	  * 
	  *En el boton de abrir
	  *
	  *int archivo = this.fc.showOpenDialog(this.pd){
	  *	if (archivo == JFileChooser.APPROVE_DIALOG){
	  *		try{
	  *
	  *		BufferedReader br = new BufferedReader(new FileReader(this.fc.getSelectedFile())); 
	  *		br.readline();
	  *
	  		br.close();
	  *		}
	  *}catch(FileNotFoundException error){
	  *syso("El error es " +  error);
	  *}
	  *	}
	
	
	
	
	
	
	
	
	
	
	*/
}
