public class Rectangulo implements Figura{ // Extends es para heredar de clases------ Implements es para interfaces
											//Con implements puedo usar implementar de muchas interfaces, mientras que el extends solo de una clase
	protected double 	largo,
						ancho;
					
	public Rectangulo(){
		this(8.0,2.0);
		/*Es igual a esto
		this.largo=6.0;
		this.ancho=4.0;
		*/
	}
	public Rectangulo(double largo, double ancho){
		this.largo=largo;
		this.ancho=ancho;
	}
	
	public double perimetro(){
		return 2.0*(this.largo+this.ancho);
	}
	
	public double area(){
		return this.largo*this.ancho;
	}
	public double volumen(){
		return 0.0;
	}
	
	public String toString(){
		return "Rectangulo de Largo: " + this.ancho + "y Ancho: " + this.ancho;
	}
	
	public static void main(String[] args){
		Figura[] figuras= {new Rectangulo(), new Caja(), new Rectangulo(6.0,4.0), new Cuadrado(10), new Caja(10.0, 15.3, 20)}; /*new figura(), ya no puedo instanciar figura porque ahora es interface*/
		for(int i=0; i<figuras.length;i++){
			System.out.println(figuras[i]);
			System.out.println("Perimetro: "+figuras[i].perimetro()); //--> Polimorfismo
			System.out.println("Area: "+figuras[i].area());
			System.out.println("Volumen: "+figuras[i].volumen());

			if(figuras[i] instanceof Caja){
				((Caja)figuras[i]).saluda();
			}
			System.out.println();
		}
		// Valido: Figura figura = new Rectangulo();
		
		/*Figura a=new Figura();
		System.out.println(a);
		System.out.println("Perimetro: " +a.perimetro());
		System.out.println("Area: " +a.area());
		System.out.println("Volumen: " +a.volumen());*/
		
		Rectangulo b=new Rectangulo(4.0,5.0);
		System.out.println("Perimetro: " +b.perimetro());
		System.out.println("Area: " +b.area());
		System.out.println("Volumen: " +b.volumen());
		
		Cuadrado d=new Caja(10.0, 15.3, 20.0);
		System.out.println("Perimetro: " + d.perimetro());
		System.out.println("Area: " + d.area());
		System.out.println("Volumen: " + d.volumen());
	}
}

//Un error comun ClassCast Exception

/* Metodo compare to:

	a.compareTo(b);

	0 -> a == b
	>0 -> a>b
	<0 -> a<b
	*/