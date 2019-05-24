import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class esbirir {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter ("PruebaDelBoton.txt"));
			pw.println("1000,2000,s");
			pw.println("333,100,r");
			pw.close();
			System.out.println("todo bien");
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
