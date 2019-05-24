//Santiago Yeomans - A01251000
//Daniel Velázquez - A01636246

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class panelNumerote extends JPanel implements ActionListener{
	
	public Icon ifondo;
	public Numerote numerote;
	public Color miColor = new Color(25, 181, 254);
	public JLabel jlTitulo,
					jlfondo,
					jlNum1,
					jlNum2,
					jlRes,
					jlTxtRes,
					jlValidacion1,
					jlValidacion2,
					jlArchivos,
					jlEntrada,
					jlSalida;
	
	public JTextField tfNum1,
						tfNum2,
						tfAbrir,
						tfSalida;
	
	public JButton btnSuma,
					btnResta,
					btnMultiplicacion,
					btnGenerar;
	
	
	public panelNumerote(Numerote numero) {
		this.numerote = numero;
		this.setPreferredSize(new Dimension(800,600));
		this.setLayout(null);
		this.setBackground(miColor);
		
		//Etiquetas
		this.ifondo = new ImageIcon("fondo.jpg");
		this.jlfondo = new JLabel("", ifondo, JLabel.CENTER);
		this.jlfondo.setBounds(0, 0, this.getWidth(), this.getHeight());
		
		this.jlTitulo = new JLabel("NUMEROTE");
		this.jlTitulo.setBounds( 250, 20, 300, 50);
		this.jlTitulo.setForeground (Color.WHITE);
		this.add(jlTitulo).setFont(new Font("HelveticaBold", Font.BOLD, 50));
		
		this.jlNum1 = new JLabel("Número 1:");
		this.jlNum1.setBounds(200, 125, 300, 50);
		this.jlNum1.setForeground (Color.WHITE);
		this.add(jlNum1).setFont(new Font("HelveticaBold", Font.BOLD, 20));
		
		this.jlNum2 = new JLabel("Número 2:");
		this.jlNum2.setBounds(200, 195, 300, 50);
		this.jlNum2.setForeground (Color.WHITE);
		this.add(jlNum2).setFont(new Font("HelveticaBold", Font.BOLD, 20));
		
		this.jlRes = new JLabel("0 ", SwingConstants.RIGHT);
		this.jlRes.setBounds(200, 435, 400, 40);
		this.jlRes.setOpaque(true);
		this.jlRes.setBackground(Color.WHITE);
		this.add(jlRes).setFont(new Font("HelveticaBold", Font.BOLD, 15));
		
		this.jlTxtRes = new JLabel("Resultado");
		this.jlTxtRes.setBounds( 320, 375, 350, 50);
		this.jlTxtRes.setForeground (Color.WHITE);
		this.add(jlTxtRes).setFont(new Font("HelveticaBold", Font.BOLD, 30));
		
		this.jlValidacion1 = new JLabel();
		this.jlValidacion1.setBounds(340, 155, 250, 40);
		this.jlValidacion1.setForeground (Color.RED);
		this.add(jlValidacion1).setFont(new Font("HelveticaBold", Font.BOLD, 15));
		
		this.jlValidacion2 = new JLabel();
		this.jlValidacion2.setBounds(340, 225, 250, 40);
		this.jlValidacion2.setForeground (Color.RED);
		this.add(jlValidacion2).setFont(new Font("HelveticaBold", Font.BOLD, 15));
		
		this.jlArchivos = new JLabel("Archivos");
		this.jlArchivos.setBounds(100,510,250,40);
		this.jlArchivos.setForeground(Color.WHITE);
		this.add(jlArchivos).setFont(new Font("HelveticaBold", Font.BOLD, 28));
		
		this.jlEntrada = new JLabel("Entrada");
		this.jlEntrada.setBounds(345, 510, 250, 40);
		this.jlEntrada.setForeground(Color.WHITE);
		this.add(jlEntrada).setFont(new Font("HelveticaBold", Font.BOLD, 20));
		
		this.jlSalida = new JLabel("Salida");
		this.jlSalida.setBounds(530, 510, 250, 40);
		this.jlSalida.setForeground(Color.WHITE);
		this.add(jlSalida).setFont(new Font("HelveticaBold", Font.BOLD, 20));
		
		
		//Campos de Texto
		this.tfNum1 =  new JTextField("Escribe Aquí");
		this.tfNum1.addKeyListener(new KeyAdapter() {
			//Validar las entradas del JTextField
			@Override
			public void keyTyped(KeyEvent e) {
				
				char neg = ((char)45);
				String Neg = String.valueOf(neg);
				
				char i = (char) (e.getKeyChar()); 
				//Compara el Valor contra su parte en ASCII
				if( i == 8 || i == 45 || i == 48 || i == 49 || i == 50 || i == 51 || i == 52 || i == 53 || i == 54 || i == 55 || i == 56 || i == 57  ) {
					jlValidacion1.setText("");
				}else {
					e.consume();
					jlValidacion1.setText("Dato Inválido");	
				}
			}		
		});
		this.tfNum1.setBounds(335, 130, 300, 40);
		this.add(tfNum1);
		
		this.tfNum2 =  new JTextField("Escribe Aquí");
		this.tfNum2.addKeyListener(new KeyAdapter() {
			//Validar las entradas del JTextField
			@Override
			public void keyTyped(KeyEvent e) {
				
				char neg = ((char)45);
				String Neg = String.valueOf(neg);
				
				char i = (char) (e.getKeyChar()); 
				
				//Compara el Valor contra su parte en ASCII
				if( i == 8 || i == 45 || i == 48 || i == 49 || i == 50 || i == 51 || i == 52 || i == 53 || i == 54 || i == 55 || i == 56 || i == 57  ) {
					jlValidacion2.setText("");
				}else {
					e.consume();
					jlValidacion2.setText("Dato Inválido");	
				}
			}		
		});
		this.tfNum2.setBounds(335, 200, 300, 40);
		this.add(tfNum2);
		
		this.tfAbrir = new JTextField("Nombre sin .txt");
		this.tfAbrir.setBounds(310, 545, 150, 40);
		this.add(tfAbrir);
		
		this.tfSalida = new JTextField("Nombre sin .txt");
		this.tfSalida.setBounds(490, 545, 150, 40);
		this.add(tfSalida);

		
		//Botones
		this.btnSuma = new JButton("+");
		this.btnSuma.setBounds(275,275,60,60);
		this.add(btnSuma).setFont(new Font("HelveticaBold", Font.BOLD, 20));
		this.btnSuma.addActionListener(this);
		
		this.btnResta = new JButton("-");
		this.btnResta.setBounds(370,275,60,60);
		this.add(btnResta).setFont(new Font("HelveticaBold", Font.BOLD, 20));
		this.btnResta.addActionListener(this);
		
		this.btnMultiplicacion = new JButton("*");
		this.btnMultiplicacion.setBounds(465,275,60,60);
		this.add(btnMultiplicacion).setFont(new Font("HelveticaBold", Font.BOLD, 20));
		this.btnMultiplicacion.addActionListener(this);
		
		this.btnGenerar = new JButton("Generar Archivo");
		this.btnGenerar.setBounds(90,550,150,35);
		this.add(btnGenerar).setFont(new Font("HelveticaBold", Font.PLAIN, 15));
		this.btnGenerar.addActionListener(this);
	
	}
		
		
		


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSuma) {
			Numerote numero1 = new Numerote(this.tfNum1.getText());
			Numerote numero2 = new Numerote(this.tfNum2.getText());
			Numerote Res = numero1.suma(numero2);
			
			this.jlRes.setText(Res.toString() + " ");
				
		}else if (e.getSource() == btnResta) {
			Numerote numero1 = new Numerote(this.tfNum1.getText());
			Numerote numero2 = new Numerote(this.tfNum2.getText());
			Numerote Res = numero1.resta(numero2);
			
			this.jlRes.setText(Res.toString() + " ");
			
		} else if (e.getSource() == btnMultiplicacion) {
			Numerote numero1 = new Numerote(this.tfNum1.getText());
			Numerote numero2 = new Numerote(this.tfNum2.getText());
			Numerote Res = numero1.multiplicacion(numero2);
			
			this.jlRes.setText(Res.toString() + " ");
			
		} else if (e.getSource() == btnGenerar) {
			
			if (( this.tfAbrir.getText().equals("Nombre sin .txt") || this.tfAbrir.getText().equals("")) || ( this.tfSalida.getText().equals("Nombre sin .txt") || this.tfSalida.getText().equals("") ) ) {
				JOptionPane.showMessageDialog(null, "Uno de tus nombres de archivo tiene un error:\nestá en blanco o es igual a \"Nombre sin .txt\" ");
			}else {
				try {
					this.numerote.ejecutaArchivo(this.tfAbrir.getText(), this.tfSalida.getText());
					JOptionPane.showMessageDialog(null, "Se generó el archivo con los resultados correctamente");
					
				} catch (FileNotFoundException  e1) {
					JOptionPane.showMessageDialog(null, "No se encontró el archivo:\n" + e1);
					
				}catch(RuntimeException e1) {
					JOptionPane.showMessageDialog(null, "El archivo está vacio:\n" + e1);
					
				}catch(IOException e1) {
					JOptionPane.showMessageDialog(null, "Error de tipo I/O:\n" + e1);
				}
			
			}
			
		}
		
	}
	
}
