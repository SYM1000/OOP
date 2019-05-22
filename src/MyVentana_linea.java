import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MyVentana_linea extends JFrame {
	
	private String nombre = "Java";
	
	MyVentana_linea(){
		super();
		this.setTitle("Ventana para practicar de: " + this.nombre);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		MyPanelDibujo_linea pd = new MyPanelDibujo_linea();
		this.add(pd);	
		MyPanelControles_linea pc = new MyPanelControles_linea(this,pd); //--> Diego hizó magia aqui <-- Puso el this
		this.add(pc, BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}
	
	
	public void setNombre(String a){
		this.nombre = a;
		this.setTitle("Ventana para practicar " + this.nombre);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public static void main(String[] args) {
		MyVentana_linea ventana = new MyVentana_linea();
	}
	

}
