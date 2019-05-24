import java.util.Arrays;

public class Numerote {

	//Atributos
	private byte numerote [];
	private boolean signo; //Positivo = True, Negativo = False
	
	
	//Constructor Default
	public Numerote() {
		this.numerote = new byte[0];
		this.signo = true;
	}
	
	//Constructor Parametros
	public Numerote(String a) {
		
		if (a.substring(0, 1).equals("-")){
			int n = 1;
			this.numerote = new byte[a.length()-1];
			this.signo = false;
			
			for (int i = numerote.length -1 ; i >= 0; i--) {
				numerote[i] = Byte.parseByte(a.substring(n,n+1));
				n++;
			}
			
		} else {
			int n = 0;
			this.numerote = new byte[a.length()];
			this.signo = true;
			
			for (int i = numerote.length -1 ; i >= 0; i--) {
				numerote[i] = Byte.parseByte(a.substring(n,n+1));
				n++;
			}	
		}
	}
	
	
	//Metodos
	
	//Falta sumar para nuemeros de lenght diferentes y numeros negativos
	public Numerote suma(Numerote a) {
		//Numerote suma = new Numerote();
		byte numerote [] = new byte[0];
		byte numero = 0;
		byte acarreo = 0;
		
		for (int i = 0; i < this.numerote.length; i++) {
			
			numero = (byte) (this.numerote[i] + a.numerote[i] + acarreo);
			
			 if (numero >= 10) {
				 numero = (byte) (this.numerote[i] + a.numerote[i] + acarreo);
				 numerote = Arrays.copyOf(numerote, numerote.length + 1);
				 numerote[i] = (byte) (numero - 10); 
				 acarreo = 1;
				 continue;
				 
			 } else {
				 numero = (byte) (this.numerote[i] + a.numerote[i] + acarreo);
				 numerote = Arrays.copyOf(numerote, numerote.length + 1);
				 numerote[i] = numero;
				 acarreo = 0;
				 continue;
			 }
		}
		//Acumulador de Strings
		String resultado = "";
		for (int i = numerote.length -1; i>= 0; i--) {
			resultado+=numerote[i];
		}
		
		return new Numerote(resultado);
	}
	
	//Falta sumar para nuemeros de lenght diferentes y numeros negativos
	public Numerote resta(Numerote a) {
		byte numerote [] = new byte[0];
		byte numero = 0;
		byte prestamo = 0; 
		boolean var = false; //Para saber cuando se le resta 1 al siguente numero
		
		for (int i = 0; i < this.numerote.length; i++) {
			
			 if (var == false) {
				 prestamo = 0;
			 } else {
				 prestamo = 1;
			 }
			
			numero = (byte) ((this.numerote[i] - prestamo) - a.numerote[i] );
			
			if (numero < 0) {
				var = true;
				numero = (byte) ((this.numerote[i] - prestamo) - a.numerote[i] + 10);
				numerote = Arrays.copyOf(numerote, numerote.length + 1);
				numerote[i] = (byte) (numero); 
				continue;	
			} else {
				var = false;
				numero = (byte) ((this.numerote[i] - prestamo) - a.numerote[i]);
				numerote = Arrays.copyOf(numerote, numerote.length + 1);
				numerote[i] = (byte) (numero);
				continue;	
			}	
			
		}
		//System.out.println(Arrays.toString(numerote));
		String resultado = "";
		for (int i = numerote.length -1; i>= 0; i--) {
			resultado+=numerote[i];
		}
		
		return new Numerote(resultado);
		
	}
	
	
	
	public void multiplicacion() {
		
	}
	
	
	//Metodo para imprimir
	public String toString() {
		String numerote = "";
		if (signo == false) {
			numerote += "-";
		}
		for (int i = this.numerote.length; i>0; i--) {
			numerote += this.numerote[i-1];
		}
		return numerote;
	}
	
	

	
	public static void main(String[] args) {
		/* 1. Ver como se escribe el numerote al revez*/
		Numerote a = new Numerote("641782");
		System.out.println(Arrays.toString(a.numerote));
		System.out.println(a);
		Numerote b = new Numerote("119863");
		System.out.println(Arrays.toString(b.numerote));
		System.out.println(b);
		
		System.out.println("\nSuma");
		System.out.println(a.suma(b));
		
		System.out.println("\nResta");
		System.out.println(a.resta(b));

		
		
	}
}
