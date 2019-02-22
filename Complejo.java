public class Complejo{

  //Atributos privados de la clase
  private double  real,
                  imaginario;

  //Constructor por default
  public Complejo(){
    this.real = 5;
    this.imaginario = -7;
  }

  public Complejo(double real, double imaginario){
    this.real = real;
    this.imaginario = imaginario;
  }

  //Este es un setter
  public void establecer(double real, double imaginario){
    this.real = real;
    this.imaginario = imaginario;
  }

  public void imprimir(){
    if(imaginario < 0){
    System.out.println(real + " " + imaginario + "i");
    }
    else{
    System.out.println(real + " + " + imaginario + "i");
    }
  }

  public void agregar(double real, double imaginario){
    this.real = this.real + real;
    this.imaginario = this.imaginario + imaginario;
  }

  public void agregar(Complejo b){
    this.real = this.real + b.real;
    this.imaginario = this.imaginario + b.imaginario;
  }

  public Complejo suma(Complejo b){
    return new Complejo(this.real + b.real, this.imaginario + b.imaginario);
  }

  public Complejo resta(Complejo b){
    return new Complejo(this.real - b.real, this.imaginario - b.imaginario);
  }

  public Complejo multiplicacion(Complejo b){
    return new Complejo(this.real * b.real, this.imaginario * b.imaginario);
  }

  public Complejo multiplicacion(double numero){
    return new Complejo (this.real * numero, this.imaginario * numero);
  }

  public Complejo conjugado(){
    return new Complejo(this.real * -1, this.imaginario * -1);
  }
}

public static void main(String[] args) {
  Class
}