public class Cuadrado extends Rectangulo{
	
	public Cuadrado(double lado){
		this.largo=lado; // ya estan heredados no necesito super.largo ni super.ancho
		this.ancho=lado;
		/*Tambien se puede:
		super(lado,lado); // Para un constructor si se usa super
		*/
	}
	public Cuadrado(){
		this(4.0);
	}
	
	public String toString(){
		return "Cuadrado de Largo: " + this.ancho + "y Ancho: " + this.ancho;
	}
}