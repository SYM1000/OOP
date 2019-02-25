public class Habitacion{

  private int numero;
  public static String nombre;
  private int adultos;
  private int infantes;
  private double credito;
  private double cargo;
  private boolean disponible;

public Habitacion(int numero){
  this.numero = numero;
  this.disponible = false;
}

public int getNumero(){
  return this.numero;
}

public boolean getDisponible(){
  return this.disponible;
}

public void checkIn(String nombre, int adultos, int infantes, double credito){
  this.nombre = nombre;
  this.adultos = adultos;
  this.infantes = infantes;
  this.credito = credito;
  this.disponible = true;
}

public boolean checkOut(){
  if (nombre == "" && adultos == 0 && infantes == 0 && disponible) {
    this.disponible = true;
    return this.disponible;

  } else {
    this.disponible = false;
    return this.disponible;
  }
}

public double getTarifa_base(){
  this.cargo = (this.adultos * 350) + (this.infantes * 100);
  return this.cargo;
  }

public boolean realizarCargo(int cargo_extra){
  if ((this.cargo + cargo_extra) <= credito){
    return true;
  } else {
    return false;
    }
  }

public void imprimir(){

  System.out.print(this.numero + ", ");
  System.out.println(this.disponible);
  System.out.println(getNumero());
  System.out.println(getDisponible());
  checkIn("Santiago Y", 2, 4, 10000000);
  System.out.println(this.nombre);
  System.out.println(this.adultos);
  System.out.println(this.infantes);
  System.out.println(this.credito);
  System.out.println(checkOut());
  System.out.println(getTarifa_base());
  System.out.println(realizarCargo(500));
  }

/*
public static void main(String[] args) {
    Habitacion room = new Habitacion(10);
    room.imprimir();
  }
  */
}









/*
public class habitacion

numero int
nombre
adultos int
infantes int
credito double        boucher
cargo  double
disponible boulean


metodos

consructor (numero)   inicializar atributo de numero, marca habitacion como disponible

get numero y disponible
func check in    (nombre, adultos, infantes, credito) inicilaiza los atributos, habitacion no disponible
	/////si hab == true, else hab == false    (Diego quisiera)

func check out   valida habitacion ocupada
	si nombre vacio, otros 0, habitacion =0 disponible, regresa true o false dependiendo de la disponibilidad

func get tarifa_base           cobro por habitacion, adulto -350 miño -100


func realizar cargo             cargo adicional(cantidad)      agrega el cargo al saldo actual    cantidad+, cargo que coincida con credito disponible
		si se pudo == True, no = False


metodo imprimir       todo

sin validar




----------

calss hotel


array habiacion
nombre hotel String


constructor(nombre hotel, habitaciones_totales)
	inicializar todo con 100 las habitaciones

func check in (nombre husped, int adultos, int niños, credito a desear abierto)

	registra al huesped en la primera habitacion disponible y regresa el numero de habitacion
	si el hotel esta lleno, regresa -1

func check out  (recibe el no de habitacion donde se realiza check out) valida que xista la habitacion       true si se pudo

func getTotalTarifaBase    regresa total de ganancias por todas habiitaciones

func realizarCargosHabitacion (no habi, cargo)
	intenta hacer cargo de hab   regres si se pudo o no, simpre y cuaanod la hab estuviera ocupada

func imprimeoCUPACION     IMPRIME Ocupacion en, nombre de hotel e info de las habitaciones ocupadas)
*/
