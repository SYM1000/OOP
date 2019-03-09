import java.io.*;
import java.util.StringTokenizer;

public class CalculaNomina{

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("horasTrabajadas.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("nomina.csv"));
            String linea;
            StringTokenizer st;
            String nombre,
                    paterno;
            int hrs;
            double tabulador;
            br.readLine(); 
            pw.println("Nombre Completo, Pago");
            while((linea = br.readLine())!=null) {  //todo objeto puedo comparalo con un null y una string es uno
                st=new StringTokenizer(linea);
                nombre =st.nextToken();
                paterno =st.nextToken();
                hrs = Integer.parseInt(st.nextToken());
                tabulador = Double.parseDouble(st.nextToken());
                pw.println(nombre + " " + paterno + ", " + (hrs*tabulador));
        }
            pw.close();
            br.close();
            System.out.println("FIN");

        }catch(FileNotFoundException ex){

        } catch(IOException ex){

        }
    }

}