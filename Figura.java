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

*/

//NO CREAR PAQUETES EN ECLIPSE solo proyectos

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
	
	public String toString();/*{
		return "Figura abstracta";
	}*/
	
	/*Aqui ya no pueden ir metodos con implementacion no main*/
}