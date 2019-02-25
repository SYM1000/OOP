import javax.swing.*;
import java.util.*;

public class IntroJava {
  public static void estatusCalificacion(){
    String strCalif = JOptionPane.showInputDialog("Dame un numero");
    int calif=Integer.parseInt(strCalif);

    if(calif<70){
        System.out.println("Reprobado");
    }

    else{
        System.out.println("Aprobado");
    }
  }

  public static void numerosDel1al100(){
    for (int i = 0; i<100; i++){
      System.out.println(i);
    }
  }


  public static void serie(int base){
    for (int i = 0; i<50; i++){
      System.out.print(base*(i+1)+",");
      //No hay problema si se imprime con una coma al final
      //Si se quisiera quitar, se quita con un if
    }
    System.out.println();
  }

  public static int calorias(){
    int caloriasTotales=0;
    Scanner lector=new Scanner(System.in);
    System.out.println("Cuantas comidas realizaste hoy?");
    int numComidas = lector.nextInt();
    for(int i = 0; i<numComidas; i++){
      System.out.println("Cuantas calorias consumiste en tu comida #" + (i+1));
      caloriasTotales+=lector.nextInt();
    }
    return caloriasTotales;
  }

  public static void main(String[] args){
    estatusCalificacion();
    numerosDel1al100();
    serie(7);
    System.out.println("El total de calorias que consumiste es de: " + calorias());
  }
}
