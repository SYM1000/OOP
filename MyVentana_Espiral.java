import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyVentana_Espiral extends JFrame{
	
	//Constructor
	public MyVentana_Espiral() { //SIEMPRE en el construcotr ponemos el "SUPER();"
		super("Espiral Orientada a Objetos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//para crear y añadir la clase MyPanelDibujo_Espiral
		MyPanelDibujo_Espiral pd = new MyPanelDibujo_Espiral();
		this.add(pd);
		//para crear y añadir la clase MyPanelContoles_Espiral()
		MyPanelControles_Espiral pc = new MyPanelControles_Espiral(pd); //Punto 1
		this.add(pc,BorderLayout.WEST);
		this.setVisible(true);
		pack();
	}
	
	
	//Metodo Main
	public static void main(String[] args) {
		MyVentana_Espiral ventana = new MyVentana_Espiral();
	}
	
}


/*
Lo que le añadí para que funcionara:

Punto 1: Cuando creo el objeto "MyPanelControles_Espiral" le paso como parametro la clase de donde quier
		que obtenga metodos, ya sea setter o getters

Punto 2: Ingresé como parametro la clase de donde quiero obtener los metodos. Le puse un nombre para 
		identificarla.
		
Punto 3: En lugar de que el atributo de la clase(MyPanelDibujo_Espiral) inicializarlo como un objeto nuevo
		lo que se hace es decirle que la clase que le pase como parametro al momento de crearlo es de donde
		obtendrá los métodos, pero nunca se crea una clase nueva, si no que utiliza una que ya se creó
		
		
	¡Y LISTO...!
*/
