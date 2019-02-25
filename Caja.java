public class Caja extends Rectangulo{
	protected double alto;
	
	public Caja(double largo, double ancho, double alto){
		super(largo,ancho);
		this.alto=alto;
	}

	//Uso el super solo para metodos cuando se quiere sobreescribir 
	
	public Caja(){
		this(3.0,7.0,9.0);
	}

	public double perimetro(){
		return (8 * this.alto) + (4 * this.largo) + (2 * this.ancho);
	}

	public double area(){
		return 2.0*(this.largo * this.ancho + this.alto*this.largo + this.ancho * this.alto);
	}

	public double volumen() {
		return super.area() * this.alto;
	}

	public String ToString(){
		return "Caja de largo " this.largo + ", ancho " + this.ancho + " y altura " + this.alto;
	}

	public void saluda(){
		return "Hola! Soy una caja feliz :)"
	}



}