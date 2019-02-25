public class Hotel{

  private int habitaciones [];
  private String nombreHotel;

public Hotel(String nombreHotel, int habitaciones){
  this.nombreHotel = nombreHotel;
  this.habitaciones = new int [habitaciones];
}

public void checkIn(String nombre, int adultos, int niños, double credito){
  nombre = nombre;
  adultos = adultos;
  niños = niños;
  credito = credito;
}

public static void main(String[] args) {
  Hotel hotel = new Hotel("nombre del hotel",  100);
  System.out.println(hotel;

}

}








/*
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
