import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyVentana_Dos extends JFrame {
	
	private String Nombre = "Ingresa Nombre Aqui: ";
	
	public MyVentana_Dos() {
		super();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.Nombre = "Ingresa Nombre Aqui: ";
		this.setTitle(this.Nombre);
		MyPanelControles_Dos pc = new MyPanelControles_Dos(this);
		this.add(pc, BorderLayout.WEST);
		
		MyPanelDibujo_Dos pd = new MyPanelDibujo_Dos(this,pc);
		this.add(pd);
	
		this.pack();
		this.setVisible(true);
	}
	
	
	public void setNombre(String a){
		this.Nombre = a;
		this.setTitle(this.Nombre);
		this.repaint();
		//System.out.println("Setter de nombre");
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public static void main(String[] args) {
		MyVentana_Dos ventana = new MyVentana_Dos();
	}


}



/*
 * Notas:
 * 1. Falta arreglar el dibujo de la lineas
 * 2. Falta hacer que se ponga el nombre de la ventana
 * SOLUCION: Ponerle el this.setTitle(this.nombre); dentro del setter
 * 
 */
