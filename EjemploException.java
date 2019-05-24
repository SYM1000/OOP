import java.io.PrintWriter;

public class EjemploException{

    public void metodoD() throws Exception{ 
        throw new Exception("Ocurrio un error metodo D"); //Aqui se arroja el error   
    }

    public void metodoC() throws Exception{
        this.metodoD();
    }

    public void metodoB() throws Exception{
        this.metodoC();
    }

    public void metodoA() throws Exception{
        this.metodoB();
    }

    public static void main(String[] args) throws Exception {
        try{
            EjemploException  ee = new EjemploException();
            ee.metodoA();
        } catch(Exception e) {
            System.out.println("Error " +ex);
        }
 
            

    }
}