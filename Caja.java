public class Caja extends Rectangulo{
	protected double alto;
	
	public Caja(double largo, double ancho, double alto){
		super(largo,ancho);
		this.alto=alto;
	}
	
	public Caja(){
		this(6.0,4.0,8.0);
	}
	public double perimetro(){
		return 4*(alto+ancho+largo);
	}
	public double area(){
		return 2*((this.ancho*this.largo)+(this.ancho*this.alto)+(this.largo*this.alto));
	}
	public double volumen(){
		return this.area()*this.alto;
	}
	public String toString(){
		return"caja de largo: "+this.largo+"ancho: "+this.ancho+"largo: "+this.largo;
	}
	public void saluda(){
		System.out.println("Soy una caja feliz :)");
	}
}