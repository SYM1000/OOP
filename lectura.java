import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lectura {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("Practica_archivos.txt"));
			String linea;
			
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
			
			br.close();
			System.out.println("La vida es linda");
		}catch(FileNotFoundException error) {
			System.out.println("El archivo no se encontró");
		}catch (IOException error) {
			System.out.println("El error es de tipo I/O");
			
		}
	}

}
