import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class archivos {
	
	private StringTokenizer st;
	
	public static void main(String[] args) {
		try {
			PrintWriter pw =  new PrintWriter(new FileWriter("Practica_archivos.txt"));
			pw.println("Hola mundo");
			pw.println("Estoy Escribiendo un archivo\n");
			pw.println("Aqui te va un for para imprimir");
			
			System.out.println("El programa se ejecutó correctamente");
			
			for (int i = 0; i<10; i++) {
				pw.println("Numero" + i);
			}
			pw.close();
			
		}catch(FileNotFoundException error) {	
			System.out.println("El error es" + error);
			System.out.println("El archivo no se pudo abrir");
		}catch(IOException error) {
			System.out.println("El error es: " + error);
			System.out.println("El error es de tipo I/O");
		}
	}

}
