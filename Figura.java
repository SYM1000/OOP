// [modificadores] class ClaseNueva extends ClasePadre forma de crear una clase hija
/*Cuando no es herencia como clinica se dice que es una composicion de... o tiene un...*/
/*Todo objeto viene de object es su super padre*/
/*
Sobrecarga vs Sobreescribir
sobrecarga: 2 metodos con el mismo nombre 
sobreescribir: 2 metodos iguales pero en diferentes clases, no se puede en la misma clase porque java no sabe que hacer 
			si lo pones en la clase hija se sobreescribe
	asi como this.metodo() llama a la clase super.metodo() llama a la clase padre
	
protected es in hibrido entre provado y publico solo clases hija pueden acceder

metodos de clase Object

la herencia es una rewlacion de tipo "Es un ..."
*/

//NO CREAR PAQUETES EN ECLIPSE solo proyectos

//Una interface no puede teener implementacion de metodos, por lo tanto no puede tener un metodo main

public interface Figura{ // ya no es clase
	public double perimetro();/*{
		return 0.0;
	}*/
	
	public double area();/*{
		return 0.0;
	}*/
	
	public double volumen();/*{
		return 0.0;
	}*/

	/*public String toString(){
		return "Clase Figura Abstracta"
	}*/
	
	public static void main(String[] args) {
		Figura[] figuras= {new Figura(), new Rectangulo(6.0,4.0), new Cuadrado(10), new Caja(10.0, 15.3, 20)} 
		for (int i = o; i<figuras.length;i++){
			System.out.println(figuras[i]);
			System.out.println("Perimetro: "+figuras[i].perimetro()); //--> Polimorfismo
			System.out.println("Area: "+figuras[i].area());
			System.out.println("Volumen: "+figuras[i].volumen());
			System.out.println("");
		}
	}
	/*Aqui ya no pueden ir metodos con implementacion no main*/
}