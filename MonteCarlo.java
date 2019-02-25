//Santiago Yeomans
//A01251000

import java.util.*;

public class MonteCarlo{
  public static double aproximarPi(int intentos){
    double r         = 0;
    double x         = 0;
    double t         = 0;
    double y         = 0;
    double tiro      = 0;
    double aciertos  = 0;
    double resultado = 0;

    for (int i =0; i<intentos; i++){
      r = Math.random();
      x = - 1 + 2 * r;
      t = Math.random();
      y = - 1 + 2 * t;

      tiro = Math.pow(x,2) + Math.pow(y,2);

      if (tiro <= 1){
        aciertos++;
      }
      else {
      }
    }

    resultado = (aciertos / (double)intentos)  * 4d;
    return (resultado);
  }

  public static void main(String[] args){
    Scanner lector=new Scanner(System.in);
    System.out.print("Cuantos tiros quieres hacer? ");
    int intentos = lector.nextInt();

    System.out.println("El valor aproximado de pi es: " + aproximarPi(intentos));
  }
}
