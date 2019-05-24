public class EjemploException{

    public void metodoD() throws Exception{ 
        throw new Exception("Ocurrio un error metodo D"); //Aqui se arroja el error   
    }

    public void metodoC(){
        this.metodoD();
    }

    public void metodoB(){
        this.metodoC();
    }

    public void metodoA(){
        this.metodoB();
    }

    public static void main(String[] args) {
            EjemploException  ee = new EjemploException();
            ee.metodoA();
            

    }
}