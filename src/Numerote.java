//Santiago Yeomans - A01251000
//Daniel Velázquez - A01636246
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Numerote {

	//Atributos
	private byte numerote [];
	private boolean signo;
	
	
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
	public Numerote suma(Numerote a) {
	    String suma="";
	    int carry=0;
	    Numerote resultado=new Numerote();
	    if(this.signo == a.signo) { //Son del mismo signo
	      if (a.numerote.length<=this.numerote.length){
	        for(int i=0; i<this.numerote.length;i++) {
	          try {
	            suma=Integer.toString((this.numerote[i]+a.numerote[i]+carry)%10)+suma;
	            carry=((this.numerote[i]+a.numerote[i]+carry)/10);
	          }catch(ArrayIndexOutOfBoundsException ex) {
	            suma=Integer.toString((this.numerote[i]+carry)%10)+suma;
	            carry=((this.numerote[i]+carry)/10);
	          }
	        }
	        if(carry!=0) { //Si hay un carry entonces cambia la siguente operacion
	          suma=Integer.toString(carry)+suma;
	        }
	      }else if(this.numerote.length<a.numerote.length) {
	        for(int i=0; i<a.numerote.length;i++) {
	          try {
	            suma=Integer.toString((this.numerote[i]+a.numerote[i]+carry)%10)+suma;
	            carry=((this.numerote[i]+a.numerote[i]+carry)/10);
	          }catch(ArrayIndexOutOfBoundsException e) {
	            //Se hace modulo 10 para así tener el carry de forma correcta
	            suma=Integer.toString((a.numerote[i]+carry)%10)+suma;
	            carry=((a.numerote[i]+carry)/10);
	          }
	        }
	        //Comprueba el estado del signo
	        if(carry!=0) {
	          suma=Integer.toString(carry)+suma;
	        }
	      }
	      resultado=new Numerote(suma);
	      //Se hace la suma pero con el signo negativo
	      if((this.signo && a.signo)==false) {
	        resultado.signo=false;
	      }else {
	        resultado.signo=true;
	      }
	    }else {
	      //Se le llama al método resta para así ahorrar código y hacerlo más sencillo
	      Numerote tmp1 = new Numerote();
	      tmp1 = a;
	      tmp1.signo= true;
	      resultado = this.suma(tmp1);
	    }

	    return resultado;
	  }
	
	
		public Numerote resta(Numerote a) throws NumberFormatException{
		    int carry = 0;
		    String signoResultado = "",
		        res = "";
		    byte[] numMayor = {0},
		        numMenor = {0};
		    //Limpia los ceros sobrantes
		    while(this.toString().charAt(0)=='0' && this.toString().length()>1) {
		      this.numerote = new Numerote(this.toString().substring(1, this.toString().length())).numerote;
		    }
		    //Hace que los 0's sobrantes se deshechen
		    while(a.toString().charAt(0)=='0' && a.toString().length()>1) {
		      a.numerote = new Numerote(a.toString().substring(1, a.toString().length())).numerote;
		    }
		    //Asigna los numeros dependiendo de su length
		    if(this.numerote.length > a.numerote.length) {
		      numMayor = this.numerote;
		      numMenor = a.numerote;
		    }
		    //Si son del mismo length entonces
		    else if(this.numerote.length == a.numerote.length) {
		      for(int i=0; i<this.numerote.length; i++) {
		        if(this.numerote[this.numerote.length-1-i]>a.numerote[a.numerote.length-1-i] ) {
		          numMayor = this.numerote;
		          numMenor = a.numerote;
		          break;
		        } else if (this.numerote[this.numerote.length-1-i]<a.numerote[a.numerote.length-1-i] ) {
		          numMayor = a.numerote;
		          numMenor = this.numerote;
		          break;
		        }
		      }
		    }
		    else {
		      numMayor = a.numerote;
		      numMenor = this.numerote;
		    }
		    //Si los signos son iguales se hace de manera tradicional
		    if(this.signo == a.signo) {
		      for (int i=0; i<numMayor.length;i++) {
		        //Try/Catch para ver si se le quita un dígito al de al lado
		        try {
		          if(numMayor[i] - numMenor[i] - carry >= 0) {
		            res += numMayor[i] - numMenor[i] - carry;
		            carry = 0;
		          }
		          else {
		            res += 10 + numMayor[i] - numMenor[i] - carry;
		            carry = 1;
		          }
		      } catch (ArrayIndexOutOfBoundsException e) {
		        if(carry != 0 && numMayor[i]==0) {
		          res += 10 + numMayor[i] - carry;
		            carry = 1;
		        }
		        else {
		          res += numMayor[i] - carry;
		          carry = 0;
		        }
		      }
		      }
		      //Invierte el resultado para así poder regresarlo de manera más sencilla
		      res = new StringBuilder(res).reverse().toString();
		    //Hace que los 0's sobrantes se borren
		    while(res.charAt(0)=='0' && res.length()>1) {
		      res = res.substring(1, res.length());
		    }

		    }
		    else { //Se llama al método suma
		      if(!this.signo) { //negativo-positivo
		        return this.suma(new Numerote("-"+a.toString()));
		      }
		      else { //Positivo - negativo
		        return this.suma(new Numerote(a.toString()));
		      }
		    }
		  //////////////////////////////////////////////////////////////////////////////////////////////////////
		  if((numMayor == this.numerote && !this.signo) || (numMayor == a.numerote && this.signo)) {
		    signoResultado = "-"; //Determina cuando la multiplicacion es negativa
		  }
		   return new Numerote(signoResultado + res);
		  }
		
	
	public Numerote multiplicacion(Numerote a) {
		Numerote resultado=new Numerote();
	    int carry;
			String renglon="";
			String ceros = "";
			for(int i=0; i<a.numerote.length; i++) {
	      		renglon = "";
	      		carry = 0;
	      		for(int j=0; j<this.numerote.length; j++) {
	      			renglon += (a.numerote[i]*this.numerote[j] + carry)%10;
	      			carry = (a.numerote[i]*this.numerote[j]+carry)/10;

	          }
	        //Pasa el carry al renglon siguiente
	      	renglon += String.valueOf(carry);
	      	resultado = resultado.suma(new Numerote(new StringBuilder(renglon).reverse().toString()+ceros));
	      	ceros += "0"; //Agrega ceros para complementar la suma
	      	}
	      //Asigna los signos dependiendo si los dos numerotes compartes el mismo
				if(this.signo==a.signo) {
					resultado.signo=true;
				}else {
					resultado.signo=false;
				}
			return resultado;
		
	}

	//Metodo para escribir archivos
	public void ejecutaArchivo(String entrada, String salida) throws FileNotFoundException,RuntimeException,IOException{
				
		try{
			BufferedReader br = new BufferedReader(new FileReader(entrada + ".txt"));
			PrintWriter pw = new PrintWriter(new FileWriter (salida + ".txt"));
			
			String linea;
    		StringTokenizer st;
    		String numeroA,
    				numeroB,
    				operacion;
			
			while( ( linea = br.readLine() ) !=null) { 
				
                st=new StringTokenizer(linea);
                numeroA = st.nextToken(",");
                numeroB = st.nextToken(",");
                operacion = st.nextToken(",");
                
                if(operacion.equals("s")) {
                	Numerote numeroteA = new Numerote(numeroA);
                	Numerote numeroteB = new Numerote(numeroB);
                	pw.println(numeroteA.suma(numeroteB));
                	
                }else if (operacion.equals("r")) {
                	Numerote numeroteA = new Numerote(numeroA);
                	Numerote numeroteB = new Numerote(numeroB);
                	pw.println(numeroteA.resta(numeroteB));
                	
                }else if (operacion.equals("m")) {
                	Numerote numeroteA = new Numerote(numeroA);
                	Numerote numeroteB = new Numerote(numeroB);
                	pw.println(numeroteA.multiplicacion(numeroteB));
                	
                }else if (operacion != "s" && operacion != "r" && operacion != "m"){
                	pw.println("Operacion invalida");
                }
                
			}
		
		br.close();
		pw.close();
			
		}catch(FileNotFoundException error){
			throw new FileNotFoundException();
			
		}catch(NullPointerException error) {
			throw new RuntimeException();
			
		}catch(IOException error) {
			throw new IOException();
		}	
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
}
