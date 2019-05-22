import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyPanelControles_linea extends JPanel implements ActionListener {
	
	private JLabel etiqueta,
					cor1X,
					cor1Y,
					cor2X,
					cor2Y;
	private JTextField tf1x,
						tf1y,
						tf2x,
						tf2y,
						tfnombre;
	private JButton btnlinea,
					btnnombre,
					btncuadrado,
					btnguardar,
					btnabrir;
	private MyPanelDibujo_linea pd;
	private MyVentana_linea pv;
	
	public MyPanelControles_linea(MyVentana_linea ventana, MyPanelDibujo_linea dibujo){ //---> Diego Hizo magia aquí ("MyVentana_linea ventana") <----
		super();
		
		
		this.setLayout(null); //Para el examen no es necesario usar this.setLayout(null);
		this.setPreferredSize(new Dimension(250,800));
		this.setBackground(Color.WHITE);
		
		
		this.pv=ventana; //---> Diego hizo magia aqui <---
		this.pd = dibujo;
		//pv=new MyVentana_linea();
		//Inicializar todas las etiquetas 
		this.etiqueta = new JLabel("Controles");
		this.etiqueta.setBounds(85, 5, 100, 50); //Parte del setLayout(null);
		this.add(etiqueta);
		
		this.cor1X = new JLabel("Punto 1 en X");
		this.cor1X.setBounds(20, 50, 120, 70); //Parte del setLayout(null);
		this.add(cor1X);
		
		this.cor1Y = new JLabel("Punto 1 en Y");
		this.cor1Y.setBounds(20, 100, 120, 70); //Parte del setLayout(null);
		this.add(cor1Y);
		
		this.cor2X = new JLabel("Punto 2 en X");
		this.cor2X.setBounds(20, 150, 120, 70); //Parte del setLayout(null);
		this.add(cor2X);
		
		this.cor2Y = new JLabel("Punto 2 en Y");
		this.cor2Y.setBounds(20, 200, 120, 70); //Parte del setLayout(null);
		this.add(cor2Y);
		
		//Inicializar todas las JTextField
		this.tf1x = new JTextField ("…");
		this.tf1x.setBounds(110, 75, 90, 20); //Parte del setLayout(null);
		this.add(tf1x);
		
		this.tf1y = new JTextField ("…");
		this.tf1y.setBounds(110, 125, 90, 20); //Parte del setLayout(null);
		this.add(tf1y);
		
		this.tf2x = new JTextField ("…");
		this.tf2x.setBounds(110, 175, 90, 20); //Parte del setLayout(null);
		this.add(tf2x);
		
		this.tf2y = new JTextField ("…");
		this.tf2y.setBounds(110, 225, 90, 20); //Parte del setLayout(null);
		this.add(tf2y);
		
		this.tfnombre = new JTextField("Nombre…");
		this.tfnombre.setBounds(50, 320, 150, 20);
		this.add(tfnombre);
		
		//Inicializar todos los botones
		this.btnlinea = new JButton("Crear Linea");
		this.btnlinea.setBounds(75,265,100,30);
		this.btnlinea.addActionListener(this);
		this.add(btnlinea);
		
		this.btnnombre = new JButton("Cambiar nombre");
		this.btnnombre.setBounds(53, 355, 150, 30);
		this.btnnombre.addActionListener(this);
		this.add(btnnombre);
		
		this.btncuadrado = new JButton("Cuadrado");
		this.btncuadrado.setBounds(53, 410, 90, 30);
		this.btncuadrado.addActionListener(this);
		this.add(btncuadrado);
		
		this.btnguardar = new JButton("GUARDAR");
		this.btnguardar.setBounds(53, 500, 90, 30);
		this.btnguardar.addActionListener(this);
		this.add(btnguardar);
		
		this.btnabrir = new JButton("Abrir");
		this.btnabrir.setBounds(53, 550, 90, 30);
		this.btnabrir.addActionListener(this);
		this.add(btnabrir);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btnnombre) {
			pv.setNombre(this.tfnombre.getText());
			System.out.println("Aprovado " + this.tfnombre.getText());
			this.repaint();	
		} else if (e.getSource() == btnlinea) {
			this.pd.setDibujar(false);
			this.pd.setUnoX(Integer.parseInt(tf1x.getText()));
			this.pd.setUnoY(Integer.parseInt(tf1y.getText()));
			this.pd.setDosX(Integer.parseInt(tf2x.getText()));
			this.pd.setDosY(Integer.parseInt(tf2y.getText()));
			this.pd.repaint();	
		} else if(e.getSource() == btncuadrado) {
				this.pd.setDibujar(true);
				System.out.println("al 100");
		}else if (e.getSource() == btnguardar) {
			//Aqui utilizamos archivos
			try {
				PrintWriter pw = new PrintWriter(new FileWriter("linea.txt"));
				pw.println("Programa creado para estudiar Java");
				pw.println("-----------------------------------");
				pw.println("El nombre es: ");
				pw.println(pv.getNombre());
				pw.println("Las cordenadas del cuadrado son:");
				pw.println(pd.getxCuadrado());
				pw.println(pd.getyCuadrado());
				pw.close();
				System.out.println("El archivo se escribió correctamente");
				
			}catch(FileNotFoundException error) {
				System.out.println("El archivo no se encontró: " + error);
				
			}catch(IOException error) {
				System.out.println("Error de tipo I/O: " + error);
			}
			
		} else if (e.getSource() == btnabrir) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("linea.txt"));
				br.readLine();
				br.readLine();
				br.readLine();
				String linea = br.readLine();
				pv.setNombre(linea);
				
				br.readLine();
				pd.setxCuadrado(Integer.parseInt(linea));
				pd.setyCuadrado(Integer.parseInt(linea));
				br.close();
				System.out.println("El archivo se abró correctamente");
				
			}catch(FileNotFoundException error){
				System.out.println( "El archivo no se encontró" + error);
			}catch(IOException error) {
				System.out.println("Error de tipo I/O" + error);
			}
			
		}
		
		
	}

}
