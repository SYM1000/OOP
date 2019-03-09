import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLector{

    public static void main(String[] args) {
    try{
        BufferedReader br = new BufferedReader(new FileReader("nuevo.txt"));
        //br.readLine(); //Regresa la linea que sigue en leerse sino hay mas regresa null
        String linea;
        while((linea = br.readLine())!=null) {  //todo objeto puedo comparalo con un null y una string es uno
            System.out.println(linea);
        }
        br.close(); //Siempre que abro un buffer lo cierro como los parentesis
    } catch(FileNotFoundException e){
        System.out.println("No se localizo el archivo");
        } catch(IOException ex){
            System.out.println("Ocurrio un error de I/O" + ex);
        }
}}

//String Tokenaizer es un constructor para partir un string en pedazos.
