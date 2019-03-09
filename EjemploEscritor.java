import java.io.PrintWriter;

import jdk.jfr.events.FileWriteEvent;

/* Archivos:

Archivo: conjunto de bytes con el objetivo de almancenar informacion de manera permanente
Objetivo: Tener persisntencia en la informacion.

*Tipos*
Acceso secuencial: Se tiene que leer de prinipio a fin
Acceso aleatorio (directo): Se pude ir a una parte en especifico como un arreglo

*Tipos de contenido* -> Si lo abro en el notepad me puedo dar cuenta de la diferencia
-Texto: txt. como texto se pude guardar casi cualquier cosa pero oersaría mucho
-Binario: Un archivo de word, jpg, mov, la gran mayoria


Clases en java para leer archivos:
-BufferReader: para leer
-PrintWriter: para escribir
*/
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploEscritor{
    public static void main(String[] args) {
        try{
        FileWriter fw= new FileWriter("nuevo.txt");
        PrintWriter pw= new PrintWriter(fw);
        pw.println("Este es mi primer archivo de texto creado desde Java");
        pw.println("Espero que funcione correctamente");
        pw.println("Que felicidad si se escribió y no tuve que ver con las ganas :) ");
        pw.close();
        System.out.println("FIN");

        } catch(IOException ex){
            System.out.println("No se puede leer el archivo");
        }
    }
}


