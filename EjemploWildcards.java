import java.util.ArrayList;

/**
 * ArrayList<Integer> es lo mismo que ArrayList<Number>
 * Tipo de dato Parametrizado
 * 
 * WildCard =  Parametro Parametrizado
 * USAR UN WILD CARD -->  ? [extends superclase] 
 * Nunca dehar una lista sin parametrizar
 * 
 * 
 * PECS
 * 
 * Si es productora pongo extends
 * Si es receptora es super
 * 
 * 
 * el 90% se usa extends
 */




public class EjemploWildcards {

    public static double suma(ArrayList<Number> numeros){
       double res =0.0;
       for (int i = 0; i<numeros.size(); i++) {
            res+=numeros.get(i).doubleValue();
       }
       return res;
    }

    public static void main(String[] args){
       ArrayList<Number> numeros = new ArrayList<>();
       for (int i= 0; i<20; i++){
            numeros.add(i);
       }
       System.out.println(suma(numeros));
    }

    ArrayList<Integer> numeros2 = new ArrayList<>();
       for (int i= 0; i<20; i++){
            numeros2.add(i);
       }
       System.out.println(suma(numeros2));
    }
}